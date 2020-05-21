package com.class02;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	/*Steps to group tests 
	 * 1)define groups inside class
	 * 2)create xml file
	 * 3)in xml file, under name <groups> 
	 * <run>   <include name="sanity"></include>
	 *  <run> <groups>
	 * 4) meta groups==we can create custom groups as well
	 */
	
	
	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("I am inside test Test 1");
	}
	 @Test(groups = {"sanity","smoke"})
	public void Test2() {
		System.out.println("I am inside test Test 2");
	}
	@Test(groups = {"sanity","regression"})
	public void Test3() {
		System.out.println("I am inside test Test 3");
	}
	@Test
	public void Test4() {
		System.out.println("I am inside test Test 4");
	}
}
