@JIRA:1003
Feature: Create Account of Facebook
  As a user you need to open facebook home page and do the validations

  Scenario: Closing User registeration page without registering for male
    Given User need to be on facbook login page
    When user enters their first name,last name, Mobile number
    Then user sets a password
    Then user enters a day, month and year of their birth
    Then user selects male
    And closes the browser


    