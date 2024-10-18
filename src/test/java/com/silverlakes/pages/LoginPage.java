package com.silverlakes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.silverlakes.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords {

	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.cssSelector("#clearPass");
	private By loginLocator = By.id("login-button");
	private By errorLocator = By.xpath("//p[contains(text(),'Invalid')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterUsername(String username) {
		//driver.findElement(usernameLocator).sendKeys(username);
		super.typeOnElement(usernameLocator, username);
	}

	public void enterPassword(String password) {
		//driver.findElement(passwordLocator).sendKeys(password);
		typeOnElement(passwordLocator, password);
	}

	public void clickOnLogin() {
		//driver.findElement(loginLocator).click();
		clickOnElement(loginLocator);
	}

	public String getInvalidErrorMessage() {
		//return driver.findElement(errorLocator).getText();
		return super.getTextFromElement(errorLocator);
	}

	public String getUsernamePlaceholder() {
		//return driver.findElement(usernameLocator).getAttribute("placeholder");
		return super.getAttributeValueFromElement(usernameLocator, "placeholder");
	}
}
