package com.tjh.server;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjh.dao.UserDao;
import com.tjh.dao.UserDaoImpl;
import com.tjh.entity.User;

/**
 * Servlet implementation class LoginToWebinfo
 */
@WebServlet("/LoginToWebinfo")
public class LoginToWebinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginToWebinfo() {
        userDao = new UserDaoImpl();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> users = userDao.getAllUsers();
		req.setAttribute("list", users);
		//System.out.println(users);
		req.getRequestDispatcher("WEB-INF/webinfo.jsp").forward(req, resp);
	}
}
