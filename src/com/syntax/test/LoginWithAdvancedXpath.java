package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		//identify username based on parent's sibling
		WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		//identify password based on parent's sibling
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		sendText(password, ConfigsReader.getProperty("password"));
		//identify login based on parent's sibling
		//WebElement LoginBTN=driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input"));
		//identify login based on grand  parent
		WebElement LoginBTN=driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[5]/input"));
		LoginBTN.click();
		sleep(5);
		tearDown();
	}

}
