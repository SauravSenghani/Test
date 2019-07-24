package com.amdosbdd.bdd;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
Calculator calculator;
double result;
	
	
@Given("a calculator to perform addition")
public void a_calculator_to_perform_addition() {
    calculator = new Calculator();
}

@Given("a calculator to perform subtraction")
public void a_calculator_to_perform_subtraction() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("a calculator to perform multiplication")
public void a_calculator_to_perform_multiplication() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("a calculator to perform division")
public void a_calculator_to_perform_division() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("input is {string} and {string}")
public void input_is_and(String firstnum, String secondnum) {
    result = calculator.addition(Double.parseDouble(firstnum),Double.parseDouble(secondnum));
}

@Then("the result is {string}")
public void the_result_is(String expected) {
    assertEquals(Double.parseDouble(expected),result,0.01);
}


}
