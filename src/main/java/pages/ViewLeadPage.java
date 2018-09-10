package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
	PageFactory.initElements(driver, this);
	}
			
		@FindBy(id="viewLead_firstName_sp")
		WebElement eleFname;
		public  ViewLeadPage verifyFirstName(String fName) {
		//WebElement eleUname = locateElement("id", "createLeadForm_firstName");
			verifyExactText(eleFname, fName);
		return this;    
		}		

		@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		WebElement eleviewlead;
		public  ViewLeadPage clickfindlead() 
		{
		WebElement eleviewlead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleviewlead);
		return this;    
		}
		
		@FindBy(linkText="Delete")
		WebElement eledel;
		public  DeleteLeadPage clickdel() {
		//WebElement eleUname = locateElement("id", "createLeadForm_firstName");
		click(eledel);
		return new DeleteLeadPage();    
		}
		
}







