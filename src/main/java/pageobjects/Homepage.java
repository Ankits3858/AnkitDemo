package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public WebDriver driver;
    public Homepage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[@class='level-top']//span[contains(text(),'FURNITURE')]")
    WebElement Furniture;
    public WebElement get_Furniture()
    {
        return Furniture;
    }


    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'SOFAS & RECLINERS')]")
    WebElement Sofa_and_recliner;
    public WebElement get_Sofa_and_recliner()
    {
        return Sofa_and_recliner;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'BEDS & WARDROBES')]")
    WebElement Beds_wardrobe;
    public WebElement get_Beds_wardrobe()
    {
        return Beds_wardrobe;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[contains(@class,'level-top')]//span[contains(text(),'Dining')]")
    WebElement Dining;
    public WebElement get_Dining()
    {
        return Dining;
    }

    @FindBy(xpath = "//a[@class='logo'] / img")
    private WebElement Company_Logo;
        public WebElement get_Company_Logo()
        {
        return Company_Logo;
        }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[contains(@class,'level-top')]//span[contains(text(),'WORK FROM HOME')]")
    WebElement Work_from_home;
        public WebElement get_Work_from_home()
        {
            return Work_from_home;
        }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[contains(@class,'level-top')]//span[contains(text(),'DECOR')]")
    WebElement Decor;
    public WebElement get_Decor()
    {
        return Decor;
    }


    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'HINDWARE APPLIANCES')]")
    WebElement Hindware;
    public WebElement get_Hindware()
    {
        return Hindware;
    }


   By logo = By.xpath("//img[@title='Evok logo']");
    public By get_logo()
    {
        driver.findElement(logo).click();
        return logo;
    }



}
