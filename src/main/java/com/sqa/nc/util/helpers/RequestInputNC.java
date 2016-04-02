/**
 *   File Name: ReqestingInput.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */
package com.sqa.nc.util.helpers;

import java.util.*;

/**
 * ReqestingInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInputNC {

	private static Scanner scanner;

	// Get a char value from the user
	public static char getChar (String question) {
		System.out.println("ANYTING GOES");
		String input;
		char resultValue;
		scanner = new Scanner(System.in);
		System.out.print(question);
		input = scanner.nextLine();
		resultValue = input.charAt(0);
		return resultValue;
	}

	// Get a char value from the user, must be an acceptable value
	public static char getChar (String question, char... acceptableChar) {
		char resultValue;
		boolean validChar = false;
		String input = null;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = input.charAt(0);
				for (int i = 0; i < acceptableChar.length; i++) {
					if (resultValue == acceptableChar[i]) {
						validChar = true;
					}
				}
				if (!validChar) {
					throw new InvalidAcceptableCharException();
				}
				return resultValue;
			} catch (InvalidAcceptableCharException e) {
				System.out.println("You have not provided an acceptable character (" + input + ")");
			}
		}
	}

	// Get a double value from the user
	public static double getDouble (String question) {
		Double resultValue;
		boolean validInt = false;
		String input = null;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Double.parseDouble(input);
				return resultValue;
			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid double (" + input + ")");
			}
		}
	}

	// Get a int from the user, must be in acceptable range value
	public static int getInt (String question, int... acceptableNumber) {
		int resultValue;
		boolean validInt = false;
		String input = null;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);
				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validInt = true;
					}
				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;
			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
				continue;
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided an acceptable valid int(" + input + ")");
			}
		}
	}

	// Get a int from the user, must be in acceptable range value
	public static int getIntWithRange (String question, int Min, int Max) {
		System.out.println("nothing");
		boolean validIntWithRange = false;
		int resultValue;
		String input = null;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);
				if (resultValue > Min && resultValue < Max) {
					validIntWithRange = true;
				}
				if (!validIntWithRange) {
					throw new InvalidAcceptableIntException();
				}
				return resultValue;
			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid number type (" + input + ")");
				continue;
			} catch (InvalidAcceptableIntException e) {
				System.out.println("You have not provided an acceptable int within range(" + input + ")");
			}
		}
	}

	// Get a String from the user, must be an acceptable value
	public static String getString (String question, String... acceptableWords) {
		String resultValue;
		String input = null;
		boolean validWord = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = input;
				for (int i = 0; i < acceptableWords.length; i++) {
					if (resultValue.trim().equalsIgnoreCase(acceptableWords[i])) {
						validWord = true;
					}
				}
				if (!validWord) {
					throw new InvalidAcceptableWordException();
				}
				return resultValue;
			} catch (InvalidAcceptableWordException e) {
				System.out.println("You have not provided an acceptable valid word (" + input + ")");
			}
		}
	}

	// Get a int from the user, must be in acceptable range value
	public static int getStringWithoutWords (String question, String... InvalidWords) {
		System.out.println("nothing");
		return 0;
	}
	// Create your own helper method that you may find useful
}
