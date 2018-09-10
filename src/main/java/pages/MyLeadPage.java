package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods {

	public MyLeadPage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Lead")
	WebElement eleClick;
	@And("CreateLeads is click")
	public CreateLeadPage clickCreateLead() 
	{
	//WebElement eleClick = locateElement("LinkText", "Create Lead");
	click(eleClick);
	return new CreateLeadPage();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement elefindlead;
	public FindLeadPage clickFindLead() 
	{
	//WebElement eleClick = locateElement("LinkText", "Create Lead");
	click(elefindlead);
	return new FindLeadPage();
	}
}






