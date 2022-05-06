package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ada_Confirmpage {
	public static WebDriver driver;
	@FindBy(id="radiobutton_1")
	
	private WebElement radio;
	
	@FindBy(id="continue")
	
	private WebElement cont;

	public Ada_Confirmpage(WebDriver driver) {
		Ada_Confirmpage.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}

}
