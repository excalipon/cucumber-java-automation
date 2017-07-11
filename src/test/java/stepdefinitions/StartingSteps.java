package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import helper.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import util.PropertyReader;

/**
 * Created by rcunanan on 7/6/2017.
 */

public class StartingSteps extends DriverFactory {

    private WebDriver driver;

    String URL = new PropertyReader().readProperty("testURL");

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES), "image/png");
        }
    }

    @AfterSuite
    public void afterScenario() {
        driver.quit();
        new DriverFactory().destroyDriver();
    }

    @Given("^the user is on the landing page$")
    public void theUserIsOnTheLandingPage() {
        driver.manage().window().maximize();
        driver.get(URL);
    }

}
