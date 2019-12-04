Feature: Update User details and Order T-Shirt

Scenario: Order T-Shirt and verify Order history
	Given User is on Home page
	When User adds T-Shirts to cart 
	And place order after making payment
	Then user is able to verify order in order history
	
Scenario: Update personal information in my account
    Given User is on Sign In page
    When User clicks on My personal info
    And  changes first name as "edittest"
    Then User should be able to validate updated information