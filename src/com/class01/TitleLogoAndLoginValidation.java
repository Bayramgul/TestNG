package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	@BeforeMethod(alwaysRun=true) 
	public void openBrowserandGetUrl() {
		setUp();
	}
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
@Test
public void titleValidation() {
	String expectedTitle="Human Management System";
	String actualTitle=driver.getTitle();
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Test case passed");
	}
}
@Test
public void logoValidation() {
	WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	if(logo.isDisplayed()) {
		System.out.println("Logo is displayed");
	}
}
@Test
public void loginValidation() {
	 WebElement username=driver.findElement(By.id("txtUsername"));
	 sendText(username, "Admin");
	 WebElement password=driver.findElement(By.id("txtPassword"));
	 sendText(password, "Hum@nhrm123");
	 WebElement loginBTN=driver.findElement(By.id("btnLogin"));
	 loginBTN.click();
	 WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
	 String welcomeText=welcomeAdmin.getText();
	 if(welcomeText.contains("Admin")) {
		 System.out.println("You are logged in");
	 }
}


}
