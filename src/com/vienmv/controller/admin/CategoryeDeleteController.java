package com.vienmv.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vienmv.service.CategoryService;
import com.vienmv.service.impl.CategoryServiceImpl;

@WebServlet(urlPatterns = { "/admin/category/delete" })
public class CategoryeDeleteController extends HttpServlet {
	CategoryService cateService = new CategoryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		cateService.delete(Integer.parseInt(id));
		
		resp.sendRedirect(req.getContextPath() + "/admin/category/list");
	}

}
