Feature:Calculator Application
	Scenario: Perform addition for two numbers.
	Given a calculator to perform addition
	When input is "15" and "10"
	Then the result is "25"


	Scenario: Perform Subtraction for two numbers.
	Given a calculator to perform subtraction
	When input is "15" and "10"
	Then the result is "5"


	Scenario: Perform Multiplication for two numbers.
	Given a calculator to perform multiplication
	When input is "15" and "10"
	Then the result is "150"


	Scenario: Perform Division for two numbers.
	Given a calculator to perform division
	When input is "50" and "10"
	Then the result is "5"
