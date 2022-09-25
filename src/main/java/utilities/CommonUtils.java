package utilities;

import io.opentelemetry.sdk.metrics.internal.view.ExponentialHistogramAggregation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;


public class CommonUtils extends BaseClass {
     public WebDriver driver;
    public CommonUtils(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }






//move to the elements hover function
    public void move_to_element(WebElement webElement)
    {

        Actions act = new Actions(driver);
        act.moveToElement(webElement).click().perform();
    }






    public void move_to_element1(String xpath)
    {
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions act = new Actions(driver);
        act.moveToElement(element);
        act.click();
        act.perform();
    }


    public void Hover(WebElement element)
    {
        element = driver.findElement(By.xpath(""));
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }

    // login function
public void login() throws InterruptedException, IOException {
    driver = initializeDriver();
    logger.info("Browser got launched");
    driver.get(prop.getProperty("url"));
    logger.info("browser opened successfully");
    LoginPage loginPage = new LoginPage(driver);
    CommonUtils cl = new CommonUtils(driver);
    cl.move_to_element(loginPage.getSignin());
    loginPage.getSignin().click();
    logger.info("landed to login page successfully");
    loginPage.getEmail().sendKeys(prop.getProperty("email"));
    logger.info("email address entered successfully");
    loginPage.getPassword().sendKeys(prop.getProperty("password"));
    logger.info("password entered successfully");
    loginPage.getLoginButton().click();
    logger.info("successfully clicked on login button");
    Thread.sleep(1000);

}
// method to enter inside the field
public void enter_in_field(WebElement ele,String value)
    {

        ele.sendKeys(value);
        ele.sendKeys(Keys.ENTER);


    }

    // METHOD TO SCROLL DOWN
    public void scroll_down()
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,200)", "");

    }



    public void close_browser()
    {
        driver.close();
        logger.info("browser closed successfully");
    }

    //double click
    public void double_click() throws AWTException {
        Robot robot = new Robot();
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    //click the elements
    public void click_on_element(WebElement element)
    {
        element.click();
    }

    //checkbox is enabled or not
    public void checkbox_enabled_check(String xpath)
    {
        WebElement ele = driver.findElement(By.xpath(xpath));
        ele.isEnabled();
    }
    //checkbox is displayed or not
    public void checkbox_Displayed_check(String xpath)
    {
        WebElement ele = driver.findElement(By.xpath(xpath));
        ele.isDisplayed();
    }
    //checkbox is selectable or not
    public void checkbox_selectable_check(String xpath)
    {
        WebElement ele = driver.findElement(By.xpath(xpath));
        ele.isSelected();
    }
    // if checkboxes are selected enabled and displayed then click else no
    public void checkboxes_displayed_and_enabled_or_not(String xpath) {
        List<WebElement> checkboxes = driver.findElements(By.xpath(xpath));
        int size = checkboxes.size();
        System.out.println("Total checkboxes present on this page are:    " +size);

        for(int i=0; i<checkboxes.size(); i++) {
            checkboxes.get(i).click();
            if(checkboxes.get(i).isEnabled() && checkboxes.get(i).isDisplayed() )
            {
                System.out.println(i+" checkBox is enabled and displayed ");
            }
            else
            {
                System.out.println(i+" checkBox is not enabled and displayed " +checkboxes.get(i).getText());
            }
        }


    }


//Scroll up

public void Scroll_Up()
{
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    js.executeScript("window.scrollBy(0,-500)", "");
}



    public void Zoom_in() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);
    }



    public void Zoom_out() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_EQUALS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_EQUALS);
    }


    public void scroll_down_till_end() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,200)", "");
        CommonUtils cl = new CommonUtils(driver);

        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);
        cl.scroll_down();
        Thread.sleep(500);

    }





public void select_all_checkboxes(String element)
{
   WebElement ele = driver.findElement(By.xpath(element));
    Select select = new Select(ele);
    select.getAllSelectedOptions();
}



    public void deselect_all_checkboxes(String element)
    {
        WebElement ele = driver.findElement(By.xpath(element));
        Select select = new Select(ele);
        select.deselectAll();
    }



    public void scroll_till_webelement_found(String element)
    {
        WebElement ele = driver.findElement(By.xpath(element));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",ele);


    }

public void Broken_url()
{
    List<WebElement> elements = driver.findElements(By.tagName("a"));

    for(WebElement element : elements) {

        String URL = element.getAttribute("href");

        System.out.println("-------------------------");



        if(URL==null || URL.isEmpty()) {

            System.out.println("URL is empty");

            continue;

        }

        HttpURLConnection huc;
        try {
            huc = (HttpURLConnection)(new URL(URL).openConnection());
            huc.connect();

            if(huc.getResponseCode()>=400) {

                System.out.println(URL+" is broken");

            }else {

                System.out.println(URL+" is a valid link");

            }
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }


    }

}
public void Broken_image()
{
    List<WebElement> elements = driver.findElements(By.tagName("img"));

    for(WebElement element : elements) {
        String URL = element.getAttribute("src");
        System.out.println("-------------------------");

        if(URL==null || URL.isEmpty()) {

            System.out.println("URL is empty");

            continue;

        }

        HttpURLConnection huc;
        try {
            huc = (HttpURLConnection)(new URL(URL).openConnection());
            huc.connect();

            if(huc.getResponseCode()>=400) {

                System.out.println(URL+" is broken image");

            }else {

                System.out.println(URL+" is a valid image");

            }
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}



}
