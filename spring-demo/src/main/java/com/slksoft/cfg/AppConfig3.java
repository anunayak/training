package com.slksoft.cfg;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

import com.slksoft.dao.DummyUserDao;
import com.slksoft.dao.JdbcUserDao;
import com.slksoft.dao.UserDao;

@Configuration
@PropertySource("classpath:jdbc-info.properties")

public class AppConfig3 {
	Logger log = Logger.getLogger("com.slksoft.cfg.AppConfig");
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.username}")
	String username;
	@Value("${jdbc.password}")
	String password;
	@Value("${jdbc.driver}")
	String driver;

	@Bean
	public DataSource dataSource(){
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		
		bds.setInitialSize(10);
		bds.setMaxTotal(50);
		bds.setMaxIdle(10);
		bds.setMinIdle(10);
		bds.setMaxWaitMillis(500);
		return bds;
	}
	@Bean
	public DataSource dataSource2(){
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);
		bds.setUsername(username);
		bds.setPassword(password);
		
		bds.setInitialSize(10);
		bds.setMaxTotal(50);
		bds.setMaxIdle(10);
		bds.setMinIdle(10);
		bds.setMaxWaitMillis(500);
		return bds;
	}
	
	
	@Bean
	public UserDao jdbcDao(){
		return new JdbcUserDao();
	}

	}
