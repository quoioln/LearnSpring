/**
 * 
 */
package com.quoioln.springinpractice.jdbc.service.dao;

import java.util.List;

import com.quoioln.springinpractice.jdbc.model.Contact;

/**
 * @author quoioln
 *
 */
public interface ContactDAO {
	/**
	 * The table name
	 */
	public static String TABLE_NAME = "contact";
	
	/**
	 * The column contact id
	 */
	public static String CONTACT_ID = "contact_id";
	
	/**
	 * The column first_name 
	 */
	public static String FIRST_NAME = "first_name";
	
	/**
	 * The column last_name 
	 */
	public static String LAST_NAME = "last_name";
	
	/**
	 * The column email 
	 */
	public static String EMAIL = "email";
	
	/**
	 * The method which add new contact 
	 * @param contact
	 * @return void
	 */
	public void addContact(Contact contact);
	
	/**
	 * The method which get contact by email
	 * @param id 
	 * @return Contact
	 */
	public Contact getContactId(Long id);
	
	/**
	 * The method which get all contact from database
	 * @return List<Contact>
	 */
	public List<Contact> getAllContact();
	
	/**
	 * The method which get contacts by email from database
	 * @param email 
	 * @return List<Contact>
	 */
	public List<Contact> getContactsByEmail(String email);
	
	/**
	 * The method which update contact
	 * @param contact
	 * @return boolean
	 */
	public boolean updateContact(Contact contact);
	
	/**
	 * The method which delete contact
	 * @param email
	 * @return
	 */
	public boolean deleteContactById(Long id);
}
