Feature: create lead functionality

Scenario Outline: create lead with different test data

Given lauch browser
Given enter url
Given enter user name as 'DemoSalesManager'
Given enter password as 'crmsfa'
When click login button
When verify welcome page
When click on 'CRM/SFA'
When click on 'Leads'
When click on 'Create Lead'
When enter company name as <cname>
When enter first name as <fname>
When enter last name as <lname>
When enter phone number as <pnum>
Then click submitbutton

Examples:
|cname|fname|lname|pnum|
|'Maveric'|'Sathish'|'Kumar'|'00'|
|'Wipro'|'Suresh'|'Babu'|'11'|
|'Deloitte'|'Shanmugam'|'S'|'22'|

