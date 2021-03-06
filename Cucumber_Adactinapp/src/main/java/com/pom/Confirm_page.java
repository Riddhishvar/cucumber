package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_page {
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	
	private WebElement radio;
	
	@FindBy(id="continue")
	
	private WebElement cont;

	public Confirm_page(WebDriver driver) {
		Confirm_page.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}

}
