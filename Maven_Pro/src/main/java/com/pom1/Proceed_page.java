package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_page {
public static WebDriver driver;

@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement proceed;

public Proceed_page(WebDriver driver2) {
	Proceed_page.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getProceed() {
	return proceed;
}
}
