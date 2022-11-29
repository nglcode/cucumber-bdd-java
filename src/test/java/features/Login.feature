@tag
Feature: Application Login
  I want to use this template for my feature file
  
  #Background:
#	Given validate the browser
#	When browser is triggered
#	Then check if browser is started

  @WebTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"
    
  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "john-mobile" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"
    
  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    | jenny | abcd | jenny@mail.com | Australia | 55512345 |
    Then Home page is populated
    And Cards displayed are "false"
    
  @SanityTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login into application using examples with username <username> and password <password>
    Then Home page is populated
    And Cards displayed are "false"
    
    Examples:
    |username	|password	|
    |user1		|pass1		|
    |user2		|pass2		|
    |user3		|pass3		|
    |user4		|pass4		|
    
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
