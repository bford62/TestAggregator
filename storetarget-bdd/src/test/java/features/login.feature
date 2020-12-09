Feature: login feature
  @FunctionalTest @XT-139
  Scenario: attempt to login with no password
    Given user is on the login page
    When user enters incorrect email
    But user does not enter input in password field
    Then user clicks on sign in button
    And there should be an error stating user should enter password

  @SmokeTest @XT-132
  Scenario: login with invalid credentials
    Given user is on the login page
    When user enters incorrect email
    Then user signs enter incorrect password
    And user clicks on sign in button
    And There should be an error, and user should not be granted access

