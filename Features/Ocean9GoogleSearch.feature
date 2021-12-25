Feature: perform google search

Scenario Outline: simple search

Given I am on google homepage
When I enter sesrch "<term>"
And I click on google search button
Then I receive related search results

Examples:
|term								|
|Quality Assurance	|
|Software Testing		|