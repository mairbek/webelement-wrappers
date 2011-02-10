package com.github.webelement.wrappers.table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * API for working with HTML tbody.
 *
 * @author Mairbek Khadikov
 */
public class TableBody extends TableRowContainer {
    public static final String TAG_NAME = "tbody";

    public TableBody(WebDriver driver, WebElement element) {
        super(driver, element, TAG_NAME);
    }
}
