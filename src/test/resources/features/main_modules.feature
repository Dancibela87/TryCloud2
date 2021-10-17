@smoke
Feature: user access main modules
  As a user,
  I should be access all the main modules of the app.

  Scenario: user verify modules
    Given user is at the dashboard page
    Then user verify modules
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts   |
      | Circles    |
      | Calendar  |
      | Deck      |

