/**
 * 
 */
package com.quoioln.springsimple.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class User.
 *
 * @author quoioln
 */
@Entity
@Table(name = "user")
public class User {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/** The username. */
	@NotNull
	private String username;
	
	/** The password. */
	@NotNull
	private String password;
	
	/** The fullname. */
	@NotNull
	private String fullname;
	
	/** The email. */
	@NotNull
	private String email;
	
	private Integer deleteFlag;
	
	/**
	 * Instantiates a new user.
	 *
	 */
	public User() {
	}
	
	/**
	 * Instantiates a new user.
	 *
	 * @param id the id
	 * @param username the username
	 * @param password the password
	 * @param fullname the fullname
	 * @param email the email
	 */
	public User(Long id, String username, String password, String fullname, String email, Integer deleteFlag) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.deleteFlag = deleteFlag;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public final String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the username to set
	 */
	public final void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the fullname.
	 *
	 * @return the fullname
	 */
	public final String getFullname() {
		return fullname;
	}
	
	/**
	 * Sets the fullname.
	 *
	 * @param fullname the fullname to set
	 */
	public final void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the deleteFlag
	 */
	public final Integer getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * @param deleteFlag the deleteFlag to set
	 */
	public final void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
}
