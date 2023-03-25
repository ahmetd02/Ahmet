Feature:Navigate to Menu Parameters

  Background:
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacher"

  Scenario: User navigates to Developers Menu
    #Given The user is on the login page
   # When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    #Then The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"

  Scenario: User navigates to All Posts Menu
    #Given The user is on the login page
    #When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    #Then The welcome message contains "Teacher"
    And The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts"
  @smoke
  Scenario: User navigates to My Account Menu
    #Given The user is on the login page
    #When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    #Then The welcome message contains "Teacher"
    And The user navigates to "My Account" menu
    Then The user should be able to see header as "Dashboard"

  Scenario Outline:User Navigates Different Menu
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    And The user navigates to "<header>" menu
    Then The user should be able to see header as "<title>"

    Examples:
      | userType |password |name|header|title|
      | bootdev@bootflow.academy |Dev123 |Developer|Developers|Filter Profiles by Skill or by Location|
      | teacher@bootflow.academy |Test12345! |Teacher| All Posts |  Posts |
      | SDETB1@bootflow.academy |SDETB1! |Student| My Account |  Dashboard  |

