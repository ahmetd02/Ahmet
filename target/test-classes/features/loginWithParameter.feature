Feature: Login as different user

  Scenario: Log in as teacher with parameters
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then  The user should be able to login
    And The welcome message contains "Teacher"

  Scenario: Log in as student with parameters
    Given The user is on the login page
    When The user logs in using "SDETB1@bootflow.academy" and "SDETB1!"
    Then  The user should be able to login
    And The welcome message contains "SDET1"