package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ada_Logoutpage {
public static WebDriver driver;
	
	@FindBy(id= "logout")
	
	private WebElement logout;

	public Ada_Logoutpage(WebDriver driver2) {
		Ada_Logoutpage.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogout() {
		return logout;
	}
}
