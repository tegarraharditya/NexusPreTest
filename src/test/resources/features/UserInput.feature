@TestCafeExample
Feature: Accepatnce Testing to validate the user input
  In order to validate the user input is
  captured and Thank you message on the 
  User name is displayed

  #Features which are important are labelled as per the below mapping under the column features in the Examples
  # {Remote Support: Support for testing on remote devices, Re-using JS: Re-using existing JavaScript code for testing,
  # Background running: Running tests in background and/or in parallel in multiple browsers, Easy CI : Easy embedding into a Continuous integration system
  # Advance Traffic: Advanced traffic and markup analysis, All: Covers all features, None: does not allow any feature}

  #Have tried TestCafe is captured under experienced column in the examples with the possible values of
  # {Y, y, Yes, YES, N, n, NO, no}

  #Rating for TestCafe in provided under the rating column with the possible values
  #{1 through 10 and N/A for no rating}

  #Interface used is provided under interface column with the possible values of
  #{both, CLI, JavaScript API}


  @UserInput


  Scenario Outline: Validate the Test Cafe Example page
    Given I am on the Test cafe example page "https://devexpress.github.io/testcafe/example/"
    When I enter the "<name>" in Name field
    And I select the "<features>" from list of features which are important to me
    And I check the "<experienced>" check box
    And I provide "<rating>" for TestCafe
    And I select my "<os>" from the list of OS options in radio buttons
    And I select my desired "<interface>"
    And I provide the "<comments>" in the comments section
    And I click on "Submit" button
    Then I verify the "<name>" in Thank you page
    
    Examples: 
      | name          | features                                        | experienced | rating | os      | interface           | comments  |
      | Indiana Jones | Remote Support, Re-using JS, Background running | Y           | 6      | Mac     | JavaScript API      | Very good |
      | Sampath Kumar | Remote Support, Re-using JS                     | Yes         | 3      | Windows | CLI                 | 		   |
      | Tony Stark    | None                                            | No          | N/A    | Linux   | both                | okish     |
      |               | None                                            | no          | N/A    | Mac     |  JavaScript API     | 		   |
      |               | All                                             | Yes         | 9      | Linux   | both                | Pretty Amazing |
