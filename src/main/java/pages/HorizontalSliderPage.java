package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.cssSelector("input");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void slideSlider(String value){
        while(!getSlideValue().equals(value))
        driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getSlideValue(){
        return driver.findElement(sliderValue).getText();
    }
}
