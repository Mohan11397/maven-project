package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree extends BaseClassHotel {
	
	public PageThree() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="radiobutton_0") private  WebElement select; 
	@FindBy(id="continue") private  WebElement button;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getButton() {
		return button;
	} 

}
