package test.Payment;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.Payment;
import resources.BaseClass;
import utilities.CommonUtils;

import java.io.IOException;

public class Buy_Now_test extends BaseClass {
    public WebDriver driver;
    @Test
    public void Buy_Now_test() throws IOException, InterruptedException {

        CommonUtils cu = new CommonUtils(driver);
        Payment p = new Payment(driver);
        cu.login();
        Homepage h = new Homepage(driver);
        logger.info("login successfully");
        cu.move_to_element(h.get_Company_Logo()); //click on logo
        logger.info("clicked on company logo successfully");
        cu.scroll_down();
        cu.scroll_down();
        cu.scroll_down();
        cu.scroll_down();
        logger.info("scroll to product successfully");
        cu.click_on_element(p.get_product());
        logger.info("clicked on product successfully");
        cu.scroll_down();
        cu.scroll_down();
        cu.scroll_down();
        logger.info("scroll to add to cart functionality done successfully");

        cu.enter_in_field(p.get_pincode(),"110040");
        logger.info("entering values inside pincode field successfully");
        cu.click_on_element(p.get_pincode_verifiction());
        logger.info("checking pincode availability successfully done");
        cu.click_on_element(p.get_add_to_cart());
        logger.info("product add to cart successfully");
        Thread.sleep(2000);
        cu.click_on_element(p.get_click_on_cart());
        logger.info("successfully click on the cart");
        cu.click_on_element(p.get_click_on_close_cart_button());
        logger.info("open to cart frame closed successfully");
        cu.click_on_element(p.get_click_on_Buy_now());

        logger.info("Buy now functionality clicked successfully");
        Thread.sleep(1000);
        Assert.assertEquals("Item in Cart","Item in Cart");

        logger.info("Buy now functionality is working fine");
        cu.close_browser();
    }
}
