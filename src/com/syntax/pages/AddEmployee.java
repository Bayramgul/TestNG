package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddEmployee extends CommonMethods{
	@FindBy (id="menu_pim_addEmployee")
	public WebElement addEmployee;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	public WebElement empId;
	
	@FindBy(id="photofile")
	public WebElement photofile;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
	
	
	
	public AddEmployee() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void enterNames() {
		sendText(firstName, ConfigsReader.getProperty("empFirstname"));
		sendText(lastName, ConfigsReader.getProperty("emplastNAme"));
	}
}
