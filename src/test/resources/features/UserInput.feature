@TestCafeExample
Feature: Accepatnce Testing to validate the user input
  In order to validate the user input is
  captured and Thank you message on the 
  User name is displayed

  #Features which are important are labelled as per the below mapping
  # {Remote Support: Support for testing on remote devices, Re-using JS: Re-using existing JavaScript code for testing,
  # Background running: Running tests in background and/or in parallel in multiple browsers, Easy CI : Easy embedding into a Continuous integration system
  # Advance Traffic: Advanced traffic and markup analysis}
  @tag1
  Scenario Outline: Validate the Test Cafe Example page
    Given I am on the Test cafe example page "https://devexpress.github.io/testcafe/example/"
    When I enter the  "<name>" in Name field
    And I select the "<features>" from list of features which are important to me
    And I check the "<experienced>" check box
    And I provide "<rating>" for TestCafe
    And I select my "<os>" from the list of OS options in radio buttons
    And I select my desired "<interface>"
    And I provide the "<comments>" in the comments section
    And I click on "Submit" button
    Then I verify the "<name>" in Thank you page
    
    Examples: 
      | name          | features                                        | experienced | rating | os      | interface | comments  |
      | Sampath Kumar | Remote Support, Re-using JS, Background running | y           |      8 | Mac     | both      | Very good |
      | Peter Parker  | Remote Support, Re-using JS                     | N           | N/A    | Windows | CLI       | 		     |
      | Tony Stark    | None                                            | y           |      6 | Linux   | both      | okish     |
      | Thor          | All                                             | N           | N/A    | Linux   | both      | 		     |
