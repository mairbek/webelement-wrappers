package com.github.webelement.wrappers;

import org.openqa.selenium.WebDriver;

/**
 * Factory for {@link HtmlPage}.
 * 
 * @author Mairbek Khadikov
 * 
 */
public class Html {
	private final WebDriver driver;

	public Html(WebDriver driver) {
		this.driver = driver;
	}

	public HtmlPage of(String url) {
		HtmlPage htmlPage = new HtmlPage(driver, url);
		htmlPage.reload();
		return htmlPage;
	}

}
