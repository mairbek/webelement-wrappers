package com.github.webelement.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.JavascriptLibrary;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import java.util.List;

/**
 * Wraps {@code org.openqa.selenium.WebElement} and provides additional API for the element.
 *
 * @author Sergey Filin
 * @author Mairbek Khadikov
 */
public class ElementWrapper {
    private final WebDriver driver;
    private final MouseOverableElement element;


    // TODO [mairbek] (Sep 11, 2010, 6:14 PM): constructor with By or factory?

    protected ElementWrapper(WebDriver driver, WebElement element, String tagName) {
        if (!element.getTagName().equals(tagName)) {
            throw new UnexpectedTagNameException(tagName, element.getTagName());
        }

        this.driver = driver;
        this.element = new MouseOverableElement(element, driver, new JavascriptLibrary());
    }

    protected ElementWrapper(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = new MouseOverableElement(element, driver, new JavascriptLibrary());
    }

    protected WebElement element() {
        return element;
    }

    protected WebDriver driver() {
        return driver;
    }

    // TODO [mairbek] (Sep 10, 2010, 1:27 PM): it is not right place for this utility code

    public WebElement subElement(By by) {
        return element().findElement(by);
    }

    public List<WebElement> subElements(By by) {
        return element().findElements(by);
    }

    public WebElement subElement(String xpath) {
        return subElement(By.xpath(".//" + xpath));
    }

    public List<WebElement> subElements(String xpath) {
        return subElements(By.xpath(".//" + xpath));
    }


    public void click() {
        element().click();
    }

    public void mouseOver() {
        element.mouseOver();
    }

    public String id() {
        return element().getAttribute("id");
    }

    public void focus() {
        element().click();
    }

    public void onClick() {
        ((JavascriptExecutor) driver).executeScript("document.getElementById(\"" + id() + "\").onclick();");
    }
}
