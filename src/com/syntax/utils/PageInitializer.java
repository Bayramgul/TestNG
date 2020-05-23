package com.syntax.utils;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElemements;
import com.syntax.pages.ViewPersonalDetails;

public class PageInitializer extends BaseClass{
	public static LoginPageElemements login;
	public static DashBoardPageElements dashboard;
	public static ViewPersonalDetails pdetails;

	public static void initialize() {
		login = new LoginPageElemements();
		dashboard = new DashBoardPageElements();
		pdetails = new ViewPersonalDetails();
	}

}
