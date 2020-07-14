package main.java.com.github.jmaillard.testsautomatises.calculator.impl;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {


	@Test
	public void should_get_5_if_add_2_to_3() {
		// GIVEN
		int firstNumber = 2;
		int secondNumber = 3;
		int expected = 5;

		// WHEN
		int result = new Calculator().sum(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}
	
	
	@Test
	public void should_get_minus_1_if_add_2_to_minus_3() {
		// GIVEN
		int firstNumber = 2;
		int secondNumber = -3;
		int expected = -1;

		// WHEN
		int result = new Calculator().sum(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}

	@Test
	public void should_get_minus_1_if_substract_2_to_3() {
		// GIVEN
		int firstNumber = 2;
		int secondNumber = 3;
		int expected = -1;

		// WHEN
		int result = new Calculator().minus(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}
	
	@Test
	public void should_get_5_if_substract_2_to_minus_3() {
		// GIVEN
		int firstNumber = 2;
		int secondNumber = -3;
		int expected = 5;

		// WHEN
		int result = new Calculator().minus(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}

	@Test
	public void should_get_5_if_divide_10_by_2() {
		// GIVEN
		int firstNumber = 10;
		int secondNumber = 2;
		int expected = 5;

		// WHEN
		int result = new Calculator().divide(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void should_get_ERROR_if_divide_10_by_0() {
		// GIVEN
		int firstNumber = 10;
		int secondNumber = 0;
		ArithmeticException expected = new ArithmeticException();

		// WHEN
		int result = new Calculator().divide(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}

	@Test
	public void should_get_6_if_multiply_2_by_3() {
		// GIVEN
		int firstNumber = 2;
		int secondNumber = 3;
		int expected = 6;

		// WHEN
		int result = new Calculator().multiply(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}

	
	@Test
	public void should_get_0_if_multiply_2_by_0() {
		// GIVEN
		int firstNumber = 2;
		int secondNumber = 0;
		int expected = 0;

		// WHEN
		int result = new Calculator().multiply(firstNumber, secondNumber);

		// THEN
		Assert.assertEquals(expected , result);
	}
}
