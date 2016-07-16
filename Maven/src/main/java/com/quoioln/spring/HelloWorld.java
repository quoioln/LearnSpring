/**
 * 
 */
package com.quoioln.spring;

/**
 * @author quoioln
 *
 */
public class HelloWorld {
	private String message;

	/**
	 * @return the message
	 */
	public final String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public final void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("init");
	}
	public void destroy() {
		System.out.println("destroy");
	}
}
