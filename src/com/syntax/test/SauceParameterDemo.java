package com.syntax.test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;

public class SauceParameterDemo extends CommonMethods {
	@Parameters ({"username", "password"})
	@Test
	public void loginToSauceDemo(String username, String password) {
		sendText(demosauce.userName, username);
		sendText(demosauce.password, password);
		WaitandClick(demosauce.LoginBTN);
		sleep(2);
	}
}
