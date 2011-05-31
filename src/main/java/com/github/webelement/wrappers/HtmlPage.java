package com.github.webelement.wrappers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.webelement.wrappers.table.Table;

/**
 * Html page abstraction.
 * 
 * @author Mairbek Khadikov
 * 
 */
public class HtmlPage {
	private final WebDriver driver;
	private final String url;

	/* package */HtmlPage(WebDriver driver, String url) {
		this.driver = driver;
		this.url = url;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public WebElement element(By by) {
		return driver.findElement(by);
	}

	public List<WebElement> elements(By by) {
		return driver.findElements(by);
	}

	public Table table(By by) {
		return new Table(driver, element(by));
	}

	/**
	 * Refreshes the page and waits until page is load.
	 */
	public void reload() {
		driver.get(url);

		waitForPageToLoad();
	}

	private void waitForPageToLoad() {
		// TODO [mairbek] implement
	}

}
