@Sanity
Feature: User Authentication

  #Background: // if any steps are common means we can moved to backgroung field The background is used to execute the steps before each and every scenario & scenario-outline.
  #Common steps can be moved to background from the scenario, like launching the browser or logging in.
  Background: 
    #Given user should navigate to the application login
    Given User clicks on the login link

  #@reg
  Scenario: Login should be success
    And user enter the username as "ortoni"
    And user enter the password as "Pass1234"
    When User click the login button
    Then Login should be success

  @smoke @reg
  Scenario: Login should not be success
    And user enter the username as "orto"
    And User enter the password as "Pass12"
    When User click the login button
    But Login should fail
