package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * User should be able to login application  with valid credentials
		 */
		//open browser and navigate to url
		setUp();
		//sending username
		WebElement username=driver.findElement(By.id("txtUsername"));//identifying element username
		sendText(username,ConfigsReader.getProperty("username"));//we are passing the  username and value of username
		//sending password
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password,ConfigsReader.getProperty("password"));//we are passing the  password and value of password
		//click on login
		
		//close browser
		tearDown();
	}

}
