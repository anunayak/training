package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.training.dao.CustomerDao;
import com.slksoft.training.dao.CustomerDaoJdbcImp;
import com.slksoft.training.entity.Customer;

public class ViewAllCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.read inputs from request
		// Not applicable for this use case
		// 2.call appropriate model method to get model data

		CustomerDao dao = new CustomerDaoJdbcImp();
		List<Customer> list = dao.getAllCustomers();

		// 3. store model data in appropriate scope(request,session,application)
		request.setAttribute("customers", list);
		
		System.out.println("Got "+list.size() +" customers");
		// 4.forward to view(using request-dispatcher)
		request.getRequestDispatcher("/show-customers.jsp").forward(request, response);

	}

}
