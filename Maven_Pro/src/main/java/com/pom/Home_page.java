package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public WebDriver driver;

	@FindBy(id="username")
	
	private WebElement username;

	@FindBy(id= "password")
	 
    private WebElement pwd;
	
	@FindBy(id= "login")
	
	private WebElement login;
	
	public Home_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
}
