Feature: Search

  Scenario Outline: Search
    Given the user is on the landing page
    When the user searches "<searchTerms>"
    And the user clicks the search button
    Then the results are displayed
    Examples:
    |searchTerms|
    |test1      |
    |test2      |
    |test3      |

  Scenario: Close
    And the user closes the browser
