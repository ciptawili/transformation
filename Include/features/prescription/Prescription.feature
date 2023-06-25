@tag
Feature: Add New Prescription
  User can add new prescription

  @tag1
  Scenario: User can add new regular prescription and choosing prescription
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User open page prescription
   	And User add new regular prescription and choosing prescription
   	Then User success add item from prescription
   	
  @tag1
  Scenario: User can search prescription and choosing prescription
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
   	And User open page prescription
   	And User search prescription test
   	And User choose existing data prescription
   	Then User success add item from prescription