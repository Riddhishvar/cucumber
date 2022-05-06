package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Persondetails_page {

	public static WebDriver driver;
	
	@FindBy(id="first_name")
	
	private WebElement fname;
	
	@FindBy(id="last_name")
	
	private WebElement lname;
	
	@FindBy(id="address")
	
	private WebElement addr;
	
	@FindBy(id="cc_num")
	
	private WebElement cardno;
	
    @FindBy(id="cc_type")
    private WebElement cardtype;
    
	@FindBy(id="cc_exp_month")
	private WebElement expmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;

	public Persondetails_page(WebDriver driver2) {
		Persondetails_page.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
}
