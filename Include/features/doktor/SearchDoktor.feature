@tag
Feature: Search and choose doktor
  User can search and choose doktor

  @tag1
  Scenario Outline: User can search and choose doktor
    Given Open GPOS web
   	And User login and success
   	When User open menu pos
    And User search doctor <keyword> and choose doctor
    Then Success search and choose doctor
    
    Examples:
    | keyword		|
    | DR tes		|
    | NEWDR1				|
    | 021				|