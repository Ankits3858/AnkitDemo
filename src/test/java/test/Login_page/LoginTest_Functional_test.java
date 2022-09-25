package test.Login_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pageobjects.LoginPage;
import resources.BaseClass;
import utilities.CommonUtils;

import java.io.IOException;

public class LoginTest_Functional_test extends BaseClass {
    public WebDriver driver;


    @Test
    public void login_test() throws IOException, InterruptedException {
CommonUtils cu = new CommonUtils(driver);
cu.login();
logger.info("login is working fine");

// validate with valid credentials

    }
    @BeforeMethod
    public void openApplication() throws IOException, InterruptedException {

        driver = initializeDriver();
       logger.info("Browser got launched");
       driver.get(prop.getProperty("url"));
       logger.info("browser opened successfully");



    }

    @AfterMethod
    public void closure()
    {
        driver.close();
        logger.info("browser closed successfully");
    }

}

