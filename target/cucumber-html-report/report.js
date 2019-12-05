$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features.feature");
formatter.feature({
  "line": 1,
  "name": "Update User details and Order T-Shirt",
  "description": "",
  "id": "update-user-details-and-order-t-shirt",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12802132190,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Order T-Shirt and verify Order history",
  "description": "",
  "id": "update-user-details-and-order-t-shirt;order-t-shirt-and-verify-order-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User adds T-Shirts to cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "place order after making payment",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is able to verify order in order history",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceOrderSteps.registerAccount()"
});
formatter.result({
  "duration": 14703208977,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderSteps.addToCart()"
});
formatter.result({
  "duration": 6699095979,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderSteps.placeOrder()"
});
formatter.result({
  "duration": 12672754486,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: The result of the xpath expression \"//*[@id\u003d\u0027center_column\u0027]/div/text()[11]\" is: [object Text]. It should be an element.\n  (Session info: chrome\u003d78.0.3904.108)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BH7JOQO\u0027, ip: \u0027192.168.43.39\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\hp\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:53278}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 67b7d1ef45947986a6983059e6d68b23\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027center_column\u0027]/div/text()[11]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.getAttribute(Unknown Source)\r\n\tat Pages.Payment.orderNumber(Payment.java:51)\r\n\tat StepDefs.PlaceOrderSteps.placeOrder(PlaceOrderSteps.java:59)\r\n\tat ✽.And place order after making payment(Features.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PlaceOrderSteps.validateOrderHistory()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 437516464,
  "status": "passed"
});
formatter.after({
  "duration": 71031970,
  "status": "passed"
});
formatter.before({
  "duration": 11720078343,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Update personal information in my account",
  "description": "",
  "id": "update-user-details-and-order-t-shirt;update-personal-information-in-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@End2End"
    },
    {
      "line": 10,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Sign In page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User clicks on My personal info",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "changes first name as \"edittest\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be able to validate updated information",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyUpdatedDetailsSteps.signIn()"
});
formatter.result({
  "duration": 6147218231,
  "status": "passed"
});
formatter.match({
  "location": "VerifyUpdatedDetailsSteps.clickPersonalInfo()"
});
formatter.result({
  "duration": 1738531671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edittest",
      "offset": 23
    }
  ],
  "location": "VerifyUpdatedDetailsSteps.editFirstName(String)"
});
formatter.result({
  "duration": 1894280803,
  "status": "passed"
});
formatter.match({
  "location": "VerifyUpdatedDetailsSteps.verifyUpdatedInfo()"
});
formatter.result({
  "duration": 54979388,
  "status": "passed"
});
formatter.after({
  "duration": 34639,
  "status": "passed"
});
formatter.after({
  "duration": 2318274149,
  "status": "passed"
});
});