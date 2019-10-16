package com.slksoft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import lombok.Setter;
@Repository("jdbcDao")
@Setter
public class JdbcUserDao implements UserDao {
	private String driver;
	private String url;
	private String username;
	private String password;
	private Connection connection;
	@Autowired(required = false)
//	@Qualifier("h2DataSource2")
	private DataSource dataSource;

	// private DataSource dataSource;
	private Connection createConnection() throws Exception {
		// ask spring to inject an objects of type DataSource ,if found in
		// container
		//required=false means that spring should not throw an exception when dependency is not satisfied.

		if (dataSource != null) {
			return dataSource.getConnection();
		}
		if (connection != null && connection.isClosed() == false) {
			return connection;
		}
		Class.forName(driver);
		return DriverManager.getConnection(url, username, password);
	}

	@Override
	public int count() {
		String sql = "select count(*) from users";
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();) {
			rs.next();
			return rs.getInt(1);
		} catch (Exception e) {

			throw new RuntimeException(e);
		}
	}

}
