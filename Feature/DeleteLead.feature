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
And Click phonenumber
Given Enter PhoneNumber as '99'
When Click Find
And  Capture the lead
And Click DeleteLead
Then confirm Record Deleted