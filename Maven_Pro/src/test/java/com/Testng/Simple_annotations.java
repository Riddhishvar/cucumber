package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {
	@BeforeSuite
	private void setproperty()
	{
		System.out.println("setproperty");
	}
	@BeforeTest
	private void lauchbrowser()
	{
	System.out.println("launchbrowser");	
	}
	@BeforeClass
	private void geturl()
	{
		System.out.println("geturl");
	}
	@BeforeMethod
	private void signin()
	{
	System.out.println("signin");	
	}
	@Test
	private void women()
	{
	System.out.println("women");	
	}
@Test
private void dresses()
{
System.out.println("dresses");	
}
@Test
private void tshirts()
{
System.out.println("tshirts");	
}
@AfterMethod
private void signoff()
{
	System.out.println("signout");
}
@AfterClass
private void homepage()
{
	System.out.println("close homepage");
}
@AfterTest
private void close()
{
	System.out.println("closebrowser");
}
@AfterSuite
private void deletecookies()
{
	System.out.println("deletecookies");
}
}
