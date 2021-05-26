package com.phptravels.libraries;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class PHPBase {

	final Logger logger = Logger.getLogger(PHPBase.class);

	public static WebDriver driver;
	public static PHPLibraries phpLibrary;
	

	@BeforeMethod // before each test
	public void setup() {
		logger.info("Test started...");
		phpLibrary = new PHPLibraries();
		driver = phpLibrary.startChromeBrowser();
	}
	

	@AfterMethod // after each test is completed, cleaning up = close the browser
	public void close() {
		try {
			Thread.sleep(2);
			if (driver != null) {
				driver.close();
				//driver.quit();
			}
			//logger.info("Test is ended...");

		} catch (Exception e) {
			logger.error("Error: ", e);
			e.printStackTrace();
		}
	}
}

