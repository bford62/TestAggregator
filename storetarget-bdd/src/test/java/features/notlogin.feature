Feature: login feature

  @FunctionalTest @XT-170
  Scenario: attempt to login with no password
    Given users is on the login page
    When users enters incorrect email
    But users does not enter input in password field
    Then users clicks on sign in button
    And theres should be an error stating user should enter password

  @SmokeTest @XT-171
  Scenario: login with invalid credentials
    Given users is on the login page
    When users enters incorrect email
    Then users signs enter incorrect password
    And users clicks on sign in button
    And Theres should be an error, and user should not be granted access

