package com.class02;
/*
 * TC 1: HRMS Add Employee: 
1.Open chrome browser
 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * 3.Login into the application
 * 4.Click on Add Employee
 * 5.Verify labels: Full Name, Employee Id, Photograph are displayed
 * 6.Provide Employee First and Last Name
 * 7.Add a picture to the profile
 * 8.Verify Employee has been added successfully
 * 9.Close the browser
 */

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.DashBoardPage;
import com.syntax.pages.LoginPageElemements;
import com.syntax.pages.ViewPersonalDetails;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddEmployeeValidation extends CommonMethods {
	private static String firstname = "Gul";
//	private static String lastName ="Atageldiyeva";
	// private static String
	// photofile="/Users/Bayramgul/eclipse-workspace/TestNGBatchVI/screenshots/profile
	// pic.jpg";
//	@BeforeClass
//	public void openBrowser() {
//		setUp();
//	}
//	@AfterClass 
//	public void quitBrowser(){
//		//tearDown();
//	}

	@Test(priority = 1)
	public void validLogin() {
		// LoginPageElemements login = new LoginPageElemements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		WaitandClick(login.loginBTN);
	}

	@Test(priority = 2)
	public void addEmployee() {
		validLogin();
		// DashBoardPageElements dash = new DashBoardPageElements();
		WaitandClick(dashboard.pim);

		// AddEmployeePage add = new AddEmployeePage();
		WaitandClick(addEmp.addEmployee);
		sleep(2);
		Assert.assertTrue(addEmp.firstName.isDisplayed(), "firstName is not displayed");
		Assert.assertTrue(addEmp.lastName.isDisplayed(), "LastName is not displayed");
		Assert.assertTrue(addEmp.empId.isDisplayed());
		Assert.assertTrue(addEmp.photofile.isDisplayed());

		sendText(addEmp.firstName, ConfigsReader.getProperty("firstname"));
		sleep(2);
		sendText(addEmp.lastName, ConfigsReader.getProperty("lastname"));
		addEmp.photofile.sendKeys(ConfigsReader.getProperty("photofile"));
		sleep(1);
		WaitandClick(addEmp.btnSave);

	}

	@Test(priority = 3)
	public void verifyEmp() {
		addEmployee();
		ViewPersonalDetails detail = new ViewPersonalDetails();
		String profileName = detail.profilePic.getText();
		Assert.assertTrue(profileName.contains(firstname));
		System.out.println("Employee successfully added");
	}
}
