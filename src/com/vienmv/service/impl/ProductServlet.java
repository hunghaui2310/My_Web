package com.vienmv.service.impl;

import com.vienmv.dao.ProductDao;
import com.vienmv.dao.impl.ProductDaoImpl;
import com.vienmv.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {

    public static final long serialVersionUID = 1L;

    public ProductServlet(){
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int page = 1;
        int record = 5;
        if(request.getParameter("page") != null)
            page = Integer.parseInt(request.getParameter("page"));
        ProductDaoImpl dao = new ProductDaoImpl();
        List<Product> list = dao.getListByPage((page-1)*record,record);

        int noOfRecords = dao.getNoOfRecord();
        int noOfPages = (int)Math.ceil(noOfRecords * 1.0 / record);
        request.setAttribute("productList", list);
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        RequestDispatcher view = request.getRequestDispatcher("product-list.jsp");
        view.forward(request,response);
    }
}
