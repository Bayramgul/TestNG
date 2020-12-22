package com.class03;

import org.testng.Assert;
import org.testng.annotations.*;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

/*
 * US 12678 As an Admin I should be able to create login credentials while adding employee
 * 
 * US 67789 As an admin while adding employee if I leave required fields empty I should see “Required” message
Note: first name and last name are required fields
 */
public class UserStrories_HW extends CommonMethods {
	@BeforeMethod
	public void login_Dash() {
		login.login();
		WaitandClick(dashboard.pim);
		WaitandClick(addEmp.addEmployee);
	}

	@Test(priority=1)
	public void createLognCredentials() {
		sendText(addEmp.firstName, ConfigsReader.getProperty("firstname"));
		sendText(addEmp.lastName, ConfigsReader.getProperty("lastname"));
		addEmp.checkLogn.click();
		addEmp.createEmpLoginCR();
takesScreenshot("screenshots/HRMS/createLognCredentials.png");
	}

	@Test(priority=2)
	public void addEmpNegative() {
		WaitandClick(addEmp.btnSave);
		String ExpectedText = "Required";
		String ActualFirst = addEmp.ErrorMsgFirstNm.getText();
		String ActualLast = addEmp.ErrorMsgLastNm.getText();
		Assert.assertEquals(ActualFirst, ExpectedText, "Error messages DON'T match");
		Assert.assertEquals(ActualLast, ExpectedText, "Error messages DON'T match");
		takesScreenshot("screenshots/HRMS/addEmpNegative.png");
	}
}
