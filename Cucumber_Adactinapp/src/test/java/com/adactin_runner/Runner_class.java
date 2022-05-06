package com.adactin_runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Base.Base_class;
import com.sdp.Page_Object_Manager;



public class Runner_class extends Base_class {
	public static WebDriver driver=Base_class.getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static void main(String args[]) throws InterruptedException,IOException 
	{		
geturl("https://adactinhotelapp.com/");
sendinput(pom.getInstanceHp().getUsername(),"priyavenkataraman");
sendinput(pom.getInstanceHp().getPwd(),"Prajen@09");
click_on_webelement(pom.getInstanceHp().getLogin());
wait_imp();
select("visibletext",pom.getInstanceBp().getLoc(),"London");
select("visibleText",pom.getInstanceBp().getHotel(),"Hotel Sunshine");
select("visibletext",pom.getInstanceBp().getRoom(),"Deluxe");
select("visibletext",pom.getInstanceBp().getNos(),"1 - One");
sendinput(pom.getInstanceBp().getIn(),"3/30/2022");
sendinput(pom.getInstanceBp().getOut(),"4/2/2022");
select("visibletext", pom.getInstanceBp().getAdult(), "2 - Two");
select("index",pom.getInstanceBp().getChild() , "1");
click_on_webelement(pom.getInstanceBp().getSubmit());
wait_imp();
click_on_webelement(pom.getInstanceCp().getRadio());
click_on_webelement(pom.getInstanceCp().getCont());
sendinput(pom.getInstancePdp().getFname(),"priya");
sendinput(pom.getInstancePdp().getLname(),"venkat");
sendinput(pom.getInstancePdp().getAddr(),"34,tyti,chenai");
sendinput(pom.getInstancePdp().getCardno(),"2345678923456789");
select("visibletext", pom.getInstancePdp().getCardtype(), "VISA");
select("visibletext",pom.getInstancePdp().getExpmon(), "February");
select("visibletext", pom.getInstancePdp().getExpyear(), "2022");
sendinput(pom.getInstancePdp().getCvv(),"345");
click_on_webelement(pom.getInstancePdp().getBook());
wait_imp();
click_on_webelement(pom.getInstanceLp().getLogout());
}
}