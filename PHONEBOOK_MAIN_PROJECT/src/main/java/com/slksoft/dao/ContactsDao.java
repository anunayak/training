package com.slksoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.slksoft.entity.PhoneBook;



public interface ContactsDao {
	
	@Insert("insert into customers ( name, phone, email, gender, address, city, state, country) values (#{name}, #{phone}, #{email}, #{gender}, #{address}, #{city}, #{state}, #{country}")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void addNewContactServlet(PhoneBook contact);
	public void contactDetailsServlet(PhoneBook contact);
	public void contactListServlet(PhoneBook contact);
	public void deleteContactServlet(PhoneBook contact);
	public void editContactServlet(PhoneBook contact);
	
	
	public List<PhoneBook> getAllContacts();
	public List<PhoneBook> getContactsByFirstName(String firstname);
	public List<PhoneBook> getContactsByLastName(String lastname);

	@Select("select distinct city from contacts")
	public List<String> getAllCity();

	@Select("select distinct country from contacts")
	public List<String> getAllCountry();

	
	
	
	
	
}
