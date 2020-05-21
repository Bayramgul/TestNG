package com.class02;

import org.testng.annotations.Test;

public class EnableDisableDemo {
	
	@Test(priority =1)
	public void firstTest() {
		System.out.println("I am inside first one");
	}

	@Test(priority =2)
	public void SecondTest() {
		System.out.println("I am inside second one");
	}

	@Test(enabled = false)//1) first way we just disabled this test case
	public void ThirdTest() {
		System.out.println("I am inside third one");
	}
}
