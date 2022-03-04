Feature: Testcases using LeafTaps
Background: 
Given Load the application url as 'http://leaftaps.com/opentaps'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login as 'decorativeSubmit' 
And Click on Homepage as 'CRM/SFA'
Scenario: TestCase_EditLead
When Click on Lead 
And Click on Find Lead
Given Change Company Name as 'LEAF TEST'
When Click Submit
Then Changed Company Name