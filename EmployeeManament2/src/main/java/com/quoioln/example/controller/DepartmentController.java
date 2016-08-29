/**
 * 
 */
package com.quoioln.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.DepartmentDao;
import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	/** The employee dao. */
	@Autowired
	private DepartmentDao departmentDao;
	@RequestMapping("")
	public ResponseEntity<List<Department>> getAllEmployee() {
	    departmentDao.save(new Department())
		List<Department> departmentList = departmentDao.findAll();
		return new ResponseEntity<>(departmentList, HttpStatus.OK);
	}
}
