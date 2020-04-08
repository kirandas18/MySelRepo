Feature: Test Facebook Scenario

	Scenario: Test Login with valid credentials

	Given Open firefox and start application
	When I enter valid username and password
	Then user should be able to login successfully
	 