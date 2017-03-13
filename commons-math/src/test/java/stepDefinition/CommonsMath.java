package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CommonsMath {
	private static int firstNumber=0;
	private static int secondNumber=0;
	private static int thirdNumber=0;
	private static int result;
	
	private static double firstDoubleNumber=0;
	private static double secondDoubleNumber=0;
	private static double thirdDoubleNumber=0;
	private static double resultDouble;
	
	@Given("^two integer numbers: '(\\d+)', '(\\d+)'$")
	public void two_possitive_integer_numbers(int first, int second) throws Throwable {
		System.out.println(first);
		System.out.println(second);
		firstNumber = first;
		secondNumber = second;
	}
	
	@Given("^two double numbers: '(\\d+)', '(\\d+)'$")
	public void two_possitive_double_numbers(double first, double second) throws Throwable {
		System.out.println(first);
		System.out.println(second);
		firstDoubleNumber = first;
		secondDoubleNumber = second;
	}
	
	@Given("^three integer numbers: '(\\d+)', '(\\d+)', '(\\d+)'$")
	public void three_possitive_integer_numbers(int first, int second, int third) throws Throwable {
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		firstNumber = first;
		secondNumber = second;
	    thirdNumber = third;
	}
	
	@Given("^three double numbers: '(\\d+)', '(\\d+)', '(\\d+)'$")
	public void three_possitive_double_numbers(double first, double second, double third) throws Throwable {
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		firstDoubleNumber = first;
		secondDoubleNumber = second;
	    thirdDoubleNumber = third;
	}

	@When("^I sum them$")
	public void i_sum_them() throws Throwable {

	}

	@Then("^The result of integers is '(\\d+)'$")
	public void the_sum_of_integers(int sum) throws Throwable {
		int expectedResult = sum;
		System.out.println(expectedResult);
		result = firstNumber + secondNumber+thirdNumber;
		System.out.println(result);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Then("^The result of doubles is '(\\d+)'$")
	public void the_sum_of_doubles(double sum) throws Throwable {
		double expectedResult = sum;
		System.out.println(expectedResult);
		result = firstNumber + secondNumber+thirdNumber;
		System.out.println(result);
		Assert.assertEquals(expectedResult, resultDouble);
	}
}
