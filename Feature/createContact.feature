Feature: Testcases using LeafTaps
Background: 
Given Load the application url as 'http://leaftaps.com/opentaps'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login as 'decorativeSubmit' 
And Click on Homepage as 'CRM/SFA'

Scenario Outline: TestCase1_CreateContact
When Click Contacts 
And Click Create Contacts
Given First Name as <Fname>
And Last name as <Lname>
When Click submit
And Find Name
Then Print Name
Examples:
|Fname|Lname|
|'venkatesh'|'ravi'|


