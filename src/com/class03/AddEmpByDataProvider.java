package com.class03;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ExcelUtility;
import com.syntax.utils.PageInitializer;

public class AddEmpByDataProvider extends CommonMethods {
	@BeforeMethod
	public void login_Dash() {
		login.login();
		WaitandClick(dashboard.pim);
		WaitandClick(addEmp.addEmployee);
	}

	@Test(dataProvider = "userData")
	public void createLognCredentials(String firstname, String lastname, String username, String password) {
		sendText(addEmp.firstName, firstname);
		sendText(addEmp.lastName, lastname);
		String expectedEmpId = addEmp.empId.getAttribute("value");
		addEmp.checkLogn.click();
		// addEmp.createEmpLoginCR();
		
		sendText(addEmp.userName, username);
		sendText(addEmp.userPassword, password);
		sendText(addEmp.confirmPasswrd, password);
		sleep(2);
		jsClick(addEmp.btnSave);
		// Validation
		
		waitForVisibility(pdetails.empID);
		String actualEmpId = pdetails.empID.getAttribute("value");
		
		sleep(2);
		Assert.assertEquals(actualEmpId, expectedEmpId);
		// TakesScreenshot(screenshot);
		takesScreenshot(firstname + "_" + lastname);

	}

	@DataProvider(name = "userData")
	public Object[][] getData() {
		Object[][] data = { { "Marala", "Annayeva", "Marla0173", "Mar@l123%%" } };
//						{"Jerena","Annayeva","Jerena1222","Jeren@1234%%"},
//						{"Lachyna","Annayeva","Lachynaa12231","L@chyn12%%"},
//						{"Altyna","Annayeva","Altyn09521","L@chyn12%%"},
//						{"Myahrisha","Annayeva","Myahri08255","My@hri12%%"}};
		return data;
	}

//	@DataProvider(name = "userDataFromExcel")
//	public Object[][] getData2() {// we pass excel filepath and sheetName
//		return ExcelUtility.excelIntoArray(System.getProperty("user.dir") + "/ExcelData/Test.xlsx", "Employee");
//	}

}
