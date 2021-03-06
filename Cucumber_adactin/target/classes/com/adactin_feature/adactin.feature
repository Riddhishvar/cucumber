Feature: Booking Hotel In Adactin Application
Scenario: Login With Valid Username and Password To Book Hotel Room
Given user Launch the Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And Navigate To Search Hotel Page

Scenario: Search The Hotel By Giving Inputs To 8 Fields 
When user Select One Of The Location From Dropdown List Which Is A Mandatory Field
And user Select One Of The Hotels From Dropdown List
And user Select One Of The Room-Type From Dropdown List
And user Select One Of The Number OF Room From Dropdown List Which Is A Mandatory Field
And user Enter The Check-in Date In Check-In Date Field Which Is A Mandatory Field
And user Enter The Check-out Date In Check-Out Date Field
And user Select One Of The Adults Per Room From Dropdown List Which Is A Mandatory Field
And user Select One Of The Children Per Room From Dropdown List
Then user Click The Search Button And Navigate To Confirm Booking Page

Scenario: Select The Hotel By Clicking The Radio Button
When user Click The Radio Button 
Then user Click The Continue Button And Navigate To Personal Details Page

Scenario: Giving Personal Details For Booking The Hotel
When user Enter The First Name In First Name Field Which Is A Mandatory Field
And user Enter The Last Name In Last Name Field Which Is A Mandatory Field
And user Enter The Billing Address In Billing Address Field Which Is A Mandatory Field
And user Enter The Credit Card No In Credit Card No Field Which Is A Mandatory Field
And user Select The Credit Card Type From The Dropdown List Which Is A Mandatory Field
And user Select The Month And Date From The Expiry Date Field Which Is A Mandatory Field
And user Enter The CVV Number In The CVV Number Field Which Is A Mandatory Field
Then user Click The Book Now Button And Navigate To Next Page

Scenario: Page With Order Number And Logout Button 
Then click On The Logout Button And Come Out Of The Application






