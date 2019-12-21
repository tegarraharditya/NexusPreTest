Feature: As a user I want to aaccess Testcafe Example pages

Background:
  Given user is in example page

@desktop @example @clear @quit
Scenario: Input name
  When user input name in Your Name field
  Then user will see name is filled
