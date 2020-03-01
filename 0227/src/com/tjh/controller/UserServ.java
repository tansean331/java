package com.tjh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tjh.entity.User;
import com.tjh.service.UserService;
import com.tjh.service.UserServiceImpl;

/**
 * Servlet implementation class UserServ
 */
@WebServlet("/UserServ")
public class UserServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService userService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServ() {
        userService = new UserServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//html -> servlet -> service -> dao
		response.setContentType("text/html;charSet=utf-8");
		List<User> allUsers = userService.getAllUser();
		System.out.println(allUsers);
		// 将集合的格式转换成json的格式
		String jsonString = JSON.toJSONString(allUsers,SerializerFeature.WriteDateUseDateFormat);
		response.getWriter().print(jsonString);
	}

}
