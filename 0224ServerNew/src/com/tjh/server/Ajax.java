package com.tjh.server;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class Ajax
 */
@WebServlet("/Ajax")
public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajax() {
         userDao = new UserDaoImpl();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	
    	List<User> users = new ArrayList<User>();
    	users = userDao.getAllUsers();
    	resp.getWriter().print(users);
    }

}
