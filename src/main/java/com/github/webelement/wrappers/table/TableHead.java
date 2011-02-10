package com.github.webelement.wrappers.table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * API for working with HTML thead.
 *
 * @author Mairbek Khadikov
 */
public class TableHead extends TableRowContainer {
    public static final String TAG_NAME = "thead";

    public TableHead(WebDriver driver, WebElement element) {
        super(driver, element, TAG_NAME);
    }
}
