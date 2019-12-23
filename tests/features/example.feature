Feature: As a user I want to aaccess Testcafe Example pages

Background:
  Given user is in example page

@desktop @example @clear @quit
Scenario: User input all data
  When user input all necessary data
  Then thank you page with contributor name will appear