Feature: Login

  Scenario: Login
    Given the user is on the landing page
    When the user clicks the login link on header
    And the user is logged in
    And the user clicks the login button
    Then the landing home page is displayed
