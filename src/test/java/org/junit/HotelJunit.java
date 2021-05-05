package org.junit;

public class HotelJunit extends BaseClassHotel {

	@BeforeClass
	public static void beforeClass() {
		launchbrowser("chrome");
		System.out.println("beforeclass");
	
	}
	@Test
	public void testClass() throws Exception {
		launchUrl("https://adactinhotelapp.com/");
		PomHotel p = new PomHotel();
		Thread.sleep(3000);
		fillTheText(p.getUname(), "mohanflyrez");
		fillTheText(p.getPword(), "password");
		clickButton(p.getButton());
	
		 PageTwo t = new  PageTwo();
		 selectvalue(t.getLocation(), "Sydney");
		 selectvalue(t.getHotel(), "Hotel Creek");
		 selectvalue(t.getRoomtype(), "Super Deluxe");
		 selectvalue(t.getRoomnumber(), "10");
		 selectvalue(t.getAdultroom(), "3");
		 selectvalue(t.getChildroom(), "4");
		 clickButton(t.getButton());
		 
		 PageThree w = new PageThree();
		 clickButton(w.getSelect());
		 clickButton(w.getButton());
		 
		 PageFour f = new PageFour();
		 fillTheText(f.getFname(), "mohan");
		 fillTheText(f.getLname(), "flyrez");
		 fillTheText(f.getAddress(), "chennai");
		 fillTheText(f.getCard(), "2343325443455334");
		 selectvalue(f.getCardtype(), "VISA");
		 selectvalue(f.getCcmonth(), "3");
		 selectvalue(f.getCcyear(), "2022");
		 fillTheText(f.getCvvnumber(), "360");
		 clickButton(f.getClk());
		 
		 Thread.sleep(5000);
		 PageFive g = new PageFive();
		 getTextValue(g.getOrdernumber());
		 
		 
		 
		 
		 
		 
		 
	}
}
