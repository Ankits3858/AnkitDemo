package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_menu {
    WebDriver driver;
    public Products_menu(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//p[normalize-space()='Living room']")
    WebElement living_room_products_menu;

    public WebElement get_living_room_products_menu() {
        return living_room_products_menu;
    }


    @FindBy(xpath ="//p[@class='featureitempara'][normalize-space()='Bed Room']")
    WebElement Bedroom;

    public WebElement get_Bedroom_products_menu() {
        return Bedroom;
    }


    @FindBy(xpath ="//p[@class='featureitempara'][normalize-space()='Chairs']")
    WebElement chairs;

    public WebElement get_chairs_products_menu() {
        return chairs;
    }


    @FindBy(xpath ="//p[@class='featureitempara'][normalize-space()='Dining']")
    WebElement Dining;

    public WebElement get_Dining_products_menu() {
        return Dining;
    }


    @FindBy(xpath ="//p[@class='featureitempara'][normalize-space()='Sofas']")
    WebElement sofas;

    public WebElement get_sofas_products_menu() {
        return sofas;
    }


    @FindBy(xpath ="//p[@class='featureitempara'][normalize-space()='Storage']")
    WebElement storage;

    public WebElement get_storage_products_menu() {
        return storage;
    }

    @FindBy(xpath ="//p[@class='featureitempara'][normalize-space()='Wardrobe']")
    WebElement wardrobe;

    public WebElement get_wardrobe_products_menu() {
        return wardrobe;
    }






}
