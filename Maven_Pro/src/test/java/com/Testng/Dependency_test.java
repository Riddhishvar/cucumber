package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependency_test {
			
	
	@Test
	private void setproperty()
	{
		System.out.println("setproperty");
	}
	@Test(dependsOnMethods = "setproperty")
	private void geturl()
	{
	System.out.println("GETURL depends on setproperty");
	}
	@Test(dependsOnMethods = "login")
	private void getelement()
	{
		System.out.println("GETELEMENT depends on login");
	}
	@Test(dependsOnMethods = "geturl")
	private void login()
	{
		System.out.println("LOGIN depends on geturl ");
	}
	@Test(dependsOnMethods = "payment")
	private void logout()
	{
		System.out.println("LOGOUT depends on payment");
	}
	@Test(dependsOnMethods = "getelement")
	private void addtocart()
	{
		System.out.println("ADDTOCART depends on getelement");
	}
	@Test(dependsOnMethods = "addtocart")
	private void payment()
	{
		System.out.println("PAYBYWIRE depends on addtocart");
	}
	
	
}
