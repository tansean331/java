package com.tjh.serverlet;

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
//    	userDao = new UserDao();
//    	System.out.println("userDao");
    }

	/*不管是dopost还是doget都能接收到*/
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu", "root", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(username != null && password != null)
//		{
//			System.out.println(username + "  :  " + password);
//			try {
//				userDao.insert(username, password);
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			userDao.ConnectionClose();
//		}
	}
}
