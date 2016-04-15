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
public class MyMathTest {

	@Parameters
	public static Object[][] getData () {
		Object[][] data = {
							{ 2.0, 2.0, 4.0 },
							{ 5.0, 2.0, 25.0 },
							{ 4.0, 3.0, 64.0 },
							{ 1.0, 0, 1.0 },
							{ 3.0, 1.0, 3.0 },
							{ 2.0, 1.5, 4.0 }
		};
		return data;
	}

	private double expectedResult;
	private double num;
	private double power;

	public MyMathTest (double num, double power, double expectedPowerResult) {
		super();
		this.num = num;
		this.power = power;
		this.expectedResult = expectedPowerResult;
	}

	@Test
	@Ignore
	public void test () {
		double result = 0;
		MyMath myMath = new MyMath();
		myMath.add(49);
		result = myMath.getTotal();
		System.out.println(result);
		myMath.div(2);
		result = myMath.getTotal();
		System.out.println(result);
		myMath.mult(5);
		result = myMath.getTotal();
		System.out.println(result);
		myMath.sub(3);
		result = myMath.getTotal();
		System.out.println(result);
		myMath.reset();
		result = myMath.getTotal();
		System.out.println(result);
		myMath.displayOperations(3);
	}

	@Test
	@Ignore
	public void testDivideNumbers () {
		System.out.println("divide numbers " + MyMath.divideNumbers(200, 5));
	}

	@Test
	@Ignore
	public void testHasCleanDivision () {
		System.out.println(" clean " + MyMath.hasCleanDivision(10, 5));
		System.out.println(" not clean " + MyMath.hasCleanDivision(12, 5));
	}

	@Test
	@Ignore
	public void testMultNumbers () {
		System.out.println("mult numbers " + MyMath.multNumbers(1, 2, 3, 4, 5));
	}

	@Test
	public void testPowerNumber () {
		double actualResult;
		double expectedResult = this.expectedResult;
		double num = this.num;
		double power = this.power;
		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("the result of %.0f to the power of %.0f is %.0f", num, power, actualResult);
		System.out.println(message);
		Assert.assertEquals(message, expectedResult, actualResult, 0);
	}
}
