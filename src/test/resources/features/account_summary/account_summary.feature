
Feature: Account summary
  As a user, upon authorized login, I want to be able to see my account summary

  @account_summary
  Scenario: Account summary page should have <account types>:
    When user logs in with valid credentials
    Then user verifies the account summary has the following account_types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then user verifies that Credit Accounts table contains following columns
      | Account     |
      | Credit Card |
      | Balance     |


  Scenario: Account summary page title test
    Given user is on login page
    When user logs in with valid credentials
    Then the page title should be <Account summary>

