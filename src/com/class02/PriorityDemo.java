package com.class02;

import org.testng.annotations.*;

public class PriorityDemo {
	//if 2 or more cases have same priority number, then they will be executed in alphabetical order 
	//if class both has prioritized and non prioritized methods then 1st non prioritized will be executed
	//and then others are printed according to priority
	//when we have all methods non prioritized then all will executed according to method name alphabetically
	@Test(priority =1)
	public void Test1() {
	System.out.println("I am inside test one");
}
	@Test
	public void Test2() {
	System.out.println("I am inside test two");
}
	@Test(priority =2)
	public void Test3() {
	System.out.println("I am inside test three");
}
}
