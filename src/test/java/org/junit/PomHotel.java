package org.junit;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHotel extends BaseClassHotel {
	
	public PomHotel() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@id=\"username\"]") private  WebElement Uname; 
	@FindBy(xpath="//*[@id=\"password\"]") private  WebElement Pword; 
	@FindBy(id="login") private WebElement button;
	
	public WebElement getUname() {
		return Uname;
	}
	public WebElement getPword() {
		return Pword;
	}
	public WebElement getButton() {
		return button;
	}
	

	
}
