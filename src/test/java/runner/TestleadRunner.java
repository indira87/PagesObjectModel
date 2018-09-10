package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/clfeatures", glue="steps", monochrome=true)*/


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/clfeatures", 
								glue= {"pages","steps"}, 
								monochrome=true, 
								plugin= {"pretty", "html:CucumberReport"}, 
								dryRun=true, 
								snippets = SnippetType.CAMELCASE
							)

public class TestleadRunner 
{

}

