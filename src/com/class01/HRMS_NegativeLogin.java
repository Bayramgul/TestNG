package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HRMS_NegativeLogin extends CommonMethods {
	/*
	 * TC 2: HRMS Application Negative Login: 1.Open chrome browser 2.Go
	 * to“http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	 * 3.Enter valid username 4.Leave password field empty 5.Verify error message
	 * with text “Password cannot be empty” is displayed.
	 */
	@BeforeMethod
	public void openBrowser() {
		setUp();
	}

	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, "");
		WebElement loginBTN = driver.findElement(By.id("btnLogin"));
		loginBTN.click();
		String expectedMessage = "Password cannot be empty";

		WebElement errorMessage = driver.findElement(By.id("spanMessage"));
		String actualMessage = errorMessage.getText();
		if (expectedMessage.equals(actualMessage) && errorMessage.isDisplayed()) {
			System.out.println("Expected Message Displayed");
		} else {
			System.out.println("Test case not passed. Expected Message is not displayed");
		}
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
