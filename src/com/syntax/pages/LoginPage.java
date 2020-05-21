package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods{

	
	public WebElement username=driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBTN=driver.findElement(By.id("btnLogin"));
	public  WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	
	 

}
