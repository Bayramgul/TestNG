package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

/*
 * Three Test cases
before: open browser, navigate to the website
1. Test Case: Title Validation
after: quit the browser
before: open browser, navigate to the website
2. Test Case: Logo Validation
after: quit the browser
before: open browser, navigate to the website
3. Test Case Valid Login
after: quit the browser
 */
public class TitleLogoAndLoginValidation extends CommonMethods{
	@BeforeMethod(alwaysRun = true)
	public void openBrowser() {
		setUp();
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		tearDown();
	}

	@Test(priority=1,groups="Regression")
	public void ttileValidation() {
		String expectedTitle="Human Management Systems";
		String actualTitle=driver.getTitle();//Human Management System
		//1st way
		Assert.assertEquals(expectedTitle, actualTitle,"Title doesn't match");
			
		//2nd way.message will only appear when there is only fails and it is an AssertionError NOT AN EXCEPTION
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Text after Assertion");
	
	}
	@Test(priority=2, groups="Regression")
	public void logoValidation() {
	boolean islogoDisplayed=driver.findElement(By.xpath("//div[@id='branding']//img")).isDisplayed();
	islogoDisplayed=false;
	Assert.assertTrue(islogoDisplayed, "Syntax Logo is not displayed");
		
	}


}
