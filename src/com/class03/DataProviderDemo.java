package com.class03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;
/*
 * This is called Test Parameterization or DataDriven testing-which is testing same functionality with different sets of data(using different
 *  sets of  parameters
 * and data provider has internal looping, uses the mechanism of loop
  Create the data provider method with@DataProvider
annotations. (Methods return type must be two-dimensional
object arrays)
 Declare the “Data Provider” name after the @Test annotation.
Like – @Test (dataProvider = “data provider method name”)
 Pass the arguments in the Test method, what you want to use
from the data provider.
 */
public class DataProviderDemo extends CommonMethods {
	@Test(dataProvider="ExcelData")////we use dataProvider attribute  to use the 2D array info, inside 
	public void login(String username, String password) {//number of parameter should match number of columns inside getData
		sendText(login.username, username);
		sendText(login.password, password);
		WaitandClick(login.loginBTN);
		boolean isDisplayed=dashboard.welcome.isDisplayed();
		takesScreenshot("screenshots/HRMS/loginDataprovider.png");
		Assert.assertTrue(isDisplayed, "Message Welcome is not displayed");
	}
	@DataProvider(name="getData")
	public Object[][]getData(){//this is for loop of TestNG
		//better to use Object bcuz it is more global
		Object[][]data= {{"Admin","Hum@nhrm123"},//every row is set of data
						{"Syntax","Syntax123"},//number of rows will decide how many times this method will run
						{"SyntaxUser","Syntax123"}};
		return data;
	}
	@DataProvider (name="ExcelData")
	public Object [][] excelData(){
		return ExcelUtility.excelIntoArray(Constants.EXCELDATA_FILEPATH, "sheet1");
	
	}
	
}
