package com.adactin_stepdefinition;

import com.Base.Base_class;
import com.adactin.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition extends Base_class {
	
	Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	@Given("^user Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		//String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		geturl("https://adactinhotelapp.com/");
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String user) throws Throwable {
		sendinput(pom.getInstanceHp().getUsername(),user);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String pwd) throws Throwable {
		sendinput(pom.getInstanceHp().getPwd(),pwd);
	}

	@Then("^user Click The Login Button And Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Navigate_To_Search_Hotel_Page() throws Throwable {
		click_on_webelement(pom.getInstanceHp().getLogin());
		wait_imp();
	}

	@When("^user Select One Of The Location From Dropdown List Which Is A Mandatory Field$")
	public void user_Select_One_Of_The_Location_From_Dropdown_List_Which_Is_A_Mandatory_Field() throws Throwable {
		select("visibletext",pom.getInstanceBp().getLoc(),"London");
			}

	@When("^user Select One Of The Hotels From Dropdown List$")
	public void user_Select_One_Of_The_Hotels_From_Dropdown_List() throws Throwable {
		select("visibleText",pom.getInstanceBp().getHotel(),"Hotel Sunshine");
	}

	@When("^user Select One Of The Room-Type From Dropdown List$")
	public void user_Select_One_Of_The_Room_Type_From_Dropdown_List() throws Throwable {
		select("visibletext",pom.getInstanceBp().getRoom(),"Deluxe");
	}

	@When("^user Select One Of The Number OF Room From Dropdown List Which Is A Mandatory Field$")
	public void user_Select_One_Of_The_Number_OF_Room_From_Dropdown_List_Which_Is_A_Mandatory_Field() throws Throwable {
		select("visibletext",pom.getInstanceBp().getNos(),"1 - One");
	}

	@When("^user Enter The Check-in Date In Check-In Date Field Which Is A Mandatory Field$")
	public void user_Enter_The_Check_in_Date_In_Check_In_Date_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		sendinput(pom.getInstanceBp().getIn(),"3/30/2022");
	}

	@When("^user Enter The Check-out Date In Check-Out Date Field$")
	public void user_Enter_The_Check_out_Date_In_Check_Out_Date_Field() throws Throwable {
		sendinput(pom.getInstanceBp().getOut(),"4/2/2022");
	}

	@When("^user Select One Of The Adults Per Room From Dropdown List Which Is A Mandatory Field$")
	public void user_Select_One_Of_The_Adults_Per_Room_From_Dropdown_List_Which_Is_A_Mandatory_Field() throws Throwable {
		select("visibletext", pom.getInstanceBp().getAdult(), "2 - Two");
	}

	@When("^user Select One Of The Children Per Room From Dropdown List$")
	public void user_Select_One_Of_The_Children_Per_Room_From_Dropdown_List() throws Throwable {
		select("index",pom.getInstanceBp().getChild() , "1");
	}

	@Then("^user Click The Search Button And Navigate To Confirm Booking Page$")
	public void user_Click_The_Search_Button_And_Navigate_To_Confirm_Booking_Page() throws Throwable {
		click_on_webelement(pom.getInstanceBp().getSubmit());
		wait_imp();
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
		click_on_webelement(pom.getInstanceCp().getRadio());
	}

	@Then("^user Click The Continue Button And Navigate To Personal Details Page$")
	public void user_Click_The_Continue_Button_And_Navigate_To_Personal_Details_Page() throws Throwable {
		click_on_webelement(pom.getInstanceCp().getCont());
	}

	@When("^user Enter The First Name In First Name Field Which Is A Mandatory Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		sendinput(pom.getInstancePdp().getFname(),"priya");
		
	}

	@When("^user Enter The Last Name In Last Name Field Which Is A Mandatory Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		sendinput(pom.getInstancePdp().getLname(),"venkat");
	}

	@When("^user Enter The Billing Address In Billing Address Field Which Is A Mandatory Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		sendinput(pom.getInstancePdp().getAddr(),"34,tyti,chenai");
	}

	@When("^user Enter The Credit Card No In Credit Card No Field Which Is A Mandatory Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		sendinput(pom.getInstancePdp().getCardno(),"2345678923456789");
	}

	@When("^user Select The Credit Card Type From The Dropdown List Which Is A Mandatory Field$")
	public void user_Select_The_Credit_Card_Type_From_The_Dropdown_List_Which_Is_A_Mandatory_Field() throws Throwable {
		select("visibletext", pom.getInstancePdp().getCardtype(), "VISA");
	}

	@When("^user Select The Month And Date From The Expiry Date Field Which Is A Mandatory Field$")
	public void user_Select_The_Month_And_Date_From_The_Expiry_Date_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		select("visibletext",pom.getInstancePdp().getExpmon(), "February");
		select("visibletext", pom.getInstancePdp().getExpyear(), "2022");
	}

	@When("^user Enter The CVV Number In The CVV Number Field Which Is A Mandatory Field$")
	public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field_Which_Is_A_Mandatory_Field() throws Throwable {
		sendinput(pom.getInstancePdp().getCvv(),"345");
	}

	@Then("^user Click The Book Now Button And Navigate To Next Page$")
	public void user_Click_The_Book_Now_Button_And_Navigate_To_Next_Page() throws Throwable {
		click_on_webelement(pom.getInstancePdp().getBook());
		wait_imp();
	}

	@Then("^click On The Logout Button And Come Out Of The Application$")
	public void click_On_The_Logout_Button_And_Come_Out_Of_The_Application() throws Throwable {
		click_on_webelement(pom.getInstanceLp().getLogout());
	}

}
