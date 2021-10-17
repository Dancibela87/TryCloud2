@smoke
Feature:user access files
  As a user, I should be able to access to Files module.

  Scenario:  verify users can access to Files module
    Given user is at the dashboard page
    When user select file module
    Then user verify that title is "Files - Trycloud QA”

    Scenario: verify users can select all the uploaded files from the page
      Given user is at the dashboard page
      When user select file module
      And user clicks on checkbox
      Then user verify all files are selected


