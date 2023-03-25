Feature: Negative login test
  @wip @smoke
  Scenario Outline:Negative test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The warning message contains "<message>"
    Examples:
      |  userType|password |message|
      |  teacher@bootflow.academy|Test12345! |message|
      |  teacher@|Test12345! |Lütfen "@" işaretinden sonra gelen kısmı ekleyin. "teacher@", tam bir adres değil.|
      |  teacher@bootflow|Test12345! |Please include a valid email!|
      |  teacher@bootflow.academy|Test12345 |Invalid Credentials!|
