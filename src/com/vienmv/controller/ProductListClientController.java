package com.vienmv.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vienmv.dao.impl.ProductDaoImpl;
import com.vienmv.model.Product;
import com.vienmv.service.CategoryService;
import com.vienmv.service.ProductService;
import com.vienmv.service.impl.CategoryServiceImpl;
import com.vienmv.service.impl.ProductServiceImpl;

@WebServlet(urlPatterns = { "/product/list" })
public class ProductListClientController extends HttpServlet {
	ProductService productService = new ProductServiceImpl();
	CategoryService cateService = new CategoryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int page = 1;
		int record = 5;
		if(req.getParameter("page") != null)
			page = Integer.parseInt(req.getParameter("page"));
		ProductDaoImpl dao = new ProductDaoImpl();
		List<Product> list = dao.getAll((page-1)*record,record);

		int noOfRecords = dao.getNoOfRecord();
		int noOfPages = (int)Math.ceil(noOfRecords * 1.0 / record);
		req.setAttribute("productList", list);
		req.setAttribute("noOfPages", noOfRecords);
		req.setAttribute("currentPage", page);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/client/view/product-list.jsp");
		dispatcher.forward(req, resp);
	}

}
