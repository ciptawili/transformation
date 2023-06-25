@tag
Feature: Search customer
  User can search customer for transaction

  @tag
  Scenario Outline: User can search and choose data customer
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User search with customer name <name> and choose customer
   	Then User success choose customer
   	
   	Examples:
   	| name		|
   	| test 1	|
   	| regular	|
   	| 11			|
   	