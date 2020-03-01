package com.tjh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tjh.entity.User;
import com.tjh.service.UserService;
import com.tjh.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
   
	
    public LoginServ() {
    	userService = new UserServiceImpl();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charSet=utf-8");
		String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	System.out.println(username + " : " + password);
    	User user = new User(null, username, password, null);
		if(userService.login(user)) {
			response.getWriter().print(true);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
