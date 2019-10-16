package com.slksoft.training;

import java.util.List;

import com.slksoft.training.dao.CustomerDao;
import com.slksoft.training.dao.CustomerDaoJdbcImp;
import com.slksoft.training.entity.Customer;

public class GetAllCustomers {
 public static void main(String[] args){
	 CustomerDao dao=new CustomerDaoJdbcImp();
	 List<Customer> list=dao.getAllCustomers();
	 for (Customer c:list){
		 System.out.println(c);
	 }
 }
}
