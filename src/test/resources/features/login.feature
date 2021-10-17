@smoke
Feature: user loges in
  As a user, I should be able to login.

  Background:
    Given user on the login


  Scenario: verify user login successfully
    When user enter valid username and password
    And user click login button
    Then Verify user launched to the dashboard

  Scenario: verify user login fail with invalid credentials
    When user enter invalid credentials
    And  user click login button
    Then “Wrong username or password.” message should be displayed