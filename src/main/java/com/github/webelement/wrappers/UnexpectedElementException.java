package com.github.webelement.wrappers;

/**
 * 
 * @author Mairbek Khadikov
 *
 */
public class UnexpectedElementException extends WebElementWrapperException {

	public UnexpectedElementException(String expected, String actual) {
		super("Expected " + expected + " element, but " + actual + " found");
	}
	
	private static final long serialVersionUID = 4193535153147708972L;

}
