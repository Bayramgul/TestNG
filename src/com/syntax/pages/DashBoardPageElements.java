package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class DashBoardPageElements {

	
		@FindBy(id="welcome")
		public WebElement welcome;
		
		@FindBy(id="menu_pim_viewPimModule")
		public WebElement pim; 
		
		
		
		public DashBoardPageElements(){
			PageFactory.initElements(BaseClass.driver, this);	
		}
		
	
}
