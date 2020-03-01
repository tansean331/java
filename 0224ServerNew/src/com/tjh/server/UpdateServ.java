package com.tjh.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjh.dao.UserDao;
import com.tjh.dao.UserDaoImpl;
import com.tjh.entity.User;

/**
 * Servlet implementation class UpdataServ
 */
@WebServlet("/UpdateServ")
public class UpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao;
    private int userId;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServ() {
        userDao = new UserDaoImpl();
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		if(id != null)
		{
			userId = Integer.parseInt(id);
	    	System.out.println(userId);
	    	req.getSession().setAttribute("id", userId);
			resp.sendRedirect("update.jsp");
		}
//		//重定向
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if(username != null && password != null)
		{
	    	int updataOneUser = userDao.updataID(userId, username, password, null);
	    	if(0 == updataOneUser) {
	    		System.out.println("修改失败...");
	    		//停留在当前页面
	    		// 重定向
	    		resp.sendRedirect("Head");
	    	}else {
	    		// 转发到其他页面
	    		resp.sendRedirect("Head");
	    	}
		}
    	
//    	int deleteUserById = userDao.removeUser(userId);
//    	resp.sendRedirect("Head");
	}

}
