@tag
Feature: Search and Add Item
  User can search item and choose the item

  @tag1
  Scenario Outline: User search product and choose the product
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User search item <name> and choose the item
   	Then User success add item to checkout

    Examples: 
      | name  |
      | amox |
      | AMOXICILLIN IFARS 500 MG BOX 10 STR @ 10 TAB |
      | 10011307	|
      
  Scenario: User can't find the item
  	Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User search item with keyword ossa
   	Then User can't see item list