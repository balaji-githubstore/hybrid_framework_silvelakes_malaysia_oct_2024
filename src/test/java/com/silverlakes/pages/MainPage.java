package com.silverlakes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.silverlakes.base.WebDriverKeywords;

/**
 * Common elements such as menu, profile section are handled here
 */
public class MainPage extends WebDriverKeywords {

	private By patientLocator = By.xpath("//div[text()='Patient']");

	private WebDriver driver;

	public MainPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getMainPageTitle() {
		return driver.getTitle();
	}

	public void clickOnPatientMenu() {
		clickOnElement(patientLocator);
	}
}
