package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ada_Bookingpage {
public static WebDriver driver;
	
	@FindBy(name="location")
	
	private WebElement loc;
	
	@FindBy(id="hotels")
	
	private WebElement hotel;
	
	@FindBy(id="room_type")
	
	private WebElement room;
	
	@FindBy(id="room_nos")
	
	private WebElement nos;
	
	@FindBy(name="datepick_in")
	
	private WebElement in;
	
	@FindBy(name="datepick_out")
	
	private WebElement out;
	
	@FindBy(id="adult_room")
	
	private WebElement adult;
	
	@FindBy(id="child_room")
	
	private WebElement child;
	
	@FindBy(id="Submit")
	
	private WebElement Submit;

	public Ada_Bookingpage(WebDriver driver2) {
		Ada_Bookingpage.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getIn() {
		return in;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
}
