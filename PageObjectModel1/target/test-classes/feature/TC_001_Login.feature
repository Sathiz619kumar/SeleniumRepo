Feature: Login functionality

Background:
Given lauch browser
Given enter url
 
Scenario: Login with valid credentials

#Given lauch browser
#Given enter url
Given enter user name as 'DemoSalesManager'
Given enter password as 'crmsfa'
When click login button
Then verify welcome page

Scenario: Login with invalid credentials

#Given lauch browser
#Given enter url
Given enter user name as 'Sales'
Given enter password as 'dfd'
When click login button
But verify error message

