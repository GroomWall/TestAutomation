Feature: LinkedIn ure login

  Scenario: Registered user visits his page
    Given I am visiting LinkedIn
    When I am putting all my correct credentials
    Then I successfully logged in