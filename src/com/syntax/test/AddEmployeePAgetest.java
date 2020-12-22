package com.syntax.test;

import com.syntax.utils.CommonMethods;

public class AddEmployeePAgetest extends CommonMethods {
	public void addEmployeePage() {

		login.login();//will login to page

		dashboard.pim.click();//clicks on pim link

		addEmp.addEmp();//will add employee using addEmp method
	}
}
