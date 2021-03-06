package com.adactin_runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.Base_class;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin_feature\\adactin.feature", glue="com.adactin_stepdefinition",
monochrome = true,
plugin= {"html:Report/Cucumber_HtmlReport",
		"pretty",
		"json:Report/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"
})
public class TestRun_class {
	
    
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException
	{
//		File_Reader_Manager.getInstance();
//		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver=Base_class.getBrowser("chrome");
	}
	@AfterClass
	public static void tearDown()
	{
		Base_class.close();
	}
}
