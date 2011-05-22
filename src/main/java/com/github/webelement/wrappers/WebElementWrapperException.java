package com.github.webelement.wrappers;

/**
 * Root exception class.
 * 
 * @author Mairbek Khadikov
 *
 */
public class WebElementWrapperException extends RuntimeException {

	public WebElementWrapperException() {
		super();
	}

	public WebElementWrapperException(String message, Throwable cause) {
		super(message, cause);
	}

	public WebElementWrapperException(String message) {
		super(message);
	}

	public WebElementWrapperException(Throwable cause) {
		super(cause);
	}

	private static final long serialVersionUID = 4193535153147708972L;

}
