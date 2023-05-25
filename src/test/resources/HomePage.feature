Feature: Resolver assessment home page testing

  Background: navigate to the home page
    Given the user navigates to the home page

  @TC1
  Scenario: verify credentials input
    Then verify if email address and password inputs and the login button are present
    And enter email address "dummy@gmail.com" and password "dummy123$"

  @TC2
  Scenario: verify values in a list group
    Then verify that there are 3 values in the list group
    And verify that the second list item's value is set to "List Item 2"
    And verify that the second list item's badge value is "6"

  @TC3
  Scenario: verify options
    Then verify that "Option 1" is the default selected value
    And select Option 3 from the select list

  @TC4
  Scenario: verify buttons
    Then verify that the first button is enabled and that the second button is disabled

  @TC5
  Scenario: displayed button
    When the user waits for a button to be displayed and click
    Then verify a success message is displayed
    And verify that the button is now disabled

  @TC6
  Scenario: verify values on a grid
    # When the user wants to find the value of any cell on the grid (The method is in BrowserUtils)
    And the user wants to find the value of the cell at coordinates 2 2
    Then verify that the value of the cell is "Ventosanzap"
