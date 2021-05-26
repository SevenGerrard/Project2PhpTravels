package com.phptravels.tests;

import org.testng.annotations.Test;
import com.phptravels.libraries.PHPBase;
import com.phptravels.pages.HomePage;
import com.phptravels.pages.HotelBookingPage;

public class HomePageFunctions extends PHPBase {

	
	@Test(priority=1, enabled = true)
	public void verifyDestinationFunc() {
		HomePage calHomePage = new HomePage();
		
		calHomePage
		.openHomePage()
		.clickDestinationBtn()
		.clickSearchBtn();
		
	}

	@Test(priority=2, enabled = true)

	public void verifyAdultsNum() {
		HomePage veriAdultsFunc = new HomePage();
		
		veriAdultsFunc
		.openHomePage()
		.clickDestinationBtn()
		.clickAdultsPlusBtn()
		.clickAdultsSubBtn()
		.clickSearchBtn();
	}
	
	@Test(priority=3, enabled = true)
	public void verifyChildNum() {
		HomePage veriChildFunc = new HomePage();
		
		veriChildFunc
		.openHomePage()
		.clickDestinationBtn()
		.clickChildPlusBtn()
		.clickChildSubBtn()
		.clickSearchBtn();
	}
	
	@Test(priority=4, enabled = true)
	public void ferifyStarGrade() {
		HotelBookingPage starGrade = new HotelBookingPage();
		
		starGrade
		.openHotelBookingPage()
		.starGrade()
		.clickSearchBtn();
	}
	
	@Test(priority=5, enabled=true)
	public void dragLowestPriceBtn() {
		HotelBookingPage dragLowBtn = new HotelBookingPage();
		
		dragLowBtn
		.openHotelBookingPage()
		.dragdropLowPriceBtn()
		.clickSearchBtn();
	}
	
	@Test(priority=6, enabled=true)
	public void dragdropHighPriceBtn() {
		HotelBookingPage dragHighBtn = new HotelBookingPage();
		
		dragHighBtn
		.openHotelBookingPage()
		.dragdropHighPriceBtn()
		.clickSearchBtn();
	}
	
	@Test(priority=7, enabled=true)
	public void hotelEminitiesBtn() {
		HotelBookingPage eminities = new HotelBookingPage();
		
		eminities
		.openHotelBookingPage()
		//.clickViewMoreBtn()
		.clickHotelAmenitiesBox()
		.clickSearchBtn();
	}
	
	@Test(priority=8, enabled=true)
	public void onewayCheckBox() {
		HomePage onewayCheckBox = new HomePage();
		
		onewayCheckBox
		.openHomePage()
		.clickFightsBtn()
		.clickOneWayCheckBox()
		.clickFlightSearchBtn();
	}
	
	@Test(priority=9, enabled=true)
	public void roundtripCheckBox() {
		HomePage roundtripCheckBox = new HomePage();

		roundtripCheckBox
		.openHomePage()
		.clickFightsBtn()
		.clickRoundTripCheckBox()
		.clickFlightSearchBtn();
	}
	 
	@Test(priority=10, enabled=true)
	public void destinationBox() {
		HomePage destinationBox = new HomePage();
		
		destinationBox
		.openHomePage()
		.clickFightsBtn()
		.clickOneWayCheckBox()
		.clickFromBox()
		.clickFlightSearchBtn();
	}
	
	@Test(priority=11, enabled=true)
	public void departDate() {
		HomePage departdate = new HomePage();
		
		departdate
		.openHomePage()
		.clickFightsBtn()
		.clickOneWayCheckBox()
		//.clickFromBox()
		//.clickToBox()
		.clickOnewayDEPART()
		.clickFlightSearchBtn();
	}
	
	@Test(priority=12, enabled=true)
	public void clickADULTSbtns() {
		HomePage clickadultsbtns = new HomePage();
		
		clickadultsbtns
		.openHomePage()
		.clickFightsBtn()
		.clickOneWayCheckBox()
		//.clickFromBox()
		//.clickToBox()
		.clickOnewayDEPART()
		.clickADULTSbtns()
		.clickFlightSearchBtn();
		
	}
	
	@Test(priority=13, enabled=true)
	public void verifyChildBtns() {
		HomePage verifychildbtns = new HomePage();
		
		verifychildbtns
		.openHomePage()
		.clickFightsBtn()
		.clickOneWayCheckBox()
		//.clickFromBox()
		//.clickToBox()
		.clickOnewayDEPART()
		.clickADULTSbtns()
		.clickChildBtns()
		.clickFlightSearchBtn();
	}
	
	@Test(priority=14, enabled=true)
	public void verifyInfantBtns() {
		HomePage verifyinfantbtns = new HomePage();
		
		verifyinfantbtns
		.openHomePage()
		.clickFightsBtn()
		.clickOneWayCheckBox()
		//.clickFromBox()
		//.clickToBox()
		.clickOnewayDEPART()
		.clickADULTSbtns()
		.clickChildBtns()
		.clickInfantBtns()
		.clickFlightSearchBtn();
	}
	
	
	

}
