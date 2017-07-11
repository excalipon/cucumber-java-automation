package pageobjects;

import helper.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rcunanan on 7/3/2017.
 */

public class LoginPage extends DriverFactory {

    @FindBy(id = "email")
    private static WebElement emailTxtBox;

    @FindBy(id = "password")
    private static WebElement passTxtBox;

    @FindBy(id = "submit-button")
    private static WebElement loginButton;

    @FindBy(id = "h-top-questions")
    private static WebElement topQLbl;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void addUserEmail(String userEmail) throws Throwable {
        emailTxtBox.sendKeys(userEmail);
    }

    public void addPassword(String pass) throws Throwable {
        passTxtBox.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getTopQuestionsLabel() throws Throwable {
        return topQLbl.getText();
    }

}
