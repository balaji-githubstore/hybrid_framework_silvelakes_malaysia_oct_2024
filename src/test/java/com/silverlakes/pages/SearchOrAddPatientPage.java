package com.silverlakes.pages;

import org.openqa.selenium.WebDriver;

import com.silverlakes.base.WebDriverKeywords;

public class SearchOrAddPatientPage extends WebDriverKeywords {
	private WebDriver driver;
	
	public SearchOrAddPatientPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
}
