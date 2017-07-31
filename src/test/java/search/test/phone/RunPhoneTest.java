package search.test.phone;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(value = Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features/"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
           
)



public class RunPhoneTest {

}
