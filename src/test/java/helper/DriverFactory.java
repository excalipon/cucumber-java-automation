package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.PropertyReader;

/**
 * Created by rcunanan on 7/3/2017.
 */

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    public void initialize(){
        if (driver == null)
            createNewDriverInstance();
    }

    public void createNewDriverInstance(){
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\workspace\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver",
                    "C:\\workspace\\drivers\\chromedriver.exe");
        } else if(browser.equals("firefox"))
        {
            System.setProperty("webdriver.ie.driver",
                    "C:\\workspace\\drivers\\chromedriver.exe");
        } else {
            System.out.println("can't read browser type");
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}
