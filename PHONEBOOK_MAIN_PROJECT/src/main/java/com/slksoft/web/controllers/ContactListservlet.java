package com.slksoft.web.controllers;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.PhoneBook;
import com.slksoft.service.ContactsService;


public class ContactListservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 ContactsService service =new 	 ContactsService();
	 List<PhoneBook> list=service.getAllContacts();
	 request.setAttribute("contacts",list);
	 request.getRequestDispatcher("/WEB-INF/views/new-contact-details.jsp");
	 
	
	}

	
	
}
