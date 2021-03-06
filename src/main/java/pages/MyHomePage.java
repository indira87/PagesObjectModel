package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {

	public MyHomePage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Leads")
	WebElement eleClick;
	@And("Leads is click")
	public MyLeadPage clickLead() 
	{
	//WebElement eleClick = locateElement("LinkText", "Leads");
	click(eleClick);
	return new MyLeadPage();
}
}