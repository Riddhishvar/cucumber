package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page1 {
	public static WebDriver driver;

	@FindBy(xpath="//a[@class='login']")
	private WebElement signup;

	public Home_page1(WebDriver driver2) {
		Home_page1.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignup() {
		return signup;
		
			}

		
	
}
