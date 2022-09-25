package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
    public WebDriver driver;
    public Payment(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="(//button[@class='vwprd'])[1]")
    WebElement product;

    public WebElement get_product() {
        return product;
    }


    @FindBy(xpath ="//label[@id='check-txt']")
    WebElement pincode_verification;

    public WebElement get_pincode_verifiction() {
        return pincode_verification;
    }


    @FindBy(xpath ="//input[@id='txtPincode']")
    WebElement pincode;

    public WebElement get_pincode() {
        return pincode;
    }

    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement add_to_cart;

    public WebElement get_add_to_cart() {
        return add_to_cart;
    }

    @FindBy(xpath ="//a[@class='action showcart']")
    WebElement click_on_cart;

    public WebElement get_click_on_cart() {
        return click_on_cart;
    }


    @FindBy(xpath ="//button[@id='btn-minicart-close']")
    WebElement close_cart;

    public WebElement get_click_on_close_cart_button() {
        return close_cart;
    }

    @FindBy(xpath ="//button[@id='buy-now']//span[contains(text(),'Buy Now')]")
    WebElement Buy_now;

    public WebElement get_click_on_Buy_now() {
        return Buy_now;
    }

    @FindBy(xpath ="//button[@id='top-cart-btn-checkout']")
    WebElement proceed_to_checkout;

    public WebElement get_proceed_to_checkout() {
        return proceed_to_checkout;
    }



    @FindBy(xpath ="//span[normalize-space()='View and Edit Cart']")
    WebElement view_and_edit_cart;

    public WebElement get_view_and_edit_cart() {
        return view_and_edit_cart;
    }
    @FindBy(xpath = "//a[@title='Remove item']")
    WebElement Remove_item_from_cart;

    public WebElement get_Remove_item_from_cart() {
        return Remove_item_from_cart;
    }

    @FindBy(xpath = "//button[@class='action-primary action-accept']")
    WebElement Accept;

    public WebElement get_Accept_removing_item() {
        return Accept;
    }




}
