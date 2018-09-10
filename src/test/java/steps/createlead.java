//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//
//public class createlead {
//	
//	public ChromeDriver driver;
//	@Given("Launch browser")
//	public void launchbrowser() 
//	{
//	// Create Object
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	driver = new ChromeDriver();
//	}
//	
//	@And("Load URL")
//	public void loadurl()
//	{
//	//Load URL
//	driver.get("http://leaftaps.com/opentaps/");
//	}
//	
//	@And("Maximize browser")
//	public void maximize()
//	{
//	//Maximize()
//    driver.manage().window().maximize();
//	}
//	
//	@And("set timeouts")
//	public void managetime()
//	{
//    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	}
//	
//	@And("Enter Username as (.*)")
//	public void username(String username)
//	{
//	//Enter UserName
//	driver.findElementById("username").sendKeys(username);
//	}
//	
//	@And("Enter Password as (.*)")
//	public void password(String pwd)
//	{
//	//Enter Password
//	driver.findElementById("password").sendKeys(pwd);
//	}
//	@When("Login click")
//	public void loginbutton()
//	{
//	//Click Login Button
//	driver.findElementByClassName("decorativeSubmit").click();
//	}
//	
//	@And("crmsfa is click")
//	public void crmsfa()
//	{
//	//Click crmsfa  
//	driver.findElementByLinkText("CRM/SFA").click();
//	}
//	
//	@And("Leads is click")	
//	public void clicklead()
//	{
//	driver.findElementByLinkText("Leads").click();
//	}
//	
//	@And("CreateLeads is click")
//	public void createleads()
//	{
//	driver.findElementByLinkText("Create Lead").click();
//	}
//	
//	@And("Enter the company name")
//	public void typecName()
//	{
//    driver.findElementById("createLeadForm_companyName").sendKeys("TCCS");
//	}
//	@And("Enter the First name")
//	public void typefName()
//	{
//    driver.findElementById("createLeadForm_firstName").sendKeys("Indira");
//	}
//	@And("Enter the Last name")
//	public void typelName()
//	{
//    driver.findElementById("createLeadForm_lastName").sendKeys("G");
//	}
//	
//	@When("Create new lead")
//	public void submitnewlead()
//	{
//	driver.findElementByClassName("smallSubmit").click();
//}
//	}
