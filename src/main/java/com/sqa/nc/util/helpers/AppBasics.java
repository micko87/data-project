/**
 *   File Name: AppBasics.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */
package com.sqa.nc.util.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	public static void farewellUser (String username, String appName) {
		System.out.println("Thank you " + username + " for using the " + appName + " Application.");
		System.out.println("Have a great day!");
	}

	public static void main (String[] args) {
		// welcomeUser("NC TEST");
		farewellUser(welcomeUserAndGetUsername("NC TEST"), "NC TEST");
	}

	public static String welcomeUserAndGetUsername (String appName) {
		String username;
		System.out.println("Welcome to the " + appName + " Application.");
		username = RequestInput.getString("Could I get your name please?");
		System.out.println(username);
		int num = RequestInput.getInt("INT PLZ");
		System.out.println(num);
		return username;
	}
}
