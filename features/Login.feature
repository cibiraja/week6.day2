#Feature: Leaftaps login functionality
#Scenario Outline: Login with positive credentials
#Given Open the chrome browser
#And Load the application url
#And Enter the username as Demosalesmanager
#And Enter the password as crmsfa
#When Click on login button
#Then Homepages should be displayed
@login
Feature: Leaftaps login functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@smoke @regression
Scenario Outline: Login with positive credential

Given Enter the username as <username>

And Enter the password as <password>

When Click on Login button

Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional @regression
Scenario: Login with negative credenials

Given Enter the username as 'Demo'

And Enter the password as 'crmsfa'

When Click on login button

But Error message should be displayed

