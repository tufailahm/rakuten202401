Feature: feature to test google search functionality
  Scenario: google search functionality check
    Given user is on search page
    When user enters searchtext
    And clicks on search button
    Then user is navigated to the results page

