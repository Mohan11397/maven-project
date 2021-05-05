package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo extends BaseClassHotel {

	public PageTwo() {
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath="//*[@id=\"location\"]") private  WebElement location; 
	@FindBy(id="hotels") private  WebElement hotel; 
	@FindBy(id="room_type") private  WebElement roomtype;
	@FindBy(id="room_nos") private  WebElement roomnumber;
	@FindBy(id="datepick_in") private  WebElement datein;
	@FindBy(id="datepick_out") private  WebElement dateout;
	@FindBy(id="adult_room") private  WebElement adultroom;
	@FindBy(id="child_room") private  WebElement childroom;
	@FindBy(id="Submit") private  WebElement button;
	public WebElement getButton() {
		return button;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnumber() {
		return roomnumber;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	
	
	
}
