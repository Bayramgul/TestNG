package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

/*
 * go to https://www.saucedemo.com
 sign in
 verify the products text appears
quit
go to https://www.saucedemo.com
 sign in
on the sorting dropdown select Price (low to high)
verify product Sauce Labs Onesi appears first
 */
public class TaskAlijon extends CommonMethods {
	@BeforeMethod
	public void siginPage() {
		setUp();
		WebElement username=driver.findElement(By.id("user-name"));
		sendText(username, "standard_user");
		WebElement password=driver.findElement(By.id("password"));
		sendText(password, "secret_sauce");
		WebElement login=driver.findElement(By.xpath("//input[@value='LOGIN']"));
		WaitandClick(login);
		
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	@Test
	public void verifyText() {
		WebElement logo=driver.findElement(By.xpath("//div[text()='Products']"));
		Assert.assertTrue(logo.isDisplayed(), "Product is not appeared");
		System.out.println(logo.getText()+" is appeared");
	}
	@Test
	public void selectDD() {
		WebElement DD=driver.findElement(By.className("product_sort_container"));
		selectDDValue(DD, "Price (low to high)");
		WebElement firstitem=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		Assert.assertTrue(firstitem.getText().equals("Sauce Labs Backpack"));
	}
}
