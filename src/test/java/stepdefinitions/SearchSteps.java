package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.DriverFactory;
import org.testng.Assert;
import pageobjects.HomePage;

/**
 * Created by rcunanan on 7/4/2017.
 */

public class SearchSteps extends DriverFactory {

    @When("^the user searches \"(.+)\"$")
    public void theUserSearches(String keyWord) throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        //HomePage.searchBox.sendKeys(keyWord);
        new HomePage(driver).typeOnSearchBox(keyWord);
    }

    @And("^the user clicks the search button$")
    public void theUserClicksTheSearchButton() throws Throwable {
        //HomePage.searchBtn.click();
        new HomePage(driver).clickSearchBtn();
    }

    @Then("^the results are displayed$")
    public void theResultsAreDisplayed() throws Throwable {
        Assert.assertEquals(new HomePage(driver).getResultsLabel(), "results");
    }

    @And("^the user closes the browser$")
    public void theUserClosesTheBrowser() throws Throwable {
        driver.quit();
    }

}
