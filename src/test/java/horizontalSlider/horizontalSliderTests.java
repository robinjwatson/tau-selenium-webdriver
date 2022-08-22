package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class horizontalSliderTests extends BaseTests {

    @Test
    public void testSlider(){
        var slidePage = homePage.clickHorizontalSlider();
        slidePage.slideSlider("4");
        assertEquals(slidePage.getSlideValue(), "4");
    }
}
