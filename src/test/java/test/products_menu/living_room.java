package test.products_menu;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.Products_menu;
import resources.BaseClass;
import utilities.CommonUtils;

import java.awt.*;
import java.io.IOException;

public class living_room extends BaseClass {
    public WebDriver driver;
    @Test()
    public void living_room_page() throws InterruptedException, IOException, AWTException {
        CommonUtils cu = new CommonUtils(driver);
        cu.login();
        Products_menu pm = new Products_menu(driver);
        Homepage h = new Homepage(driver);
        logger.info("login successfully");
        cu.move_to_element(h.get_Company_Logo());
        cu.scroll_down();
        cu.scroll_down();
        Thread.sleep(2000);
        cu.click_on_element(pm.get_living_room_products_menu());
        logger.info("clicked on living room product page menu successfully");

        cu.checkboxes_displayed_and_enabled_or_not("//input[@type='checkbox']");

        Thread.sleep(2000);
        cu.close_browser();





    }




}
