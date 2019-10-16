package com.slksoft.web.resources;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.slksoft.entity.Product;
import com.slksoft.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/products")
public class ProductResource {
	private ProductService service;
	@PostConstruct
	public void init() throws IOException{
		service =new ProductService();
	}
	
	@POST
	@Produces({"application/xml","application/json"})
	@Consumes({"application/xml","application/json"})
	public String info(){
		
			log.info("handling request for GET /api/products in text/plain format");
			return "This is the home of /api/products";
		
	}
	public Product addNewProduct(Product product){
		return service.addNewProduct(product);
	}
	@Path("/{product_id}")
	@GET
	@Produces({"application/xml","application/json"})
	//@Consumes({"application/xml","application/json"})
	public Product getOneProduct(@PathParam("product_id")Integer id){
		return service.getProductsById(id);
	}
	
	@GET
	@Produces({"application/xml","application/json"})
	public List<Product> getAllProducts(
	@QueryParam("category")String category,
	@QueryParam("brand") String brand){
		log.info("got {} for category",category);
		log.info("got {} for brand",brand);
		
		if(category!=null && brand!=null){
			return service.getProductsByBrand(brand)
					.stream()
					.filter(p->p.getCategory().equals(category))
					.collect(Collectors.toList());
		}
		
		if(category !=null){
			return service.getProductsByCategory(category);
		}
		if(brand !=null){
			return service.getProductsByBrand(brand);
		}
		
		
		
		return service.getAllProducts();
	}
}
