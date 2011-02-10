package com.github.webelement.wrappers.table;

import com.github.webelement.wrappers.ElementWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableRow extends ElementWrapper {
    private static final By FIND_CELLS = By.xpath(TableCell.TAG_NAME);
    public static final String TAG_NAME = "tr";

    public TableRow(WebDriver driver, WebElement element) {
        super(driver, element, TAG_NAME);
    }

    public int cellCount() {
        return element().findElements(FIND_CELLS).size();
    }

    public TableCell cell(int index) {
        return new TableCell(driver(), element().findElements(FIND_CELLS).get(index));
    }

    public String getText() {
        return element().getText();
    }

    public WebElement expansionToggle() {
        return element().findElement(By.className("o_treetable_folding"));
    }

    public List<WebElement> expansionToggles() {
        return element().findElements(By.className("o_treetable_folding"));
    }

}
