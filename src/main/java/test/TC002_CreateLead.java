package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testDescription ="Create new Lead";
		category = "Smoke";
		authors= "Indira";
		testNodes = "Leads";
		dataSheetName="TC001";
	}
	
	@Test(dataProvider="fetchData")
	public  void createLeads(String uname, String password, String cName, String fName, String LName){
		new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLead()
		.typeCname(cName)
		.typeFname(fName)
		.typeLname(LName)
		.clickSubmit()
		.verifyFirstName(fName);
		
	}

}


