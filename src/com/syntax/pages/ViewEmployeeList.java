package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class ViewEmployeeList {
	@FindBy (id="menu_pim_addEmployee")
	public WebElement addEmployee;
	
	
	public ViewEmployeeList() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
