package com.github.webelement.wrappers.table;

import com.github.webelement.wrappers.table.TableBody;
import com.github.webelement.wrappers.table.TableFooter;
import com.github.webelement.wrappers.table.TableHead;
import com.github.webelement.wrappers.table.TableRowContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * API for working with HTML table.
 *
 * @author Sergey Filin
 * @author Mairbek Khadikov
 */
public class Table extends TableRowContainer {
    private static final By FIND_TBODY = By.xpath(TableBody.TAG_NAME);
    private static final By FIND_HEAD = By.xpath(TableHead.TAG_NAME);
    private static final By FIND_FOOTER = By.xpath(TableFooter.TAG_NAME);

    public static final String TAG_NAME = "table";

    public Table(WebDriver driver, WebElement element) {
        super(driver, element, TAG_NAME);
    }

    public TableBody body() {
        WebElement tbody = element().findElement(FIND_TBODY);
        return new TableBody(driver(), tbody);
    }

    public TableHead head() {
        WebElement thead = element().findElement(FIND_HEAD);
        return new TableHead(driver(), thead);
    }

    public TableFooter footer() {
        WebElement tfoot = element().findElement(FIND_FOOTER);
        return new TableFooter(driver(), tfoot);
    }

    // TODO [mairbek] (Sep 11, 2010, 4:49 PM): add methods that detecting is `tbody/thead present in the table.
}
