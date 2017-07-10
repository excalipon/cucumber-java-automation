package stepdefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by rcunanan on 7/10/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"src\\test\\resources\\features"}
)

public class TestRunner {

}
