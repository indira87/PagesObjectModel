Feature: Leaftaps Automation

#Background:
#Given Launch browser
#And Maximize browser
#And set timeouts
#And Load URL

Scenario Outline: Login to Leaftaps
And Enter Username as <username>
And Enter Password as <pwd>
When Login click
#Then verifylogin successful
And crmsfa is click
And Leads is click
And CreateLeads is click 
And Enter the company name as <cName>
And Enter the First name as <fName>
And Enter the Last name as <lName>
When Create new lead

Examples:
|username|pwd|cName|fName|lName|
|DemoSalesManager|crmsfa|CTS|Indu|G|
|DemoCSR|crmsfa|TCS|Hema|G|