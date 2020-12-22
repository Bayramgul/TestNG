package com.syntax.utils;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.DashBoardPage;
import com.syntax.pages.LoginPageElemements;
import com.syntax.pages.ViewPersonalDetails;
import com.syntax.pages.sauceDemoLoginPage;

public class PageInitializer extends BaseClass {
	public static LoginPageElemements login;
	public static DashBoardPage dashboard;
	public static ViewPersonalDetails pdetails;
	public static AddEmployeePage addEmp;
	public static sauceDemoLoginPage demosauce;

	public static void initialize() {
		login = new LoginPageElemements();
		dashboard = new DashBoardPage();
		pdetails = new ViewPersonalDetails();
		addEmp = new AddEmployeePage();
		demosauce = new sauceDemoLoginPage();
	}

}
