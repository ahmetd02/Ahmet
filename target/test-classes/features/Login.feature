@Login
Feature: Devbook log in test
  #Agile story : As a user , I should be able to log in so I can see my dashboard

  Background:
    Given The user is on the login page

  @teacher
  Scenario: Log in as a teacher
    #Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  @student  @smoke @db
  Scenario: Log in as a student
    #Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

   # log in as a developer
  @developer @teacher
  Scenario: Log in as a developer
    #Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login

  @db @SDET @smoke
  Scenario: Login as a SDET
    #Given The user is on the login page
    When The user enters SDET credentials
    Then The user should be able to login



