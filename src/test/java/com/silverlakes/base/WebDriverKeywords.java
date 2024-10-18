package com.silverlakes.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeywords {

	private WebDriver driver;

	public WebDriverKeywords(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnElement(By locator) {
		driver.findElement(locator).click();
	}

	public void typeOnElement(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getTextFromElement(By locator) {
		return driver.findElement(locator).getText();
	}

	public String getAttributeValueFromElement(By locator, String attributeName) {
		return driver.findElement(locator).getAttribute(attributeName);
	}

	public void switchTabByTitle(String title) {
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}
}
