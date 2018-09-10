package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	//CreateLead
	public CreateLeadPage() 
	{
	PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="createLeadForm_companyName")
		WebElement eleCname;
		@And("Enter the company name as (.*)")
		public  CreateLeadPage typeCname(String data) {
		//WebElement eleUname = locateElement("id", "createLeadForm_companyName");
		type(eleCname, data);
		return this;    
		}
		
		@FindBy(id="createLeadForm_firstName")
		WebElement eleFname;
		@And("Enter the First name as (.*)")
		public  CreateLeadPage typeFname(String data) {
		//WebElement eleUname = locateElement("id", "createLeadForm_firstName");
		type(eleFname, data);
		return this;    
		}
		
		@FindBy(id="createLeadForm_lastName")
		WebElement eleLname;
		@And("Enter the Last name as (.*)")
		public  CreateLeadPage typeLname(String data) {
		//WebElement eleUname = locateElement("id", "createLeadForm_firstName");
		type(eleLname, data);
		return this;    
		}
		
		@FindBy(className="smallSubmit")
		WebElement eleClick;
		@When("Create new lead")
		public ViewLeadPage clickSubmit() 
		{
		//WebElement eleClick = locateElement("ClassName", "smallSubmit");
		click(eleClick);
		return new ViewLeadPage();
		
		}			
}