package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HRMS_Test extends CommonMethods {
	public static void main(String[] args) {
		setUp();
		LoginPage login=new LoginPage();
		sendText(login.username,ConfigsReader.getProperty("username"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		if(login.logo.isDisplayed()) {
			System.out.println("Logo is diplayed:"+ login.logo.isDisplayed());
			System.out.println("TestCase Passed");
		}
		WaitandClick(login.loginBTN);
		sleep(5);
		tearDown();
		
	}
}
