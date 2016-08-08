/**
 * 
 */
package com.quoioln.springinpractice.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.quoioln.springinpractice.jdbc.service.dao.ContactDAO;

/**
 * @author quoioln
 *
 */
@Component
public class ContactRowMapper implements RowMapper<Contact> {

    public Contact mapRow(ResultSet resultSet, int countNum) throws SQLException {
        Contact contact = new Contact();
        contact.setFirstName(resultSet.getString(ContactDAO.FIRST_NAME));
        contact.setLastName(resultSet.getString(ContactDAO.LAST_NAME));
        contact.setEmail(resultSet.getString(ContactDAO.EMAIL));
        return contact;
    }
}

