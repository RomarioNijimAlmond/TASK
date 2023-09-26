package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DateHomePage extends BasePage {
    String DATE = ".hasDatepicker";
    String DateCalendarContainer = ".ui-datepicker-calendar ";

    public DateHomePage(WebDriver driver) {
        super(driver);
    }

    public String getHighlightedDate() {
//        WebElement dateFrame =
//        switchToIframe(DATE);
        clickElement(DATE);
        List<WebElement> days = driver.findElements(By.cssSelector(DateCalendarContainer + "tbody tr td"));
        for (WebElement dayInCalendar : days) {
            String highlightedElement = dayInCalendar.getAttribute("class");
            if ((highlightedElement.contains("highlight"))) {
                return dayInCalendar.getText().trim();
            }
        }
        return "date is not highlighted";
    }

}
