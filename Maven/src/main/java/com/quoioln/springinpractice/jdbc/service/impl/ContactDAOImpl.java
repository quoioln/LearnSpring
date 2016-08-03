/**
 * 
 */
package com.quoioln.springinpractice.jdbc.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.quoioln.springinpractice.jdbc.model.Contact;
import com.quoioln.springinpractice.jdbc.model.ContactRowMapper;
import com.quoioln.springinpractice.jdbc.service.dao.ContactDAO;

/**
 * @author quoioln
 *
 */
@Service
public class ContactDAOImpl implements ContactDAO {
	/**
	 * The sql insert contact
	 */
	private String ADD_CONTACT_SQL = "INSERT into " + TABLE_NAME + "(" + FIRST_NAME + ", " + LAST_NAME + ", " + EMAIL + ")"
			+ " values (:firstName, :lastName, :email)"; 
	
	/**
	 * The sql update contact
	 */
	private String UPDATE_CONTACT_SQL = "UPDATE " + TABLE_NAME + " set " + FIRST_NAME + " = :firstName"  
			+ ", "+ LAST_NAME + " = :lastName" + " where " + EMAIL + " = " + " :email";  
	
	/**
	 * The sql get all contact
	 */
	private String FIND_ALL_CONTACT_SQL = "SELECT " + FIRST_NAME + ", " + LAST_NAME + ", " + EMAIL + " FROM " + TABLE_NAME;
	
	/**
	 * The sql get contact by id
	 */
	private String FIND_CONTACT_BY_ID = "SELECT " + FIRST_NAME + ", " + LAST_NAME + ", " + EMAIL + " FROM " + TABLE_NAME 
			+ " WHERE " + CONTACT_ID + " = :id";
	
	/**
	 * The sql get contact by email
	 */
	private String FIND_CONTACT_BY_EMAIL = "SELECT " + FIRST_NAME + ", " + LAST_NAME + ", " + EMAIL + " FROM " + TABLE_NAME 
			+ " WHERE " + EMAIL + " LIKE :email";
	
	/**
	 * The sql delete contact by id
	 */
	private String DELETE_CONTACT_BY_EMAIL = "DELETE FROM " + TABLE_NAME + " WHERE " + CONTACT_ID + " = " + ":id";
	
	@Inject private NamedParameterJdbcOperations jdbcTemplate;
	@Inject private ContactRowMapper contactRowMapper;
	
	@Override
	public void addContact(Contact contact) {
		MapSqlParameterSource mapSqlParameter = new MapSqlParameterSource();
		mapSqlParameter.addValue(FIRST_NAME, contact.getFirstName());
		mapSqlParameter.addValue(LAST_NAME, contact.getLastName());
		mapSqlParameter.addValue(EMAIL, contact.getEmail());
		SqlParameterSource params = mapSqlParameter;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(ADD_CONTACT_SQL, params, keyHolder);
		contact.setId(keyHolder.getKey().longValue());
	}

	@Override
	public Contact getContactId(Long id) {
		MapSqlParameterSource mapSqlParameter = new MapSqlParameterSource();
		mapSqlParameter.addValue(CONTACT_ID, id);
		SqlParameterSource params = mapSqlParameter;
		return jdbcTemplate.queryForObject(FIND_CONTACT_BY_ID, params, contactRowMapper);
	}

	@Override
	public List<Contact> getAllContact() {
		return jdbcTemplate.query(FIND_ALL_CONTACT_SQL, new HashMap<String, Object>(), contactRowMapper);
	}

	@Override
	public boolean updateContact(Contact contact) {
		MapSqlParameterSource mapSqlParameter = new MapSqlParameterSource();
		mapSqlParameter.addValue(FIRST_NAME, contact.getFirstName());
		mapSqlParameter.addValue(LAST_NAME, contact.getLastName());
		mapSqlParameter.addValue(EMAIL, contact.getEmail());
		mapSqlParameter.addValue(CONTACT_ID, contact.getId());
		SqlParameterSource params = mapSqlParameter;
		return jdbcTemplate.update(ADD_CONTACT_SQL, params) > 0;
	}

	@Override
	public boolean deleteContactById(Long id) {
		MapSqlParameterSource mapSqlParameter = new MapSqlParameterSource();
		mapSqlParameter.addValue(CONTACT_ID, id);
		SqlParameterSource params = mapSqlParameter;
		return jdbcTemplate.update(ADD_CONTACT_SQL, params) > 0;
	}

	@Override
	public List<Contact> getContactsByEmail(String email) {
		MapSqlParameterSource mapSqlParameter = new MapSqlParameterSource();
		mapSqlParameter.addValue(EMAIL, "%" + email + "%");
		SqlParameterSource params = mapSqlParameter;
		return jdbcTemplate.query(FIND_CONTACT_BY_EMAIL, params, contactRowMapper);
	}

}
