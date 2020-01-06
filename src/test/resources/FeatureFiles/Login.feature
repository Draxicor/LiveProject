Feature: Login functionality scenarios

  @Login @One
  Scenario: Verify wheter the user is able to login with valid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "draxicor2@gmail.com" and Password "lolamix"
    Then I should see that the User is able to login successfully
