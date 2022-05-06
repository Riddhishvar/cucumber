package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay_page {
public static WebDriver driver;

@FindBy(className="bankwire")
private WebElement pay;



public Pay_page(WebDriver driver2) {
	Pay_page.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getPay() {
	return pay;
}


}

