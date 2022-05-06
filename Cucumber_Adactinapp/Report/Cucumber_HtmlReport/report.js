$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin_feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel In Adactin Application",
  "description": "",
  "id": "booking-hotel-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login With Valid Username and Password To Book Hotel Room",
  "description": "",
  "id": "booking-hotel-in-adactin-application;login-with-valid-username-and-password-to-book-hotel-room",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"Priyavenkataraman\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Prajen@09\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click The Login Button And Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_the_Application()"
});
formatter.result({
  "duration": 3529410699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priyavenkataraman",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 332488301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prajen@09",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 134712199,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Login_Button_And_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1042248399,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search The Hotel By Giving Inputs To 8 Fields",
  "description": "",
  "id": "booking-hotel-in-adactin-application;search-the-hotel-by-giving-inputs-to-8-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user Select One Of The Location From Dropdown List Which Is A Mandatory Field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Select One Of The Hotels From Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Select One Of The Room-Type From Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select One Of The Number OF Room From Dropdown List Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Enter The Check-in Date In Check-In Date Field Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Enter The Check-out Date In Check-Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select One Of The Adults Per Room From Dropdown List Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select One Of The Children Per Room From Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Click The Search Button And Navigate To Confirm Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Select_One_Of_The_Location_From_Dropdown_List_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 722553399,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_One_Of_The_Hotels_From_Dropdown_List()"
});
formatter.result({
  "duration": 243099100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_One_Of_The_Room_Type_From_Dropdown_List()"
});
formatter.result({
  "duration": 200229200,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_One_Of_The_Number_OF_Room_From_Dropdown_List_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 114106000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Check_in_Date_In_Check_In_Date_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 141377100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Check_out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 127489900,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_One_Of_The_Adults_Per_Room_From_Dropdown_List_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 205055700,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_One_Of_The_Children_Per_Room_From_Dropdown_List()"
});
formatter.result({
  "duration": 209106800,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Search_Button_And_Navigate_To_Confirm_Booking_Page()"
});
formatter.result({
  "duration": 770722100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Select The Hotel By Clicking The Radio Button",
  "description": "",
  "id": "booking-hotel-in-adactin-application;select-the-hotel-by-clicking-the-radio-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user Click The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Click The Continue Button And Navigate To Personal Details Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Click_The_Radio_Button()"
});
formatter.result({
  "duration": 127710200,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Continue_Button_And_Navigate_To_Personal_Details_Page()"
});
formatter.result({
  "duration": 704907200,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Giving Personal Details For Booking The Hotel",
  "description": "",
  "id": "booking-hotel-in-adactin-application;giving-personal-details-for-booking-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user Enter The First Name In First Name Field Which Is A Mandatory Field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Last Name In Last Name Field Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Billing Address In Billing Address Field Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enter The Credit Card No In Credit Card No Field Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Select The Credit Card Type From The Dropdown List Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Select The Month And Date From The Expiry Date Field Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter The CVV Number In The CVV Number Field Which Is A Mandatory Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Click The Book Now Button And Navigate To Next Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Enter_The_First_Name_In_First_Name_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 204962500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Last_Name_In_Last_Name_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 210652500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Billing_Address_In_Billing_Address_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 148750100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 164685600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Credit_Card_Type_From_The_Dropdown_List_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 209612500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Month_And_Date_From_The_Expiry_Date_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 459981500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_CVV_Number_In_The_CVV_Number_Field_Which_Is_A_Mandatory_Field()"
});
formatter.result({
  "duration": 124358300,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Book_Now_Button_And_Navigate_To_Next_Page()"
});
formatter.result({
  "duration": 116330700,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Page With Order Number And Logout Button",
  "description": "",
  "id": "booking-hotel-in-adactin-application;page-with-order-number-and-logout-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "click On The Logout Button And Come Out Of The Application",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.click_On_The_Logout_Button_And_Come_Out_Of_The_Application()"
});
formatter.result({
  "duration": 6260631901,
  "status": "passed"
});
});