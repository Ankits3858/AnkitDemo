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

        CommonUtils cl = new CommonUtils(driver);
        Payment p = new Payment(driver);
        cl.login();
        Homepage h = new Homepage(driver);
        logger.info("login successfully");
        cl.move_to_element(h.get_Company_Logo()); //click on logo
        cl.move_to_element(h.get_Company_Logo());
        cl.move_to_element(h.get_Company_Logo());
        cl.move_to_element(h.get_Decor());
        cl.move_to_element(h.get_Hindware());
        cl.move_to_element(h.get_Beds_wardrobe());
        cl.move_to_element(h.get_Furniture());
        cl.move_to_element(h.get_Work_from_home());
        logger.info("clicked on company logo successfully");
        cl.scroll_down();
        cl.scroll_down();
        cl.scroll_down();
        cl.scroll_down();
        logger.info("scroll to product successfully");
        cl.click_on_element(p.get_product());
        logger.info("clicked on product successfully");
        cl.scroll_down();
        cl.scroll_down();
        cl.scroll_down();
        logger.info("scroll to add to cart functionality done successfully");

        cl.enter_in_field(p.get_pincode(),"110040");
        logger.info("entering values inside pincode field successfully");
        cl.click_on_element(p.get_pincode_verifiction());
        logger.info("checking pincode availability successfully done");
        cl.click_on_element(p.get_add_to_cart());
        logger.info("product add to cart successfully");
        Thread.sleep(2000);
        cl.click_on_element(p.get_click_on_cart());
        logger.info("successfully click on the cart");
        cl.click_on_element(p.get_click_on_close_cart_button());
        logger.info("open to cart frame closed successfully");
        cl.click_on_element(p.get_click_on_Buy_now());

        logger.info("Buy now functionality clicked successfully");
        Thread.sleep(1000);
        Assert.assertEquals("Item in Cart","Item in Cart");

        logger.info("Buy now functionality is working fine");
        cl.close_browser();
    }
}
