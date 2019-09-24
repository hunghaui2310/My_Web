package com.vienmv.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vienmv.model.AppUser;
@WebServlet(urlPatterns="/admin")
public class welcome extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object obj=session.getAttribute("account");
		AppUser user=(AppUser) obj;
		req.setAttribute("username", user.getUsername());
		req.getRequestDispatcher("/view/admin/view/index.jsp").forward(req, resp);
	}

}
