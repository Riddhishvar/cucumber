package com.sdp1;

import org.openqa.selenium.WebDriver;

import com.pom1.Addr_page;
import com.pom1.Confirm_order;
import com.pom1.Home_page1;
import com.pom1.Pay_page;
import com.pom1.Proceed_page;
import com.pom1.Select_page;
import com.pom1.Shipping_page;
import com.pom1.Signup_page;

public class Page_Object_Manager1 {
public static WebDriver driver;
private Home_page1  hop;
private Signup_page sp;
private Select_page sel ;
private Proceed_page pp;
private Shipping_page ship;
private Addr_page ad;
private Pay_page pay;
private Confirm_order co;

 public Page_Object_Manager1(WebDriver driver2) {
	Page_Object_Manager1.driver=driver2;
}
public Home_page1 getInstanceHop()
 {
	 hop=new Home_page1(driver);
	 return hop;
 }
 public Signup_page getInstanceSp()
 {
	 sp=new Signup_page(driver);
	 return sp;
 }
 public Select_page getInstanceSel()
 {
	 sel=new Select_page(driver);
	 return sel;
 }
 public Proceed_page getInstancePp()
 {
	 pp=new Proceed_page(driver);
	 return pp;
 }
 public Shipping_page getInstanceShip()
 {
	 ship=new Shipping_page(driver);
	 return ship;
 }
 public Addr_page getInstanceAd()
 {
	 ad=new Addr_page(driver);
	 return ad;
 }
 public Pay_page getInstancePay()
 {
	 pay=new Pay_page(driver);
	 return pay;
 }
 public Confirm_order getInstanceCo()
 {
	 co=new Confirm_order(driver);
	 return co;
 }
}
