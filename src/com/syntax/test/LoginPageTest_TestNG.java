package com.syntax.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPageElemements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest_TestNG extends CommonMethods {
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}

	@Test
	public void validAdminLogin() {
		LoginPageElemements login = new LoginPageElemements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		WaitandClick(login.loginBTN);

		String expectedUSer = "Welcome Admin";
		String actualUser = dashboard.welcome.getText();
		Assert.assertEquals(expectedUSer, actualUser, "Admin is not logged in");
		Assert.assertTrue(expectedUSer.contains(ConfigsReader.getProperty("username")));
	}

	@Test
	public void InvalidPasswordAdminLogin() {

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "dbscjdkb");
		WaitandClick(login.loginBTN);

		Assert.assertTrue(login.errorMessage.isDisplayed());
		String expectedMessage = "Invalid credentials";
		String actualMessage = login.errorMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		Assert.assertTrue(actualMessage.equals(actualMessage), "Error Messages doesn't match");

	}

	@Test
	public void emptyUsername() {
		sendText(login.password, ConfigsReader.getProperty("password"));
		WaitandClick(login.loginBTN);
		String expectedMessage = "Username cannot be empty";
		String actualMessage = login.errorMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Error Messages doesn't match");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}
