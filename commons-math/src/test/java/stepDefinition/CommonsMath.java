package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CommonsMath {
	private static int firstNumber = 0;
	private static int secondNumber = 0;
	private static int thirdNumber = 0;
	private static int fourthNumber = 0;
	private static int result;

	private static double firstDoubleNumber = 0;
	private static double secondDoubleNumber = 0;
	private static double thirdDoubleNumber = 0;
	private static double fourthDoubleNumber = 0;
	private static double resultDouble;

	@Given("^two integer numbers: '(\\d+)' '(\\d+)'$")
	public void two_possitive_integer_numbers(int first, int second) throws Throwable {
		System.out.println("First integer number is: " + first);
		System.out.println("Second integer number is: " + second);
		firstNumber = first;
		secondNumber = second;
	}

	@Given("^two double numbers: '(\\d+.\\d+)', '(\\d+.\\d+)'$")
	public void two_possitive_double_numbers(double first, double second) throws Throwable {
		System.out.println("First double number is: " + first);
		System.out.println("Second double number is: " + second);
		firstDoubleNumber = first;
		secondDoubleNumber = second;
	}

	@Given("^three integer numbers: '(\\d+)', '(\\d+)', '(\\d+)'$")
	public void three_possitive_integer_numbers(int first, int second, int third) throws Throwable {
		System.out.println("First integer number is: " + first);
		System.out.println("Second integer number is: " + second);
		System.out.println("Third integer number is: " + third);
		firstNumber = first;
		secondNumber = second;
		thirdNumber = third;
	}

	@Given("^three double numbers: '(\\d+.\\d+)' , '(\\d+.\\d+)' , '(\\d+.\\d+)'$")
	public void three_possitive_double_numbers(double first, double second, double third) throws Throwable {
		System.out.println("First double number is: " + first);
		System.out.println("Second double number is: " + second);
		System.out.println("Third double number is: " + third);
		firstDoubleNumber = first;
		secondDoubleNumber = second;
		thirdDoubleNumber = third;
	}

	@Given("^four integer numbers: '(\\d+)', '(\\d+)', '(\\d+)', (\\d+)$")
	public void four_possitive_integer_numbers(int first, int second, int third, int fourth) throws Throwable {
		System.out.println("First integer number is: " + first);
		System.out.println("Second integer number is: " + second);
		System.out.println("Third integer number is: " + third);
		System.out.println("Third integer number is: " + fourth);
		firstNumber = first;
		secondNumber = second;
		thirdNumber = third;
		fourthNumber = fourth;
	}

	@Given("^four double numbers: '(\\d+.\\d+)', '(\\d+.\\d+)', '(\\d+.\\d+)', '(\\d+.\\d+)'$")
	public void four_possitive_double_numbers(double first, double second, double third, double fourth)
			throws Throwable {
		System.out.println("First double number is: " + first);
		System.out.println("Second double number is: " + second);
		System.out.println("Third double number is: " + third);
		System.out.println("Fourth double number is: " + fourth);
		firstDoubleNumber = first;
		secondDoubleNumber = second;
		thirdDoubleNumber = third;
		fourthDoubleNumber = fourth;
	}

	@When("^I sum them$")
	public void i_sum_them() throws Throwable {
		result = firstNumber + secondNumber + thirdNumber + fourthNumber;
		System.out.println("The sum of integers is: " + result);
		resultDouble = firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber + fourthDoubleNumber;
		System.out.println("The sum of doubles is: " + resultDouble);
	}

	@When("^I subtract them$")
	public void i_subtract_them() throws Throwable {
		result = firstNumber - secondNumber - thirdNumber - fourthNumber;
		System.out.println("The subtract of integers is: " + result);
		resultDouble = firstDoubleNumber - secondDoubleNumber - thirdDoubleNumber - fourthDoubleNumber;
		System.out.println("The subtract of doubles is: " + resultDouble);
	}

	@Then("^The result of integers is '(\\d+)'$")
	public void the_result_of_integers(int sum) throws Throwable {
		try{
		int expectedResult = sum;
		System.out.println("The expected integer result is: " + expectedResult);
		Assert.assertEquals(expectedResult, result);
		firstNumber = 0;
		secondNumber = 0;
		thirdNumber = 0;
		fourthNumber = 0;
		result = 0;
		} catch (Throwable e) {
			throw e; // rethrow the exception/error that occurred
		}
	}

	@Then("^The result of doubles is '(\\d+.\\d+)'$")
	public void the_result_of_doubles(double sum) throws Throwable {
		double expectedDoubleResult = sum;
		System.out.println("The expected double result is: " + expectedDoubleResult);
		Assert.assertEquals(expectedDoubleResult, resultDouble);
		firstDoubleNumber = 0;
		secondDoubleNumber = 0;
		thirdDoubleNumber = 0;
		fourthDoubleNumber = 0;
		resultDouble = 0;
	}
}
