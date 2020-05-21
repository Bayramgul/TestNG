package com.class02;

import org.testng.annotations.Test;

public class TaskOne {
	@Test(priority =3)
	public void fisrtMethod() {
	System.out.println(" fisrtMethod ");
}
	public void fisrtMethod1() {
		System.out.println("fisrtMethod1 ");
	}
	@Test(priority =2)
	public void secondMethod() {
	System.out.println("secondMethod");
}
	@Test(priority =1)
	public void thirdMethod() {
	System.out.println("thirdMethod");
}
	@Test()
	public void fourthMethod() {
	System.out.println("fourthMethod");
}
	
}
