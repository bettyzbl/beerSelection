package com.sogou.imeda.betty.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sogou.imeda.betty.model.BeerExpert;

public class BeerSelect extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6742290049250192119L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// resp.setContentType("text/html");// why resp?
		// PrintWriter pw = resp.getWriter();
		// pw.println("Beer selection:");
		String c = req.getParameter("color");// param name is the same as
												// form-index.jsp:<select
												// name="***">

		BeerExpert be = new BeerExpert();
		List<String> list = be.getBrands(c);

		// resp.setContentType("text/html");
		// PrintWriter pw = resp.getWriter();
		// pw.println("beer selection:<br>");
		// Iterator<String> it = list.iterator();
		// while (it.hasNext()) {
		// pw.println("<br>  try:" + it.next());
		// }

		// 为请求对象增加一个属性，给JSP使用=>styles
		req.setAttribute("styles", list);
		// 为jsp实例化一个请求分派器
		RequestDispatcher view = req
				.getRequestDispatcher("WEB-INF/pages/result.jsp");
		// 使用请求分派器要求容器准备好jsp，并向jsp发送请求和相应
		view.forward(req, resp);
		// pw.println(c);
	}
}
