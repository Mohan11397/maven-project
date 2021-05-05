package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFour extends BaseClassHotel {
	
	public PageFour() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name") private  WebElement fname;
	@FindBy(name="last_name") private  WebElement lname; 
	@FindBy(name="address") private  WebElement address; 
	@FindBy(name="cc_num") private  WebElement card; 
	@FindBy(name="cc_type") private  WebElement cardtype;
	@FindBy(name="cc_exp_month") private  WebElement ccmonth;
	@FindBy(name="cc_exp_year") private  WebElement ccyear;
	@FindBy(name="cc_cvv") private  WebElement cvvnumber;
	@FindBy(name="book_now") private  WebElement clk;
	@FindBy(xpath="//*[@id=\"order_no\"]") private WebElement ordernumber;
	public WebElement getOrdernumber() {
		return ordernumber;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCard() {
		return card;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCcmonth() {
		return ccmonth;
	}
	public WebElement getCcyear() {
		return ccyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getClk() {
		return clk;
	}
	

}
