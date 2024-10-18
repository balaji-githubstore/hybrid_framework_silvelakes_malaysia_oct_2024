package com.silverlakes.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.silverlakes.base.AutomationWrapper;
import com.silverlakes.pages.LoginPage;
import com.silverlakes.pages.MainPage;
import com.silverlakes.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {
	//@Test(dataProviderClass = DataUtils.class, dataProvider = "validLoginData")
	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validLoginTest(String username, String password, String expectedTitle) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		MainPage main = new MainPage(driver);
		String actualTitle = main.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidLoginTest(String username,String password,String expectedError) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertTrue(actualError.contains(expectedError)); // expect true
	}
}
