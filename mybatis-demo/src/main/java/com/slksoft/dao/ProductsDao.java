package com.slksoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.slksoft.entity.Product;

public interface ProductsDao {

	// CRUD OPERATIONS

	@Insert("INSERT INTO products(category,brand) VALUES (#{category},#{brand}")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void addNewProduct(Product product);

	public Product getProductById(Integer id);

	public void updateProduct(Product product);

	public void deleteProductById(Integer id);

	// QUERIES

	@Select("select  category,  brand from products")
	public List<Product> getAllProducts();

	@Select("select * from products where brand=#{brand}")
	@Results({ @Result(column = "quantity_per_unit", property = "quantityPerUnit"),
			@Result(column = "unit_price", property = "unitPrice"), })
	public List<Product> getProductsByBrand(String brand);

	@Select("select * from products where category=#{category}")
	@Results({ @Result(column = "quantity_per_unit", property = "quantityPerUnit"),
			@Result(column = "unit_price", property = "unitPrice"), })
	public List<Product> getProductsByCategory(String category);

	@Select("select distinct brand from products")
	public List<String> getAllBrands();

	@Select("select distinct category from products")
	public List<String> getAllCategories();
}