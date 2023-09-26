package uitests;

import org.example.enums.ApplicationUrl;
import org.example.pages.DateHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateDateHighlight extends BaseTest {

    @Test
    public void tc01_validateHighlightedDate() {
        DateHomePage dateHomePage = new DateHomePage(driver);
        dateHomePage.goToUrl(ApplicationUrl.APP);
        String actual = dateHomePage.getHighlightedDate();
        String expected = "4";
        Assert.assertEquals(actual, expected);
    }
}
