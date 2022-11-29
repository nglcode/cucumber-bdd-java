@tag
Feature: Portal Login
  I want to use this template for my feature file
  
  Background:
	Given validate the browser
	When browser is triggered
	Then check if browser is started

	@PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"
    
  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "john-mobile" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"
    
  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    | jenny | abcd | jenny@mail.com | Australia | 55512345 |
    Then Home page is populated
    And Cards displayed are "false"
    
  @PortalTest
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
    
