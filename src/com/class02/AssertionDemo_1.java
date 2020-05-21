package com.class02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AssertionDemo_1 extends CommonMethods {

	@BeforeMethod
	public void openBrowser() {
		setUp();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

	@Test
	public void ttileValidation() {
		String expectedTitle="Human Management Systems";
		String actualTitle=driver.getTitle();
		//1st way
		Assert.assertEquals(expectedTitle, actualTitle,"Title doesn't match");
			
		//2nd way.message will only appear when there is only fails and it is an AssertionError NOT AN EXCEPTION
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Text after Assertion");
	
	}
	@Test
	public void logoValidation() {
		WebElement logo=driver.findElement(By.xpath("//div[@id='branding']//img"));
		
	}
}
