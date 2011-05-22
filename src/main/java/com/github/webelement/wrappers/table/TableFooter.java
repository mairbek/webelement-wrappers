package com.github.webelement.wrappers.table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * API for working with HTML <i>tfoot</i>.
 *
 * @author Mairbek Khadikov
 */
public class TableFooter extends TableRowContainer {
    public static final String TAG_NAME = "tfoot";

    public TableFooter(WebDriver driver, WebElement element) {
        super(driver, element, TAG_NAME);
    }
}
