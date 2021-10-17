@smok
Feature: user access files

 As a user, I should be able to access to Files module

  Scenario: user adds file to favorites
    Given user is at the dashboard page
    When user select file module
    And user clicks action button
    And user clicks add to favorites button
    And user clicks on Favorites from side bar
    Then user verify there is selected file
