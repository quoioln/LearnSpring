/**
 * 
 */
package com.quoioln.springsimple.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quoioln.springsimple.model.User;

/**
 * @author quoioln
 *
 */
public interface UserDao extends CrudRepository<User, Long> {
	
	public User findOne();
	
	public List<User> findAll();
	
//	public fi
}
