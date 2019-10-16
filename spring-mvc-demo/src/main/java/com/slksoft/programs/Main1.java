package com.slksoft.programs;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.slksoft.cfg.AppConfig;
import com.slksoft.entity.Product;
import com.slksoft.service.ProductService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Main1 {
	public static void main(String[] args){
		AnnotationConfigApplicationContext ctx;
		ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService service=ctx.getBean(ProductService.class);
		List<Product> list=service.getAllProducts();
		log.info("there are {} products.",list.size());
		ctx.close();
		
	}

}
