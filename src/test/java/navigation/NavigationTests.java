package navigation;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    private WebDriver driver;

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void openTabAndNavigate(){
        homePage.clickDynamicLoading().rightClickExample2();
        getWindowManager().switchToNewTab();
    }

}
