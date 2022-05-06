package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addr_page {
public static WebDriver driver;

@FindBy(name="processAddress")
private WebElement addr;

public Addr_page(WebDriver driver2) {
	Addr_page.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getAddr() {
	return addr;
}

}
