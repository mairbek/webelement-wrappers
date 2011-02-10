package com.github.webelement.wrappers.table;

import com.github.webelement.wrappers.ElementWrapper;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Abstraction for table, tbody and thead elements.
 *
 * @author Mairbek Khadikov
 */
public class TableRowContainer extends ElementWrapper {
    private static final By FIND_ROWS = By.xpath(TableRow.TAG_NAME);

    protected TableRowContainer(WebDriver driver, WebElement element, String tagName) {
        super(driver, element, tagName);
    }

    public int rowCount() {
        return element().findElements(FIND_ROWS).size();
    }

    public TableRow row(int index) {
        return new TableRow(driver(), element().findElements(FIND_ROWS).get(index));
    }

    public List<TableRow> rows() {
        return Lists.transform(element().findElements(FIND_ROWS), new Function<WebElement, TableRow>() {
            public TableRow apply(WebElement webElement) {
                return new TableRow(driver(), element());
            }
        });
    }
}

