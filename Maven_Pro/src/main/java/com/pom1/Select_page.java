package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_page {
public static WebDriver driver;

@FindBy(linkText="Women")
private WebElement dress;

@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[5]")
private WebElement img;

@FindBy(id="add_to_cart")
private WebElement cart;

@FindBy(css="a[title='Proceed to checkout']")
private WebElement check;

public Select_page(WebDriver driver2) {
	Select_page.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getDress() {
	return dress;
}

public WebElement getImg() {
	return img;
}

public WebElement getCart() {
	return cart;
}

public WebElement getCheck() {
	return check;
}

}
