package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_page;
import com.pom.Confirm_page;
import com.pom.Home_page;
import com.pom.Logout_page;
import com.pom.Persondetails_page;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	private Home_page hp;
	private Booking_page bp;
	private Confirm_page cp;
	private Persondetails_page pdp;
	private Logout_page lp;
	
public Page_Object_Manager(WebDriver driver2) {
		Page_Object_Manager.driver=driver2;
	}

public Home_page getInstanceHp()
{
	hp=new Home_page(driver);
	return hp;
}
 public Booking_page getInstanceBp()
 {
	 bp=new Booking_page(driver);
	 return bp;
 }
 public Confirm_page getInstanceCp()
 {
	cp=new Confirm_page(driver); 
	return cp;
 }
 public Persondetails_page getInstancePdp()
 {
	 pdp=new Persondetails_page(driver);
	 return pdp;
 }
 public Logout_page getInstanceLp()
 {
	 lp=new Logout_page(driver);
	 return lp;
 }
}
