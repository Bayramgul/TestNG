package com.syntax.test;

import com.syntax.pages.LoginPageElemements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		LoginPageElemements login=new LoginPageElemements();
		sendText(login.username,ConfigsReader.getProperty("username"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		if(login.logoSyntax.isDisplayed()) {
			System.out.println("Logo is diplayed:"+ login.logoSyntax.isDisplayed());
			System.out.println("TestCase Passed");
		}
		WaitandClick(login.loginBTN);
		sleep(5);
		tearDown();
		
	}

}
