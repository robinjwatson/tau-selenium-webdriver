package dropdown;

import base.BaseTests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }

    @Test
    public void testSelectTwoOptions(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        String option2 = "Option 2";

        dropDownPage.selectMultipleFromDropDown(option, option2);

        var selectedOptions = dropDownPage.getSelectedAllOptions();
        assertEquals(selectedOptions.size(), 2, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
        assertTrue(selectedOptions.contains(option2), "Option not selected");
    }
}
