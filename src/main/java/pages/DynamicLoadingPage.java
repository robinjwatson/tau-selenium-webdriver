package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
//    private String linkXpath_Format = ".//a[contains(text(), '%s')";
//    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1")); ////*[@id="content"]/div/a[1]
    //different locator to course - theirs does not work, see above
    private By link_Example1 = By.xpath(".//*[@id='content']/div/a[1]");
    private By link_Example2 = By.xpath(".//*[@id='content']/div/a[2]");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page rightClickExample2(){

//        Actions actions = new Actions(driver);
//        Object rightClick = actions.contextClick(driver.findElement(By.xpath(".//*[@id='content']/div/a[2]"))).build();
        driver.findElement(By.xpath(".//*[@id='content']/div/a[2]")).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }
}
