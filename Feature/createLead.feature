Feature: Testcase using LeafTaps
Background: 
Given Load the application url as 'http://leaftaps.com/opentaps'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login as 'decorativeSubmit' 
And Click on Homepage as 'CRM/SFA'

Scenario Outline: TestCase2_createLead
Given Enter Company Name as <company>
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
When Enter following functions
Then print following
Examples:
|company|firstname|lastname| 
|'TestLeaf'|'venkatesh'|'Ravi'|
