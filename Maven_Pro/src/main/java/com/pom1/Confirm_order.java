package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirm_order {
	public static WebDriver driver;
	
	@FindBy(css="[class='button btn btn-default button-medium']")
	private WebElement con_button;
	
	public Confirm_order(WebDriver driver2) {
		Confirm_order.driver=driver2;
	}

	public WebElement getCon_button() {
		return con_button;
	}
}
