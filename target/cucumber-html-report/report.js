$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features.feature");
formatter.feature({
  "line": 1,
  "name": "Update User details and Order T-Shirt",
  "description": "",
  "id": "update-user-details-and-order-t-shirt",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15207806592,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Order T-Shirt and verify Order history",
  "description": "",
  "id": "update-user-details-and-order-t-shirt;order-t-shirt-and-verify-order-history",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User adds T-Shirts to cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "place order after making payment",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user is able to verify order in order history",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceOrder.user_is_on_Home_page()"
});
formatter.result({
  "duration": 13416592044,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.user_adds_T_Shirts_to_cart()"
});
formatter.result({
  "duration": 6243432143,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.place_order_after_making_payment()"
});
formatter.result({
  "duration": 12749750474,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.user_is_able_to_verify_order_in_order_history()"
});
formatter.result({
  "duration": 1525917772,
  "status": "passed"
});
formatter.after({
  "duration": 115462,
  "status": "passed"
});
formatter.after({
  "duration": 74615319,
  "status": "passed"
});
formatter.before({
  "duration": 11505482729,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Update personal information in my account",
  "description": "",
  "id": "update-user-details-and-order-t-shirt;update-personal-information-in-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on Sign In page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on My personal info",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "changes first name as \"edittest\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be able to validate updated information",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyUpdatedDetails.user_is_on_Sign_In_page()"
});
formatter.result({
  "duration": 5303887559,
  "status": "passed"
});
formatter.match({
  "location": "VerifyUpdatedDetails.user_clicks_on_My_personal_info()"
});
formatter.result({
  "duration": 1914527414,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edittest",
      "offset": 23
    }
  ],
  "location": "VerifyUpdatedDetails.changes_first_name_as(String)"
});
formatter.result({
  "duration": 1746462376,
  "status": "passed"
});
formatter.match({
  "location": "VerifyUpdatedDetails.user_should_be_able_to_validate_updated_information()"
});
formatter.result({
  "duration": 47180720,
  "status": "passed"
});
formatter.after({
  "duration": 34211,
  "status": "passed"
});
formatter.after({
  "duration": 2316359581,
  "status": "passed"
});
});