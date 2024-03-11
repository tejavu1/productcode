Feature: TO validate the login functionality of facebook

Background:
Given The user must be in the facebook home page

@sanity 
Scenario Outline: To validate the login functionality with invalid


When The user must fill the "<username>" and "<password>"
And The user must click the login button
Then The user must navigate to the invalid login page


Examples:

|username|password|
|Madhu1|osbdfjhf|
|Madhu2|656465465|
|Madhu3|jdgfudgsj445462|

@adhoc @regression
Scenario: To validate the registration functionality


When The user has to click the create account button
And The user has to fill the details
And The user has to click the signup button
And the user must receive the successfully registered message

