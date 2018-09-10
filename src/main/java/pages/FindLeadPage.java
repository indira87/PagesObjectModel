package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods 
{

	public FindLeadPage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Email']")	
	WebElement elemail;
	public  FindLeadPage clickemailtab() 
	{
	//WebElement elemail = locateElement("xpath", "//span[text()='Email']");
	click(elemail);
	return this;    
	}
	
	@FindBy(name="emailAddress")
	WebElement elemailid;
	public  FindLeadPage typeemail(String email) 
	{
		//WebElement elemailid = locateElement("emailAddress");
		type(elemailid, email);
	    
	return this;    
	}
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement elefindlead;
	public  FindLeadPage clickfindleads()   
	{
	//WebElement elefindlead = locateElement("xpath", "//button[text()='Find Leads']");
	click(elefindlead);
	//Thread.sleep(2000);
	return this;    
	}
	
	@FindBy(name="id")
	WebElement eleenterid;
	public  FindLeadPage clickEnterId(String data)   
	{
	//WebElement elefindlead = locateElement("xpath", "//button[text()='Find Leads']");
	type(eleenterid, data);
	//Thread.sleep(2000);
	return this;    
	}

	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement clickfirstlead;
	public String getFirst()
	{
	 String Clickfirst = getText(clickfirstlead);
	 return Clickfirst;
	}
	public  ViewLeadPage getfirstlead() {
	//	WebElement firstlead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.elementToBeClickable(firstlead));
		click(clickfirstlead);
		return new ViewLeadPage();
		
    }
	
	@FindBy(className="x-paging-info")
	WebElement eleVerify;
	public FindLeadPage verifyText(String data)
	{
	  verifyExactText(eleVerify,data);
	  return this;
	}

	@FindBy(xpath="//span[text()='Phone']")	
	WebElement elePhone;
	public  FindLeadPage clickPhonetab() 
	{
	//WebElement elePhone = locateElement("xpath", "//span[text()='Phone']");
	click(elePhone);
	return this;    
	}
	
	@FindBy(name="phoneNumber")
	WebElement elephoneNumber;
	public  FindLeadPage typephnNumber(String phnNumber) 
	{
		//WebElement elephoneNumber = locateElement("elephoneNumber");
		type(elephoneNumber, phnNumber);
	    
	return this;    
	}
	
}
	