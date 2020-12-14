$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3407005459,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "attempt to login with no password",
  "description": "",
  "id": "login-feature;attempt-to-login-with-no-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@FunctionalTest"
    },
    {
      "line": 2,
      "name": "@XT-139"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters incorrect email",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user does not enter input in password field",
  "keyword": "But "
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "there should be an error stating user should enter password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 4233329518,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_incorrect_email()"
});
formatter.result({
  "duration": 296443670,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_does_not_enter_input_in_password_field()"
});
formatter.result({
  "duration": 32480141,
  "status": "passed"
});
formatter.uri("notlogin.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2405278026,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "attempt to login with no password",
  "description": "",
  "id": "login-feature;attempt-to-login-with-no-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@FunctionalTest"
    },
    {
      "line": 3,
      "name": "@XT-170"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "users is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "users enters incorrect email",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "users does not enter input in password field",
  "keyword": "But "
});
formatter.step({
  "line": 8,
  "name": "users clicks on sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "theres should be an error stating user should enter password",
  "keyword": "And "
});
});