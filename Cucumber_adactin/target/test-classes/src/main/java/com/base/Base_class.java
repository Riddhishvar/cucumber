package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browser)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		 return driver;
	}

	public static void geturl(String u)
	{
		driver.get(u);
	}
	public static void click_on_webelement(WebElement e)
	{
      e.click();
	}
	public static void sendinput(WebElement e,String s)
	{
		e.sendKeys(s);
	}
	public static void wait_imp()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public static void select(String type,WebElement e,String text)
	{
		if(type.equalsIgnoreCase("visibletext")) {
			
			Select s=new Select(e);
			s.selectByVisibleText(text);
		}
		else if(type.equalsIgnoreCase("index"))
		{
			Select s=new Select(e);
			int index = Integer.parseInt(text);
			s.selectByIndex(index);
		}
		else if(type.equalsIgnoreCase("value"))
		{
			Select s=new Select(e);
			s.selectByValue(text);
		}
		
	}
	public static void close()
	{
		driver.close();
	}
}
