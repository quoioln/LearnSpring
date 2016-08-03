/**
 * 
 */
package com.quoioln.springinpractice.jdbc.model;

/**
 * @author quoioln
 *
 */
public class Contact {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Contact() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
	}

	
	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
