package com.tjh.server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjh.dao.UserDao;
import com.tjh.dao.UserDaoImpl;
import com.tjh.entity.User;

/**
 * Servlet implementation class Test
 * @author 86470 
 * @运行在服务端的class
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
    	userDao = new UserDaoImpl();
    }

	/*不管是dopost还是doget都能接收到*/
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
		String m_username = req.getParameter("username");
		if(userDao.checkUserNameIsExists(m_username)){
			resp.getWriter().print("用户名已注册");
		}else {
			resp.getWriter().print("用户名可以注册");
		}
		String username = req.getParameter("from-username");
		String password = req.getParameter("from-password");
		if(username != null && password != null)
		{
			User user = new User(null, username, password, null);
	    	int addOneUser = userDao.addOneUser(user);
	    	if(0 == addOneUser) {
	    		System.out.println("注册失败...");
	    		//停留在当前页面
	    		// 重定向
	    		resp.sendRedirect("index.jsp");
	    	}else {
	    		// 转发到其他页面
	    		req.getRequestDispatcher("login.jsp").forward(req, resp);
	    	}
		}
	}
}
