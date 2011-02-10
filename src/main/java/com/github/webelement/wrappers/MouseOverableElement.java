package com.github.webelement.wrappers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.JavascriptLibrary;

public class MouseOverableElement extends ForwardingWebElement {
    private final WebDriver driver;
    // TODO [mairbek] (Sep 10, 2010, 2:36 PM): Using an internal api is a bad practise but it save our time and provides nice abstraction.
    private final JavascriptLibrary javascriptLibrary;
    private final WebElement element;

    public MouseOverableElement(WebElement element, WebDriver driver, JavascriptLibrary javascriptLibrary) {
        super(element);
        this.driver = driver;
        this.javascriptLibrary = javascriptLibrary;
        this.element = element;
    }

    public void mouseOver() {
        javascriptLibrary.callEmbeddedSelenium(driver, "triggerMouseEvent", getWrappedElement(), "mouseover", true);
    }

}

