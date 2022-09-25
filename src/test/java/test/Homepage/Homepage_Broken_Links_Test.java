package test.Homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import resources.BaseClass;
import utilities.CommonUtils;

import java.io.IOException;

public class Homepage_Broken_Links_Test extends BaseClass {
public WebDriver driver;
@Test()
public void Homepage_Broken_Links_Testcase() throws InterruptedException, IOException {
    CommonUtils cl = new CommonUtils(driver);
    cl.login();
    logger.info("browser opened successfully");
    logger.info("login successfully" );
    logger.info("testing broken links");
    cl.Broken_url();
    logger.info("testing broken images");
    cl.Broken_image();
    cl.close_browser();
    logger.info("browser closed successfully");
}}
