package com.tjh.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.tjh.dao.UserDao;
import com.tjh.dao.UserDaoImpl;
import com.tjh.entity.User;

/**
 * Servlet implementation class Head
 */
@WebServlet("/Head")
public class Head extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Head() {
        userDao = new UserDaoImpl();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.getParameter("print");
    	List<User> users = userDao.getAllUsers();
		req.setAttribute("list", users);
		req.getRequestDispatcher("WEB-INF/webinfo.jsp").forward(req, resp);
    }

}
