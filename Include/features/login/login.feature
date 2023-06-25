@tag
Feature: login feature
  User can login in gpos web

  @tag1
  Scenario: User login with valid data
    Given Open GPOS web
    When User login with valid data
    Then User success login
