package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {
public static WebDriver driver;

@FindBy(id="cgv")
private WebElement ship;

@FindBy(name="processCarrier")
private WebElement carrier;

public Shipping_page(WebDriver driver2) {
	Shipping_page.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getShip() {
	return ship;
}

public WebElement getCarrier() {
	return carrier;
}
}
