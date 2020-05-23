package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FacebookSignUp extends CommonMethods{
	/*
	 * Using Functions only signup to facebook
	 */

	public static void main(String[] args) throws InterruptedException {
		setUp();
		String name=ConfigsReader.getProperty("name");
		String lastname=ConfigsReader.getProperty("lastname");
		String password=ConfigsReader.getProperty("password");
		String email=ConfigsReader.getProperty("email");
		WebElement username= driver.findElement(By.cssSelector("input[name='firstname']"));
		sendText(username, name);
		
		WebElement LastName=driver.findElement(By.cssSelector("input[name='lastname']"));
		sendText(LastName, lastname);
		
		WebElement Email= driver.findElement(By.cssSelector("input[name='reg_email__']"));
		sendText(Email, email);
		WebElement confirmEmail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		sendText(confirmEmail, email);
		WebElement Password=driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		sendText(Password, password);
		WebElement monthDD=driver.findElement(By.id("month"));
		selectDDValue(monthDD,"Nov");
		WebElement dayDD=driver.findElement(By.id("day"));
		selectDDValue(dayDD,2);
		WebElement yearDD=driver.findElement(By.id("year"));
		selectDDValue(yearDD,"1990");
		Thread.sleep(2000);
		List<WebElement> radioB = driver.findElements(By.xpath("//input[@name='sex']"));
		clickRadiOrCheckbox(radioB, "1");
		
		WebElement signUp=driver.findElement(By.cssSelector("button[name='websubmit']"));
		
		signUp.click();
		System.out.println("You signed up Facebook.Test Case Passed");
	}

}
