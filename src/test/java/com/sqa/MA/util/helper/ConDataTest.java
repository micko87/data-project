package com.sqa.MA.util.helper;

import java.sql.*;

import org.testng.annotations.*;

public class ConDataTest {
	@Test(dataProvider = "dpMySQL", priority = 1)
	public void amazonTest(Object id, Object name, Object quatity) {
		System.out.println("Test DP with mySQL: " + name);
	}

	@DataProvider
	public Object[][] dpMySQL() throws ClassNotFoundException, SQLException {
		return ConData.evalDatabaseTable("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:8889/sqadb", "root", "root",
				"amazon");
	}

	@DataProvider
	public Object[][] dpPostgres() throws ClassNotFoundException, SQLException {
		return ConData.evalDatabaseTable("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/autodb", "postgres",
				"postgres", "monster");
	}

	@Test(dataProvider = "dpPostgres", priority = 2)
	public void monsterTest(Object id, Object keywords, Object results) {
		System.out.println("Test DP with Postgres: " + keywords);
	}
}