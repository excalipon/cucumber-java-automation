package stepdefinitions;

import cucumber.api.java.en.Given;

/**
 * Created by rcunanan on 7/10/2017.
 */

public class SampleSteps {
    @Given("^Sample$")
    public void sample() throws Throwable {
        System.out.print("Sample");
    }
}
