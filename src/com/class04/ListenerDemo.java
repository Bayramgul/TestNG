package com.class04;

import org.junit.Assert;
import org.testng.annotations.*;

import com.syntax.utils.CommonMethods;

public class ListenerDemo extends CommonMethods {
	//if you don't initialize driver and try to get the screenshot in Listener it'll throw nullPointerException bcuz u havn't initialized it 
	//so you either extend CommonMethods or alwaysRun setUp and tearDown methods
	//@BeforeMethod(alwaysRun = true)
	public void openBrowser() {
		setUp();
	}

	//@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		tearDown();
	}
	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertTrue(false);
	}
}
