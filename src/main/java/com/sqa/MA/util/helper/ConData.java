/**
 *   File Name: ConData.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 23, 2016
 *
 */

package com.sqa.MA.util.helper;

import java.sql.*;
import java.util.*;

/**
 * ConData //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ConData {

	public static Object[][] mydata = { new Object[] { 1, "camera", 5 }, new Object[] { 2, "phone", 6 },
			new Object[] { 2, "toy", 3 } };

	public static Object[][] evalDatabaseTable(String driverClassString, String databaseStringUrl, String username,
			String password, String tableName) throws ClassNotFoundException, SQLException {

		Object[][] myData;
		ArrayList<Object> myArrayData = new ArrayList<Object>();

		// Object[] item1 = { 1, "camera", 5 };
		// Object[] item2 = { 2, "phone", 6 };
		// Object[] item3 = { 3, "toy", 3 };
		//
		// myArrayData.add(item1);
		// myArrayData.add(item2);
		// myArrayData.add(item3);

		Class.forName(driverClassString);
		Connection dbconn = DriverManager.getConnection(databaseStringUrl, username, password);
		Statement stmt = dbconn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from " + tableName);

		int numOfColumns = rs.getMetaData().getColumnCount();

		while (rs.next()) {

			Object[] rowData = new Object[numOfColumns];

			for (int i = 0; i < rowData.length; i++) {
				rowData[i] = rs.getString(i + 1);
			}

			myArrayData.add(rowData);
		}

		myData = new Object[myArrayData.size()][];
		for (int i = 0; i < myData.length; i++) {
			myData[i] = (Object[]) myArrayData.get(i);

		}

		rs.close();
		stmt.close();
		dbconn.close();

		return myData;

	}

	public static Object[][] evalSpreadTable() {
		return mydata;

	}

	public static Object[][] evalTextTable() {
		return mydata;

	}

}
