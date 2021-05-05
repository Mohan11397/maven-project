package org.junit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassHotel {

	public static WebDriver driver;
	public static Select s;
	public static void launchbrowser(String Browser) {
		
          if(Browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\MavenJunit\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if (Browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Maven\\driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		else {
			
			System.setProperty("webdriver.ie.driver", "C:\\eclipse\\Maven\\driver\\IEDriverServer.exe");
			
			driver= new InternetExplorerDriver();
			

	}
	
}
	public static void launchUrl(String url) {
		driver.manage().window().maximize();
	    	driver.get(url);
	    	
		}
	    
	public static void fillTheText(WebElement e, String value ) {
			
	    	e.sendKeys(value);

		}
	    
	public static void clickButton(WebElement w) {
			w.click();

		}
	
	public static void selectvalue(WebElement w, String value) {
		
		s= new Select(w);
		s.selectByValue(value);
		

	}
	
	
	public static void getTextValue(WebElement d) {
		
		String string = d.getAttribute("value");
		System.out.println("order number :"+ string);

	}
			
			
		

	}
