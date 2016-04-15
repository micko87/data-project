/**
 *   File Name: MyMathTest.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */
package com.sqa.nc.util.helpers.math;

import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import com.sqa.nc.util.helpers.math.*;

/**
 * MyMathTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
@RunWith (Parameterized.class)
public class MultiplicationTests {

	@Parameters
	public static Object[][] getData () {
		Object[][] data = {
							{ new double[] { 2.0, 3.0, 5.0 }, 30.0 },
							{ new double[] { 5.0 }, 5.0 },
							{ new double[] { 4.0 }, 4.0 },
							{ new double[] { 1.0 }, 1.0 },
							{ new double[] { 3.0 }, 3.0 },
							{ new double[] { 2.0 }, 2.0 }
		};
		return data;
	}

	private double expectedResult;
	private double numbers[];

	public MultiplicationTests (double[] numbers, double expectedResult) {
		super();
		this.numbers = numbers;
		this.expectedResult = expectedResult;
	}

	@Test
	public void testMultNumbers () {
		double actualResult = MyMath.multNumbers(this.numbers);
		String numbersString = Arrays.toString(this.numbers);
		String message = String.format("the product of multiplying all numbers %s together is %.1f", numbersString,
				actualResult);
		System.out.println(message);
		Assert.assertEquals(message, this.expectedResult, actualResult, 0);
	}
	// @Test
	// @Ignore
	// public void testPowerNumber () {
	// double actualResult;
	// double expectedResult = this.expectedResult;
	// double num = this.num;
	// double power = this.power;
	// actualResult = MyMath.powerNumber(num, power);
	// String message = String.format("the result of %.0f to the power of %.0f
	// is %.0f", num, power, actualResult);
	// System.out.println(message);
	// Assert.assertEquals(message, expectedResult, actualResult, 0);
	// }
}
