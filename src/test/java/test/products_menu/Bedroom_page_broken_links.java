package test.products_menu;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.Products_menu;
import resources.BaseClass;
import utilities.CommonUtils;

import java.io.IOException;

public class Bedroom_page_broken_links extends BaseClass {
    public WebDriver driver;
    @Test()
    public void Bedroom_Broken_links() throws IOException, InterruptedException {
        CommonUtils cu = new CommonUtils(driver);
        Products_menu pm = new Products_menu(driver);
        cu.login();
        logger.info("browser opened successfully");
        Homepage h = new Homepage(driver);
        logger.info("login successfully");
        cu.move_to_element(h.get_Company_Logo());
        cu.scroll_down();
        cu.scroll_down();
        Thread.sleep(2000);
        cu.click_on_element(pm.get_Bedroom_products_menu());
        logger.info("clicked on Bedroom product page menu successfully");
        logger.info("finding the broken images");
        cu.Broken_image();
        logger.info("finding the broken url");
        cu.Broken_url();
        cu.close_browser();

    }



}
