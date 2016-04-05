/**
 *   File Name: DisplayHelper.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */
package com.sqa.nc.util.helpers;

/**
 * DisplayHelper //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class DisplayHelper {

	// Method should display 2 dimensional array nicely formatted on screen
	public static void display2DArray (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			// System.out.println("\t" + matrix[i]);
			System.out.println("");
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
		}
		System.out.println("");
		// call other method
		System.out.println("calling other method");
		for (int i = 0; i < matrix.length; i++) {
			displayArray(matrix[i]);
			System.out.println("");
		}
	}

	// Method should display array nicely formatted on screen
	public static void displayArray (int[] array) {
		// System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}
		System.out.println("");
	}
}
