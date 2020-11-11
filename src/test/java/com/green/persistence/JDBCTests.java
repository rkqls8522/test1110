package com.green.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String id = "green";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println(con);
			

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
