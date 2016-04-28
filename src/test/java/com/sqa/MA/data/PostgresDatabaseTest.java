package com.sqa.MA.data;

import java.sql.*;

import org.testng.annotations.*;

public class PostgresDatabaseTest {
	@Test
	public void f() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");
		Connection dbconn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqadb", "postgres",
				"postgres");
		Statement stmt = dbconn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from person ");

		while (rs.next()) {

			String id = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			String city = rs.getString("city");
			String zip = rs.getString("zip");

			System.out.println("Name:    " + name + "City:    " + city + " Address:   " + address + "zip:   " + zip);
		}

		// Step 5
		rs.close();
		stmt.close();
		dbconn.close();
	}
}
