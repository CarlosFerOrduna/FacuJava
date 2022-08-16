package com.holajdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class MyDataSource {

	private static MyDataSource myDataSource = new MyDataSource();
	private MysqlDataSource mySqlDataSource;

	private MyDataSource() {

		mySqlDataSource = new MysqlDataSource();
		mySqlDataSource.setUrl("jdbc:mysql://localhost/spring?serverTimezone=UTC");
		mySqlDataSource.setUser("root");
		mySqlDataSource.setPassword("");
	}

	public static MyDataSource getInstance() {

		if (myDataSource == null) {

			myDataSource = new MyDataSource();

		}

		return myDataSource;
	}

	public Connection getConnection() throws SQLException {

		return mySqlDataSource.getConnection();
	}

}
