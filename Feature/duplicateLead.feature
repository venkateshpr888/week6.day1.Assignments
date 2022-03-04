Feature: Testcases using LeafTaps
Background: 
Given Load the application url as 'http://leaftaps.com/opentaps'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login as 'decorativeSubmit' 
And Click on Homepage as 'CRM/SFA'
Scenario: TestCase_DuplicateLead
When Click on Lead 
And Click on Find Lead
And Click Email
Given Enter Email Address as 'venkatesh@gmail.com'
When Click DuplicateLead
Then Lead Duplicated