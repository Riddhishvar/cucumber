package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_page {
public static WebDriver driver;

@FindBy(id="email")
private WebElement mailid;

@FindBy(id="passwd")
private WebElement pwd;

@FindBy(id="SubmitLogin")
private WebElement submit;

public Signup_page(WebDriver driver2) {
	Signup_page.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getMailid() {
	return mailid;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getSubmit() {
	return submit;
}
}
