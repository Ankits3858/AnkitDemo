package test.Homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import resources.BaseClass;
import utilities.CommonUtils;

import java.awt.*;
import java.io.IOException;

public class homepageHoverTest extends BaseClass
{
    public WebDriver driver;
        @Test
        public void Homepagetest() throws InterruptedException, IOException, AWTException {

        CommonUtils cl = new CommonUtils(driver);
        cl.login();
        // checking hover function

        Homepage h = new Homepage(driver);
            Actions act = new Actions(driver);
            act.sendKeys(Keys.ESCAPE);

       // cl.move_to_element(h.get_Company_Logo());
        logger.info("popup closed successfully");
        cl.Hover(h.get_Furniture());
        Thread.sleep(1000);
        logger.info("Successful Hover to Furniture menu");
        cl.Hover(h.get_Sofa_and_recliner());
        Thread.sleep(1000);
        logger.info("Successful Hover to Sofas & recliners menu");
        cl.Hover(h.get_Beds_wardrobe());
        Thread.sleep(1000);
        logger.info("Successful Hover to BEDS & WARDROBE menu");
        cl.Hover(h.get_Dining());
        Thread.sleep(1000);
        logger.info("Successful Hover to DINING menu");
        cl.Hover(h.get_Work_from_home());
        Thread.sleep(1000);
        logger.info("Successful Hover to WORK FROM HOME menu");
        cl.Hover(h.get_Decor());
        Thread.sleep(1000);
        logger.info("Successful Hover to DECOR menu");
        cl.Hover(h.get_Hindware());
        Thread.sleep(1000);
        logger.info("Successful Hover to HINDWARE menu");
        cl.move_to_element(h.get_Company_Logo());
        cl.move_to_element(h.get_Company_Logo());

        //scrolling down to check GUI position
        cl.scroll_down_till_end();
        cl.move_to_element(h.get_Company_Logo());
        cl.scroll_down();
        cl.scroll_down();
        Thread.sleep(1000);
        cl.close_browser();

    }





}
