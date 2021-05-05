package org.junit;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFive extends BaseClassHotel {
	
	public PageFive() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"order_no\"]") private WebElement ordernumber;
	
	

	public WebElement getOrdernumber() {
		return ordernumber;

	}

}
