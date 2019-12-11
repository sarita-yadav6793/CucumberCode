Feature: Update User details and Order T-Shirt

Background: User is Logged In
 Given User navigate to login page
 When User submits username and password
 Then User is able to login

@End2End
Scenario: Order T-Shirt and verify Order history
	Given User search for Tshirt
	When User adds T-Shirts to cart 
	And place order after making payment
	Then user is able to verify order in order history

@End2End	@SmokeTest
Scenario: Update personal information in my account
    Given User navigate to personal info
    When User changes first name as "edittest"
    Then User should be able to validate updated information