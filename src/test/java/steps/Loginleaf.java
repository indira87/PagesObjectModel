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
//public class Loginleaf {
//	
//	public ChromeDriver driver;
//	@Given("Launch the browser")
//	public void launchbrowser() 
//	{
//	// Create Object
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	driver = new ChromeDriver();
//	}
//	
//	@And("Load the URL")
//	public void loadurl()
//	{
//	//Load URL
//	driver.get("http://leaftaps.com/opentaps/");
//	}
//	
//	@And("Maximize the browser")
//	public void maximize()
//	{
//	//Maximize()
//    driver.manage().window().maximize();
//	}
//	
//	@And("set timeout")
//	public void managetime()
//	{
//    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	}
//	
//	@And("Enter the Username as DemoSalesManager")
//	public void username()
//	{
//	//Enter UserName
//	driver.findElementById("username").sendKeys("DemoSalesManager");
//	}
//	
//	@And("Enter the Password as crmsfa")
//	public void password()
//	{
//	//Enter Password
//	driver.findElementById("password").sendKeys("crmsfa");
//	}
//	@When("Login is click")
//	public void loginbutton()
//	{
//	//Click Login Button
//	driver.findElementByClassName("decorativeSubmit").click();
//	}
//	
//	
//}
