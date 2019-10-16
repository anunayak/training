package com.slksoft.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	private Integer id;
	private String name;
	private String category;
	private String brand;
	private Double unitPrice;
	private String description;
	private String quantityPerUnit;
	private String picture;
	private Integer discount;

}
