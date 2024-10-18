package com.silverlakes.test;

import org.testng.annotations.Test;

import com.silverlakes.base.AutomationWrapper;
import com.silverlakes.pages.LoginPage;

public class PatientTest extends AutomationWrapper {
	@Test
	public void addValidPatientTest()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("admin");
		login.enterPassword("pass");
		login.clickOnLogin();

	}

}
