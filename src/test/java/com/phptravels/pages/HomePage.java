package com.phptravels.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.phptravels.libraries.PHPBase;

public class HomePage extends PHPBase {

	final static Logger logger = Logger.getLogger(HomePage.class);

	public HomePage openHomePage() {
		System.out.println("driver= " + driver);
		// WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.phptravels.net/home");
			String actualWebsiteTitle = driver.getTitle();
			logger.info("Current website title is: " + actualWebsiteTitle);
			String expctedTitle = "PHPTRAVELS | Travel Technology Partner";
			assertEquals(actualWebsiteTitle, expctedTitle);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(true);
		}
		return this;
	}

	public HomePage switchToHotelFrame() {
		phpLibrary.switchIframes(0);
		return this;
	}

	public HomePage clickHotelBtn() {
		String elemstr = "//a[@class='text-center hotels active']";
		phpLibrary.clickElement(By.xpath(elemstr));
		phpLibrary.customWait(1);
		return this;
	}

	public HomePage goToNextPage() {
		phpLibrary.gotoNextPage("https://www.phptravels.net/hotels/detail/istanbul/alzer-hotel-istanbuls/27-01-2021/28-01-2021/3/0");
		return this;
	}
	
	
	public HomePage clickDestinationBtn() {
		String elemstr = "//div[contains(@id,'s2id_autogen16')]";
		String elemstr2 = "//ul[@class='select2-result-sub']//li//div[@class='select2-result-label']";
		
		phpLibrary.moveMouseToElementAndClick(By.xpath(elemstr));
		phpLibrary.customWait(1);
		phpLibrary.enterTxt(By.xpath(elemstr),"Alzer");
		phpLibrary.waitUntilElementVisibility(By.xpath(elemstr2));
		phpLibrary.moveMouseToElementAndClick(By.xpath(elemstr2));
		phpLibrary.customWait(1);
		
		return this;
	}


	public HomePage clickAdultsPlusBtn() {
		String element = "#hotels > div > div > form > div > div > div:nth-child(3) > div > div > div > div > div > div > div.col.o2 > div > div.form-icon-left > div > span > button.btn.btn-white.bootstrap-touchspin-up";
		phpLibrary.clickElement(By.cssSelector(element));
		phpLibrary.customWait(1);
		return this;
	}

	public HomePage clickAdultsSubBtn() {
		String element = "#hotels > div > div > form > div > div > div:nth-child(3) > div > div > div > div > div > div > div.col.o2 > div > div.form-icon-left > div > span > button.btn.btn-white.bootstrap-touchspin-down";
		phpLibrary.clickElement(By.cssSelector(element));
		phpLibrary.customWait(1);
		return this;
	}

	public HomePage clickChildPlusBtn() {
		String element = "#hotels > div > div > form > div > div > div:nth-child(3) > div > div > div > div > div > div > div.col.\\30 1 > div > div.form-icon-left > div > span > button.btn.btn-white.bootstrap-touchspin-up";
		phpLibrary.clickElement(By.cssSelector(element));
		phpLibrary.customWait(1);
		return this;
	}

	public HomePage clickChildSubBtn() {
		String element = "#hotels > div > div > form > div > div > div:nth-child(3) > div > div > div > div > div > div > div.col.\\30 1 > div > div.form-icon-left > div > span > button.btn.btn-white.bootstrap-touchspin-down";
		phpLibrary.clickElement(By.cssSelector(element));
		phpLibrary.customWait(1);
		return this;
	}

	public HomePage clickSearchBtn() {

		String element = "#hotels > div > div > form > div > div > div.col-lg-2.col-sm-12.col-xs-12 > button";
		phpLibrary.clickElement(By.cssSelector(element));
		phpLibrary.customWait(2);
		return this;
	}
	
	
	
	public HomePage clickFightsBtn() {
		String elem = "//li//a[contains(@data-name, 'flights')]";
		phpLibrary.clickElement(By.xpath(elem));
		phpLibrary.customWait(1);
		return this;
		
	}
	
	public HomePage clickOneWayCheckBox() {
		String elem = "//label[contains(@for,'flightSearchRadio-2')]";
		phpLibrary.clickElement(By.xpath(elem));
		phpLibrary.customWait(1);
		return this;
		
	}
	
	public HomePage clickRoundTripCheckBox() {
		String elem = "//label[contains(@for,'flightSearchRadio-1')]";
		phpLibrary.clickElement(By.xpath(elem));
		phpLibrary.customWait(1);
		return this;
		
	}
	
	public HomePage clickFlightSearchBtn() {
		String search = "//div[contains(@id, 'flights')]//button[contains(@type, 'submit')]";
		phpLibrary.clickElement(By.xpath(search));
		phpLibrary.customWait(1);
		return this;
	}
	
	/*
	 * public HomePage clickFromBox() { String btnxpath =
	 * "//div[contains(@id, 's2id_location_from')]//a[contains(@class,'select2-choice')]"
	 * ; String btnxpath2 =
	 * "//div[contains(@id, 's2id_location_from')]//a[contains(@class,'select2-choice')]//span[cotains(@class, 'select2-chosen')]"
	 * ; phpLibrary.clickElement(By.xpath(btnxpath)); phpLibrary.customWait(1);
	 * 
	 * phpLibrary.waitUntilElementVisibility(By.xpath(btnxpath2));
	 * phpLibrary.enterTxt(By.xpath(btnxpath2), "BOSTON"); phpLibrary.customWait(1);
	 * return this; }
	 */
	
	public HomePage clickFromBox() {
		/*
		 * String btnxpath = "//div[contains(@id,'s2id_autogen16')]"; String btnxpath2 =
		 * "//*[@id='select2-drop']/div/input";
		 * phpLibrary.clickElement(By.xpath(btnxpath)); phpLibrary.customWait(1);
		 * 
		 * phpLibrary.waitUntilElementVisibility(By.xpath(btnxpath2));
		 * phpLibrary.enterTxt(By.xpath(btnxpath2), "BOSTON"); phpLibrary.customWait(1);
		 */
		
		phpLibrary.btnClickable(By.xpath("//span[@class='select2-chosen' and contains(.,'Enter City Or Airport')]"));
		phpLibrary.customWait(2);

		phpLibrary.enterTxt(By.xpath("//div[@class='select2-search']/input[@class='select2-input select2-focused']"), "BOSTON");
		phpLibrary.customWait(2);
		
		return this;
	}
	
	public HomePage clickToBox() {
		phpLibrary.btnClickable(By.xpath("//span[@class='select2-chosen' and contains(.,'Enter City Or Airport')]"));
		phpLibrary.customWait(2);

		phpLibrary.enterTxt(By.xpath("//div[@class='select2-search']/input[@class='select2-input select2-focused']"), "BOSTON");
		phpLibrary.customWait(2);
	
		return this;
	}
	
	public HomePage clickOnewayDEPART() {
		String departbox = "//*[@id=\"FlightsDateStart\"]";
		String departdate = "//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[34]";
		phpLibrary.btnClickable(By.xpath(departbox));
		phpLibrary.customWait(1);
		phpLibrary.btnClickable(By.xpath(departdate));
		phpLibrary.customWait(1);
		return this;
		
	}
	
	public HomePage clickDEPART() {
		String departbox = "//input[contains(@id, 'FlightsDateStart')]";
		String departdate = "//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[33]";
		phpLibrary.btnClickable(By.xpath(departbox));
		phpLibrary.customWait(1);
		phpLibrary.btnClickable(By.xpath(departdate));
		phpLibrary.customWait(1);
		return this;
	}
	
	public HomePage clickRETURN() {
		String returnbox = "//input[contains(@id, 'FlightsDateEnd')]";
		String returndate = "//*[@id=\"datepickers-container\"]/div[10]/div/div/div[2]/div[35]";
		phpLibrary.clickElement(By.xpath(returnbox));
		phpLibrary.customWait(1);
		phpLibrary.moveMouseToElementAndClick(By.xpath(returndate));
		phpLibrary.customWait(1);
		return this;
		
	}
	
	public HomePage clickADULTSbtns() {
		String plus = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]";
		String minus = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[2]";
		phpLibrary.clickElement(By.xpath(plus));
		phpLibrary.customWait(1);
		phpLibrary.clickElement(By.xpath(minus));
		phpLibrary.customWait(1);
		
		return this;
	}
	
	public HomePage clickChildBtns() {
		String plus = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[1]";
		String minus = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[2]";
		phpLibrary.clickElement(By.xpath(plus));
		phpLibrary.customWait(1);
		phpLibrary.clickElement(By.xpath(minus));
		phpLibrary.customWait(1);
		
		return this;
	}
	
	public HomePage clickInfantBtns() {
	
		String plus = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[3]/div/div[2]/div/span/button[1]";
		String minus = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[3]/div/div[2]/div/span/button[2]";
		phpLibrary.clickElement(By.xpath(plus));
		phpLibrary.customWait(1);
		phpLibrary.clickElement(By.xpath(minus));
		phpLibrary.customWait(1);
		
		return this;
		
	}
	
	
	
	

}
