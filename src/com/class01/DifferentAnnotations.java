package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DifferentAnnotations {
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before Method");
}
@AfterMethod
public void afterMethod () {
	System.out.println("After Method");
}
@Test
public void test() {
	System.out.println("Actual test Case is running");
}
@BeforeSuite//better when we use testNg html file
public void beforeSuit() {
	System.out.println("Before suit");
}
}
