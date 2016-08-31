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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.EmployeeDao;
import com.quoioln.example.jsondata.EmployeeJson;
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
	
	@RequestMapping(value = "/get", method = RequestMethod.POST
	        , consumes = MediaType.APPLICATION_JSON_VALUE
	        , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getEmployee(@RequestBody EmployeeJson employeeJson, HttpSession session) {
	    Employee employee = employeeDao.findById(employeeJson.getEmployee().getEmployeeId());
	    return new ResponseEntity<Object>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeJson employeeJson, HttpSession session) {
        Employee employee = employeeDao.create(employeeJson.getEmployee());
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeJson employeeJson, HttpSession session) {
        Employee employee = employeeDao.update(employeeJson.getEmployee());
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> deleteEmployee(@RequestBody EmployeeJson employeeJson, HttpSession session) {
        employeeDao.deleteById(employeeJson.getEmployee().getEmployeeId());
        return new ResponseEntity<Employee>(employeeJson.getEmployee(), HttpStatus.OK);
    }
}
