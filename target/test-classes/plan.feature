Feature: Get plans from insurance plans

Background: User launches and validates the application
Given Launch the LicIndia application "https://www.licindia.in/en/"
When Validates the LicIndia application "https://www.licindia.in/en/"

Scenario: User gets the plan details
When User clicks the products
Then Mouseover Insurance plans
And Mouseover and clicks wholelife plans
And User clicks LICs Jeevan Umang plan
Then User selects Policy Document

Scenario: User get the plan details
When User click the products
Then Mouseover to Insurance plans
And Mouseover and click wholelife plans
And User clicks LICs Jeevan Utsav plan
Then User selects Sales brochures

Scenario: User downloads payment receipt
When User clicks pay premium
Then User clicks view/download receipt
And User enters Policynumber "327232645" Date of Transaction and Transaction type
And User clicks submit button

Scenario: User updates contact details offline
When User clicks Customer Services
Then Mouseover to Update your contact details - offline
And User clicks update your contact details - offline form