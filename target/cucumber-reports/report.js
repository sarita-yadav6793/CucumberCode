$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "\r\n//Scenario: Successful Login with Valid Credentials\r\n//Given User is on Home Page\r\n//When User clicks on My Account\r\n//And User enters email id\r\n//Then user is naviagted to create account page\r\n\r\n//Scenario: Successful Account creation with valid details\r\n//Given User is on Create Account page\r\n//When user enter all details\r\n//And Click on Create Account\r\n//Then User should be able to create account",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17919344741,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Successful Order place",
  "description": "",
  "id": "login-action;successful-order-place",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User selects product T-Shirts",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "proceed with order checkout with payment",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Order is placed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceOrder.user_is_on_Home_page()"
});
formatter.result({
  "duration": 18900648468,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.user_selects_product_T_Shirts()"
});
formatter.result({
  "duration": 8138459756,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.add_to_cart()"
});
formatter.result({
  "duration": 8465911803,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.proceed_with_order_checkout_with_payment()"
});
formatter.result({
  "duration": 3823224431,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrder.order_is_placed_successfully()"
});
formatter.result({
  "duration": 1954425483,
  "status": "passed"
});
formatter.after({
  "duration": 2324486387,
  "status": "passed"
});
});