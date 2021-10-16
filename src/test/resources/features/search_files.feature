@ui
Feature: User searches files

  As a user, I should be able to access search any item/ users from the homepage.

  Scenario:
    Given user is at the dashboard page
    And user clicks on magnifier icon
    And user searches files
    Then user Will varify that file is visible