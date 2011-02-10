package com.github.webelement.wrappers.table;

import com.github.webelement.wrappers.ElementWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableCell extends ElementWrapper {
    public static final String TAG_NAME = "td";

    public TableCell(WebDriver driver, WebElement element) {
        super(driver, element, TAG_NAME);
    }

    public String getText() {
        return element().getText();
    }

}
