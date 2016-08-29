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

import com.quoioln.example.dao.EmployeeDao;
import com.quoioln.example.model.Employee;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	/** The employee dao. */
	@Autowired
	private EmployeeDao employeeDao;
	@RequestMapping("")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> employeeList = employeeDao.findAll();
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}
}
