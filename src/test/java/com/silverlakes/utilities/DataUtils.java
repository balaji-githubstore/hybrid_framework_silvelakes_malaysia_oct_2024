package com.silverlakes.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
/*
 * All test case data provider will be kept here.
 */
public class DataUtils {
	
	@DataProvider
	public Object[][] validLoginData()
	{
		Object[][] data=new Object[2][3];
		//i --> number of test case
		//j--> number of parameters 
		
		data[0][0]="accountant";
		data[0][1]="accountant";
		data[0][2]="OpenEMR";
		
		data[1][0]="receptionist";
		data[1][1]="receptionist";
		data[1][2]="OpenEMR";
		
		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException
	{
		//sheetname is the @Test method name
		String sheetname=mtd.getName();
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/openemr_data.xlsx", sheetname);
		return data;
	}

}
