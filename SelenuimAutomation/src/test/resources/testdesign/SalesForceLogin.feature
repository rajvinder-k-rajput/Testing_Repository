Feature: Login Function
  @Smoke
  Scenario: Valid Credentials
    Given user navigate to salesforce login Page
    When user enter the username "abc" and password "123"
    And user click the login button
    Then verify whether the user navigate to the HomePage
    And verify title of the page

  Scenario Outline:  Invalid Credentials
    Given user navigate to salesforce login Page
    When user enter the username "<UserName>" and password "<PassWord>"
    And user click the login button
    Then verify whether the user navigate to the HomePage
    And verify title of the page
    Examples:
      | UserName | PassWord |
      | abc      | 123      |
      | mama     | test     |
      | dada     | welcome  |
