/**
 * 
 */
package com.quoioln.springsimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.springsimple.dao.UserDao;
import com.quoioln.springsimple.model.User;

/**
 * @author quoioln
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAll() {
		List<User> userList = userDao.findAll();
		ResponseEntity<List<User>> res = new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		return res;
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		ResponseEntity<User> res = new ResponseEntity<User>(userDao.findOne(id), HttpStatus.OK);
		return res;
	}
	
}