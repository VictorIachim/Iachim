@wip
Feature: Home Page Navigation Feature
	
	@wip
  Scenario Outline: Side Bar Menu
    Given user is on the home page
    Then user has the following <options> in sidebar menu 
    
    Examples:
    	| options |
    	|	Developer Tools |
    	|	Top Leagues |
    	|	Countries |
    	|	Sign In |
