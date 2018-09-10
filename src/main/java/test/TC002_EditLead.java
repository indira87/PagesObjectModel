package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC002_EditLead";
		testDescription ="Edit a lead";
		category = "Smoke";
		authors= "Babu";
		testNodes = "Leads";
		dataSheetName="TC002";
		
	}
	@Test(dataProvider="fetchData")
	public  void editLead(String uname, String password, String phnNumber, String updateCname)  throws InterruptedException {
		
		new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickFindLead()
		.clickPhonetab()
		.typephnNumber(phnNumber)
		.clickfindleads()
		.clickEnterId()
		.
		
	}

}
