package com.slksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slksoft.dao.ProductDao;
import com.slksoft.entity.Product;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class ProductService {
	@Autowired
	ProductDao dao;
	public ProductService(){
		log.info("ProductService instantiated");
	}
	public List<Product> getAllProducts(){
		log.info("returning list of products");
		return dao.findAll();
	}

}
