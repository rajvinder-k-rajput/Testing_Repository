Feature: Key function of HomePage
  Scenario: Search function
    Given user navigate to Amazon HomePage
    When user enter the serach keyword "iPhone"
    And user clicks the search icon
    Then validate the title of the page
  @Execute1
  Scenario: Dropdown values
    Given user navigate to Amazon HomePage
    When user extract the Dropdown values
    And user select the value from the dropdown
    Then user validates the Dropdown values
  @Execute
  Scenario Outline:  Search function with multiple test data
    Given user navigate to Amazon HomePage
    When user enter the serach keyword "<SearchInput>"
    And user clicks the search icon
    Then validate the title of the page
    Examples:
      | SearchInput |
      | iPhone      |
      | mouse       |
      | keyboard    |
  @testing
  Scenario: Mouse Handling
    Given user navigate to Amazon HomePage
    When user clicks on Baby wishlist
    Then Validate the field name
 


