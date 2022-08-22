package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHotSpot(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
}
