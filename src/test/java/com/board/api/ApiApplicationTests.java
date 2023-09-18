package com.board.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class ApiApplicationTests {

	// MySQL Connector 의 클래스. DB 연결 드라이버 정의
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	// DB 경로
	private static final String URL = "jdbc:mysql://10.200.100.110:3306/example?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "0321";

	@Test
	void contextLoads() throws Exception{
		// DBMS에게 DB 연결 드라이버의 위치를 알려주기 위한 메소드
		Class.forName(DRIVER);
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
