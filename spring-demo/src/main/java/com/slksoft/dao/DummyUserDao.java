package com.slksoft.dao;

import org.springframework.stereotype.Component;

@Component("dummyDao")
public class DummyUserDao implements UserDao {
	public int count() {
		return 1000000;
	}

}
