package test.Product;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.Payment;
import resources.BaseClass;
import utilities.CommonUtils;

import java.io.IOException;

public class Remove_from_cart_testcase extends BaseClass {
    public WebDriver driver;
    @Test()
    public void Remove_from_cart() throws IOException, InterruptedException {
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
        Thread.sleep(1000);
        cu.click_on_element(p.get_view_and_edit_cart());
        logger.info("successfully clicked on view and edit cart");
        logger.info("item added to the cart successfully");
        cu.click_on_element(p.get_click_on_cart());
        logger.info("successfully click on the cart");
        cu.click_on_element(p.get_Remove_item_from_cart());
        logger.info("successfully clicked on delete button");
        Thread.sleep(2000);
        cu.click_on_element(p.get_Accept_removing_item());
        logger.info("item removed from cart successfully");
        cu.click_on_element(p.get_click_on_cart());
        Assert.assertEquals("You have no items in your shopping cart.","You have no items in your shopping cart.");
        cu.close_browser();
        logger.info("browser closed successfully");
    }

}
