package com.sqa.MA.util.helper;

import org.testng.annotations.*;

public class ConDataTest {
	@DataProvider
	public Object[][] dp() {
		return ConData.evalDatabaseTable();
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
	};
}
