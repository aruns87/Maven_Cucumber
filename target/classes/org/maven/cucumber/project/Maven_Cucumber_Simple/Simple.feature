#Author: your.email@your.domain.com
@tag
Feature: To test the login functionality of guru bank

  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in guru99 bank login page
    When The user enters the valid username and password
    And The user clicks on submit button
    Then The user should be in managers home page

  @tag2
  Scenario: Add new customer in guru99 bank
    Given The user is in guru99 new customer page
    When The basic details of the customer with mandatory fields is filled
    And The user clicks on new user submit button
    Then The user should allowed to enroll as new customer

