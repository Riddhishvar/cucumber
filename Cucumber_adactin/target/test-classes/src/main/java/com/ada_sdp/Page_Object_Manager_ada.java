package com.ada_sdp;

import java.com.pom.Ada_Bookingpage;
import java.com.pom.Ada_Confirmpage;
import java.com.pom.Ada_Homepage;
import java.com.pom.Ada_Logoutpage;
import java.com.pom.Ada_Personaldetailspage;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager_ada {
	public static WebDriver driver;
	private Ada_Homepage ahp;
	private Ada_Personaldetailspage apd;
	private Ada_Bookingpage abp;
	private Ada_Confirmpage acp;
	private Ada_Logoutpage alp;
		
public Page_Object_Manager_ada(WebDriver driver2) {
		Page_Object_Manager_ada.driver=driver2;
	}

public Ada_Homepage getInstanceHp()
{
	ahp=new Ada_Homepage(driver);
	return ahp;
}
 public Ada_Bookingpage getInstanceBp()
 {
	 abp=new Ada_Bookingpage(driver);
	 return abp;
 }
 public Ada_Confirmpage getInstanceCp()
 {
	acp=new Ada_Confirmpage(driver); 
	return acp;
 }
 public Ada_Personaldetailspage getInstancePdp()
 {
	 apd=new Ada_Personaldetailspage(driver);
	 return apd;
 }
 public Ada_Logoutpage getInstanceLp()
 {
	 alp=new Ada_Logoutpage(driver);
	 return alp;
 }
}
