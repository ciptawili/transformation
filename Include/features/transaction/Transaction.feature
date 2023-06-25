@tag
Feature: End to End Transaction
  User can create transaction

  @tag1
  Scenario Outline: User create transaction general
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
    And User search item <name> and choose the item
    And User choose payment method <paymentMethod> and save order
    Then User success save order

    Examples: 
      | name  | paymentMethod |
      | amox | Debit  |
      | amox	| Cash	|
      
   Scenario Outline: User create transaction general with change customer and change doktor
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User search with customer name test and choose customer
   	And User search doctor DR and choose doctor
    And User search item <name> and choose the item
    And User choose payment method <paymentMethod> and save order
    Then User success save order
    Examples: 
      | name  | paymentMethod |
      | amox | Debit  |
      | amox	| Cash	|
      
   Scenario Outline: User create transaction from existing prescription
   	Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User open page prescription
   	And User choose existing data prescription
   	And User choose payment method <paymentMethod> and save order
    Then User success save order
    Examples: 
      | paymentMethod |
      | Debit  |
      | Cash		|
      
   Scenario Outline: User create transaction from regular transaction and existing prescription
   	Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User search item <name> and choose the item
   	And User open page prescription
   	And User choose existing data prescription
   	And User choose payment method <paymentMethod> and save order
    Then User success save order
    Examples: 
      | name | paymentMethod |
      | amox | Kredit  |
