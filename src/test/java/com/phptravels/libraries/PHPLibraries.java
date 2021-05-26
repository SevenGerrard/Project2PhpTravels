package com.phptravels.libraries;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPLibraries {
	final static Logger logger = Logger.getLogger(PHPLibraries.class);

	private WebDriver driver;

	public PHPLibraries() {

	}

	/*
	 * public PHPLibraries(WebDriver _driver) { driver = _driver; }
	 */

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver _driver) {
		try {
			if (_driver != null) {
				this.driver = _driver;
			}

		} catch (Exception e) {
			logger.error("Error: ", e);
			assertTrue(false);
		}
	}

	public WebDriver startChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies(); // delete all the cookies

			// dynamic wait
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			logger.debug("Maximize the browser window");

		} catch (Exception e) {
			logger.error("Error: ", e);
			// assertTrue(false);
		}
		return driver;
	}

	public void customWait(double inSeconds) {
		try {
			Thread.sleep((long) (inSeconds * 1000));
		} catch (Exception e) {
			e.printStackTrace();
			// assertTrue(false);
		}
	}

	public void gotoNextPage(String webAddress) {
		driver.get(webAddress);
	}

	
	public WebElement waitUntilElementVisibility(By by) {
		WebElement dynamicElem = null;
		try {
			dynamicElem = (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			logger.error("Error: ", e);
			assertTrue(true);
		}
		return dynamicElem;
	}

	
	/*
	 * public int switchIframes(int index) { int totalIframe = 0; try {
	 * java.util.List<WebElement> iframes =
	 * driver.findElements(By.tagName("iframe")); totalIframe = iframes.size();
	 * System.out.println("Total frame number is: " + totalIframe); driver =
	 * driver.switchTo().frame(index); } catch (Exception e) { e.printStackTrace();
	 * assertTrue(false); } return totalIframe; }
	 */

	public WebElement moveMouseToElementAndClick(By by) {
		WebElement element = null;
		try {
			element = driver.findElement(by);
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			element.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
					"color: red; border: 2px solid yellow;");
		} catch (Exception e) {
			logger.error("Error: ", e);
			assertTrue(true);
		}
		return element;
	}

	public void highlightElement(WebElement element) {

		WrapsDriver wrappedElement = (WrapsDriver) element;
		JavascriptExecutor js = (JavascriptExecutor) wrappedElement.getWrappedDriver();
	}
	
	

	public void clickElement(By by) {
		try {
			WebElement elem = driver.findElement(by);
			elem.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", elem,
					"color: red; border: 2px solid yellow;");

		} catch (Exception e) {
			logger.error("Error: ", e);
			assertTrue(true);
		}
	}
	
	public void btnClickable(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			
			
		}catch (Exception e) {
			logger.error("Error: ", e);
			assertTrue(true);
		}
		
	}
	
	/*
	 * public void btnPresentable(By by) { try { WebDriverWait wait = new
	 * WebDriverWait(driver, 2);
	 * 
	 * 
	 * 
	 * }catch (Exception e) { logger.error("Error: ", e); assertTrue(true); }
	 * 
	 * 
	 * }
	 */

	public void enterTxt(By by, String txt) {
		try {
			WebDriverWait enterTxt = new WebDriverWait(driver, 5);
			enterTxt.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(txt);

		} catch (Exception e) {
			logger.error("Error: ", e);
			// assertTrue(false);
		}
	}

	/*
	 * public void selectDropDown(By by, String optionValue) { try { WebElement
	 * element = driver.findElement(by); Select dropdown = new Select(element);
	 * dropdown.selectByVisibleText(optionValue); } catch (Exception e) {
	 * logger.error("Error: ", e); // assertTrue(false); } }
	 */

	public void dragAndDropBtn(By by, int pixel) {
		try {
			WebElement priceBtn = driver.findElement(by);
			highlightElement(priceBtn);
			Actions act = new Actions(driver);
			customWait(1);
			act.dragAndDropBy(priceBtn, pixel, 0).build().perform();
			customWait(1);
		} catch (Exception e) {
			logger.error("Error: ", e);
			// assertTrue(false);
		}
	}

	
	
	
	
	
	
	
}
