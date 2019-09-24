
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/features",glue={"steps"})	
public class Runner { 
	
}