package com.github.webelement.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.RenderedWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsElement;

import java.awt.*;
import java.util.List;

/**
 * WebElement(and RenderedWebElement) which forwards all its method calls to wrapped element.
 * Simplifies decorator pattern implementation.
 *
 * @author Mairbek Khadikov
 */
public class ForwardingWebElement implements WebElement, RenderedWebElement, WrapsElement {
    private final WebElement element;
    private final RenderedWebElement renderedWebElement;

    public ForwardingWebElement(WebElement element) {
        this.element = element;
        this.renderedWebElement = (RenderedWebElement) element;
    }

    public void click() {
        element.click();
    }

    public void submit() {
        element.submit();
    }

    public String getValue() {
        return element.getValue();
    }

    public void sendKeys(CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    public void clear() {
        element.clear();
    }

    public String getTagName() {
        return element.getTagName();
    }

    public String getAttribute(String name) {
        return element.getAttribute(name);
    }

    public boolean toggle() {
        return element.toggle();
    }

    public boolean isSelected() {
        return element.isSelected();
    }

    public void setSelected() {
        element.setSelected();
    }

    public boolean isEnabled() {
        return element.isEnabled();
    }

    public String getText() {
        return element.getText();
    }

    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    public WebElement findElement(By by) {
        return element.findElement(by);
    }

    public String getValueOfCssProperty(String propertyName) {
        return renderedWebElement.getValueOfCssProperty(propertyName);
    }

    public void dragAndDropOn(RenderedWebElement element) {
        renderedWebElement.dragAndDropOn(element);
    }

    public void dragAndDropBy(int moveRightBy, int moveDownBy) {
        renderedWebElement.dragAndDropBy(moveRightBy, moveDownBy);
    }

    public void hover() {
        renderedWebElement.hover();
    }

    public Dimension getSize() {
        return renderedWebElement.getSize();
    }

    public Point getLocation() {
        return renderedWebElement.getLocation();
    }

    public boolean isDisplayed() {
        return renderedWebElement.isDisplayed();
    }

    public WebElement getWrappedElement() {
        return element;
    }
}
