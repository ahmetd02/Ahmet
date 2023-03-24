@NavigationMenu
Feature: Navigation menu

  @developer
  Scenario: Navigation to Developers menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    When The user navigates to Developers menu
    Then The user able to see Developers text

  Scenario: Navigation to All Posts menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    When The user navigates to All Posts menu
    Then The user able to see Posts text

  Scenario: Navigation to All Posts menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    When The user navigates to My Account menu
    Then The user able to see Dashboard text