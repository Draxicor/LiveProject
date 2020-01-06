Feature: Login functionality scenarios

  @Login @One
  Scenario: Verify wheter the user is able to login with valid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "draxicor2@gmail.com" and Password "lolamix"
    Then I should see that the User is able to login successfully

    @Login @Two
    Scenario: Verify wheter the user is not able to login with invalid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "poopypoo@gmail.com" and Password "huehue"
    Then I should see an error message that the credentials are invalid
    
    @Login @Three
    Scenario: Verify wheter the user is not able to login without providing credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "" and Password ""
    Then I should see an error message that the credentials are invalid
    
    @Login @Four
    Scenario: Verify if the user can reset the forgotten password
    Given I launch the application
    And I navigate to Account Login page
    When I reset the forgotten password for email "draxicor2@gmail.com"
    Then I should see a message informing the User that data information related to reseting password have been sent to email address 
  
    