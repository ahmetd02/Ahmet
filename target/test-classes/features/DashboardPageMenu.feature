Feature: Dashboard Page Menu


  Scenario: User should be able to see Dashboard Menu after log in
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |

  @wip
  Scenario: Log in as a specific user
    Given The user is on the login page
    When The user logs in using following credentials
      | userEmail | teacher@bootflow.academy |
      | password  | Test12345!               |
      | message   | Teacher                  |
    Then The user should be able to login
    And The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |
