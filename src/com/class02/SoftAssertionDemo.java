package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SoftAssertionDemo extends CommonMethods {
	@BeforeMethod
	public void openBrowser() {
		setUp();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

	@Test
	public void logoValidation() {
		//Logo Assertion
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		SoftAssert soft=new SoftAssert();
	soft.assertTrue(logo.isDisplayed());//-->this is soft assert and if condition is false the rest of the code will continue executing
		//Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
	//hard assertion if condition is false rest of the code terminates and won't execute
	soft.assertAll();// we need this for marking failing test as failed, after soft.assertAll()execution stops
	}

	@Test
	public void validLogin() {
		//Logging Assertion
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		WebElement loginBTN = driver.findElement(By.id("btnLogin"));
		loginBTN.click();
		 WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
		 String welcomeText=welcomeAdmin.getText();
		 Assert.assertTrue(welcomeText.contains("Admin"));
		 System.out.println("Welcome Admin is displayed");
		
}}
