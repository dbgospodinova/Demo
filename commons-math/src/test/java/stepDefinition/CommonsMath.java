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
	
	@Given("^two numbers: '(\\d+)', '(\\d+)'$")
	public void two_positive_numbers_first_number_second_number(int first, int second) throws Throwable {
		System.out.println(first);
		System.out.println(second);
		firstNumber = first;
		secondNumber = second;
	}
	
	@Given("^three numbers: '(\\d+)', '(\\d+)', '(\\d+)'$")
	public void three_numbers(int first, int second, int third) throws Throwable {
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		firstNumber = first;
		secondNumber = second;
	    thirdNumber = third;
	}

	@When("^I sum them$")
	public void i_sum_them() throws Throwable {

	}

	@Then("^Their sum should be '(\\d+)'$")
	public void their_sum_should_be_sum(int sum) throws Throwable {
		int expectedResult = sum;
		System.out.println(expectedResult);
		result = firstNumber + secondNumber+thirdNumber;
		System.out.println(result);
		Assert.assertEquals(expectedResult, result);
	}
}
