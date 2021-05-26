package com.phptravels.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.phptravels.libraries.PHPBase;

public class HotelBookingPage extends PHPBase {
	final static Logger logger = Logger.getLogger(HomePage.class);
	
	public HotelBookingPage openHotelBookingPage() {
		driver.get("https://www.phptravels.net/hotels/detail/istanbul/alzer-hotel-istanbuls/30-01-2021/31-01-2021/2/0");
		phpLibrary.customWait(1);
		return this;
	}
	
	public HotelBookingPage starGrade() {
		phpLibrary.clickElement(By.xpath("//label[contains(@class, 'custom-control-label') and @for='4']"));
		phpLibrary.customWait(1);
		return this;
	}
	
	public HotelBookingPage dragdropLowPriceBtn() {
		phpLibrary.dragAndDropBtn(By.cssSelector("#filterResultCallapseOnMobile > div > form > div:nth-child(2) > div.box-content > span > span.irs-slider.from")
				, 80);
		phpLibrary.customWait(1);
		return this;
	}
	
	public HotelBookingPage dragdropHighPriceBtn() {
		phpLibrary.dragAndDropBtn(By.cssSelector("#filterResultCallapseOnMobile > div > form > div:nth-child(2) > div.box-content > span > span.irs-slider.to.type_last")
				, 0);
		phpLibrary.customWait(1);
		return this;
	}
	
	public HotelBookingPage clickSearchBtn() {
		phpLibrary.clickElement(By.xpath("//button[contains(@id, 'searchform')]"));
		phpLibrary.customWait(1);
		return this;
	}
	
	public HotelBookingPage clickViewMoreBtn() {
		phpLibrary.clickElement(By.xpath("//span[contains(@class, 'btn btn-toggle btn-text-inherit text-secondary text-uppercase font10 letter-spacing-1 font600 collapsed-off')]"));
		phpLibrary.customWait(1);
		return this;
	}
	
	
	public HotelBookingPage clickHotelAmenitiesBox() {
		phpLibrary.clickElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[3]/div[2]/div[4]/div/label"));
		phpLibrary.customWait(1);
		return this;
	}
	
	

}
