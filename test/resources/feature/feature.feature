Feature: To test the add customer functionlaity
@oneway
  Scenario Outline: To test the submit button1
  Given The user is in Abhibus home pag
  When The user fill in the journey details "<Source>","<Destination>"
    And The user search the buses
    Then The customer should see the Source and destination
    
    Examples:

|Source|Destination|
|Chen|Coim|
|Coim|Bang|
|Bang|Chen|
@oneway @return
Scenario Outline: To test the submit button1
  Given The user is in Abhibus home pag
  When The user fill in the journey details "<Source>","<Destination>"
  And Select return date
    And The user search the buses
    Then The customer should see the Source and destination and return
    
    Examples:

|Source|Destination|
|Chen|Coim|