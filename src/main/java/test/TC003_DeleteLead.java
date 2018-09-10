package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testDescription ="Delete Lead";
		category = "Smoke";
		authors= "Indira";
		testNodes = "Leads";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public  void deleteLead(String uname, String password, String email,String errormsg) {
		String first = new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickFindLead()
		.clickemailtab()
		.typeemail(email)
		.clickfindleads()
		.getFirst();
		new FindLeadPage()
		.getfirstlead()
		.clickdel()
		.clickFindLead()
		.clickEnterId(first)
		.verifyText(errormsg);
		
	}

}









