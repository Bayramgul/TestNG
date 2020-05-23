package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//www.google.com
import com.syntax.utils.CommonMethods;

public class GoogleTest extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

}
