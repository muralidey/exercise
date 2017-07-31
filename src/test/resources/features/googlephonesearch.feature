#Author: murali P
Feature: Search phone iphone on amazon via google

  Scenario: Search for iphone less than £800
    Given I am on google search page
    And I want to search for iphone
    When I see amazon.co.uk link in search results
    And I select the link
    Then I look for larges model on stroage space
    Then print the name, price and URL on the console
    And ensure the price of the model not greather than £800
