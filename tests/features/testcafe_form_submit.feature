Feature: As a user I want to submit form at testcafe home page

Background:
  Given User is at testcafe homepage

Scenario Outline:  coba
  When User enter "<Name>" at testcafe page
  And User select radio "<Radio>" at testcafe page
  And User select check "<Check>" at testcafe page
  # And User select list "<List>" at testcafe page
  And User click "Submit" at testcafe page
  Then User can see final result in Result page

  Examples:
  | Name | Radio | Check | List |
  | Value 1 | Mac | Remote | Both |
  | Value 2 | Window | Reusing | Command Line |