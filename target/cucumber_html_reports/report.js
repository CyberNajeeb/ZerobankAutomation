$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Test",
  "description": "  Login Test",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid login credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account summary page should be displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.account_summary_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.step({
  "name": "user logs in with invalid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.user_logs_in_with_invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login password are wrong message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.login_password_are_wrong_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "No login credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.step({
  "name": "user logs in with no login credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.user_logs_in_with_no_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login password are wrong message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.StepDefinitions.login_password_are_wrong_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});