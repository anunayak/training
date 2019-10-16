package com.slksoft.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.dao.ContactsDao;

import com.slksoft.entity.PhoneBook;



public class ContactsService {

	SqlSessionFactory sqlSessionFactory;

	public ContactsService() throws IOException {
		String resource = "PHONEBOOK_MAIN_PROJECT-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	

	public List<PhoneBook> getAllContacts() {
		try (SqlSession sqlSession = sqlSessionFactory.openSession();) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			return dao.getAllContacts();
		}
	}
	
	public PhoneBook contactDetailsServlet(PhoneBook contact) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession(true);) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			dao.contactDetailsServlet(contact);
			return contact;
		}
	}
	public PhoneBook addNewContactServlet(PhoneBook contact) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession(true);) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			dao.addNewContactServlet(contact);
			return contact;
		}
	}

	public PhoneBook editContactServlet(PhoneBook contact) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession(true);) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			dao.editContactServlet(contact);
			return contact;
		}
	}

	//public void init() {
		
		
	//}

}