package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.DriverFactory;
import org.testng.Assert;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import util.PropertyReader;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends DriverFactory {

    private String userName;
    private String password;

    public LoginSteps() {
        userName = new PropertyReader().readProperty("username");
        password = new PropertyReader().readProperty("password");
    }

    @When("^the user clicks the login link on header$")
    public void theUserClickTheLoginLinkOnHeader() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        new HomePage(driver).clickLoginLink();
    }

    @And("^the user is logged in$")
    public void theUserIsLoggedIn() throws Throwable {
        new LoginPage(driver).addUserEmail(userName);
        new LoginPage(driver).addPassword(password);
    }

    @And("^the user adds username \"([^\"]*)\"$")
    public void theUserAddsUsername(String userName) throws Throwable {
        //PageFactory.initElements(driver, LoginPage.class);
        new LoginPage(driver).addUserEmail(userName);
    }

    @And("^the user adds password \"([^\"]*)\"$")
    public void theUserAddsPassword(String password) throws Throwable {
        new LoginPage(driver).addPassword(password);
    }

    @And("^the user clicks the login button$")
    public void theUserClicksTheLoginButton() throws Throwable {
        new LoginPage(driver).clickLoginButton();
    }

    @Then("^the landing home page is displayed$")
    public void theLandingHomePageIsDisplayed() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(new LoginPage(driver).getTopQuestionsLabel(),
                "Top Questions");
    }

}