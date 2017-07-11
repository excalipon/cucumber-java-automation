package pageobjects;

import helper.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rcunanan on 7/3/2017.
 */

public class HomePage extends DriverFactory {

    @FindBy(css = "a.login-link.btn-clear")
    private static WebElement loginLink;

    @FindBy(name = "q")
    private static WebElement searchBox;

    @FindBy(css = "button.btn.js-search-submit")
    private static WebElement searchBtn;

    @FindBy(className = "results-label")
    private static WebElement resultsLbl;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void clickLoginLink() {
        loginLink.click();
    }

    public void typeOnSearchBox(String searchTerm) throws Throwable {
        searchBox.sendKeys(searchTerm);
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public String getResultsLabel() {
        return resultsLbl.getText();
    }

}
