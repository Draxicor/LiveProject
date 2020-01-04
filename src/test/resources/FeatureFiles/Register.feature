Feature: Registration functionality scenarios

  @Register @One
  Scenario: Verify wheter the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the bellow details
      | FirstName | Ricardo             |
      | LastName  | Nogueira            |
      | Email     | draxicor2@gmail.com |
      | Telephone |          9111111111 |
      | Password  | lolamix             |
    And I select the privacy policy
    And I click the continue button
    Then I should see the user account was created successfully

	@Register @Two
  Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    And I click the continue button
    Then I should see that the User Account is not created
    And I should see the error messages informing the user to fill the mandatory fields
