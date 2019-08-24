package com.cheer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	private String pageContent;

	@Override
	public void init() throws ServletException {
		pageContent = "Hello, this is the first Servlet!";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 设置响应内容类型
		resp.setContentType("text/html");

		// 实际的逻辑是在这里
		PrintWriter out = resp.getWriter();
		out.println("<h1>" + pageContent + "</h1>");
	}
}
