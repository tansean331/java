package com.tjh.server;

import java.util.List;
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
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        userDao = new UserDaoImpl();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//��ȡ��Ӧjsp�����ǩ��name��ֵ
//    	req.setCharacterEncoding("utf-8");
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");
    	System.out.println(username + " : " + password);
    	User user = new User(null, username, password, null);
		if(userDao.checkUserIsExists(user)) {
			//ת��
			System.out.println("��¼�ɹ�");
			resp.getWriter().print(true);
			return;
		}
		System.out.println("����������˻�");
		// ��һ��session��ֵ
		req.getSession().setAttribute("info", "�����ڴ��˻�");
		//�ض���
		resp.sendRedirect("login.jsp");
    	
    }
}
