/**
 * 
 */
package com.quoioln.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	/**
     * Gets the all employee.
     *
     */
	@RequestMapping("")
	public ResponseEntity<List<Employee>> getAllEmployee(HttpSession session) {
		List<Employee> employeeList = employeeDao.findAll();
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST
	        , consumes = MediaType.APPLICATION_JSON_VALUE
	        , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee, HttpSession session) {
	    employee = employeeDao.save(employee);
	    return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
}
