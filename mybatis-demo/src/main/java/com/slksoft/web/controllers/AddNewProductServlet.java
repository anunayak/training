package com.slksoft.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.slksoft.entity.Product;
import com.slksoft.service.ProductService;
@WebServlet("/product-form")
public class AddNewProductServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher("WEB-INF/views/product-form.jsp").forward(req, resp);
		resp.setContentType("text/html");
		
	}
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
	Product product=new Product();
	product.setCategory(req.getParameter("category"));
	product.setBrand(req.getParameter("brand"));
	ProductService service = new ProductService();
	service.addNewProduct(product);
	
	req.setAttribute("product", product);
	
	req.getRequestDispatcher("/WEB-INF/views/new-product-details.jsp").forward(req, resp);
	}
}
