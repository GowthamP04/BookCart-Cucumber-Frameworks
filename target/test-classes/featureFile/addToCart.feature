@E2E
Feature: Cart Functionality

  Background: 
    #Given user should navigate to the application
    Given User clicks on the login link

  #@clearUp
  Scenario Outline: Add a product to the cart
    And User should login as "<username>" and "<password>"
    And user search a "<book>"
    When User add a book to the cart
    Then the cart badge shouls be updated

    Examples: 
      | username | password | book              |
      | ortoni   | pass1234 | The Simple Wild   |
      | ortonikc | pass1234 | Like a Love Story |
      
      
   #@dev
    #Examples: 
     #| username | password | book       |
      #| ortoni   | pass1234 | Fix Her Up |
