@login
Feature: Login Test
  Login Test

  Background:
    Given user is on login page
    When user logs in with valid credentials

  @validLogin
  Scenario: Valid login credentials
#    When user logs in with valid credentials
    Then Account summary page should be displayed.

  @invalidLogin
  Scenario: Invalid login credentials
#    When user logs in with invalid credentials
    Then Login password are wrong message should be displayed

  @invalidLogin
  Scenario: No login credentials
#    When user logs in with no login credentials
    Then Login password are wrong message should be displayed
