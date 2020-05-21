package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskTwo {
	@BeforeClass
	public void beforeClass() {//runs only once
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	@Test
public void test1() {
	System.out.println("Test one");
}
	@Test
	public void test2() {
		System.out.println("Test two");
	}
}
