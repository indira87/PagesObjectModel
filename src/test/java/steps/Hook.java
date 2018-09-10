package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods{
	
	@Before
	public void beforeScenario(Scenario sc)
	{
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startResult();
		startTestModule(sc.getName(),sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("Indira");
		startApp("chrome", "http://leaftaps.com/opentaps/");
	}
	@After
	public void afterScenario()
	{
		closeAllBrowsers();
		endResult();
	}	
}
