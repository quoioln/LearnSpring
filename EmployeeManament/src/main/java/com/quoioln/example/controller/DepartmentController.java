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

import com.quoioln.example.dao.DepartmentDao;
import com.quoioln.example.jsondata.DepartmentJson;
import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	/** The department dao. */
	@Autowired
	private DepartmentDao departmentDao;
	
	/**
     * Gets the all department.
     *
     */
	@RequestMapping("")
	public ResponseEntity<List<Department>> getAllDepartment(HttpSession session) {
		List<Department> departmentList = departmentDao.findAll();
		return new ResponseEntity<>(departmentList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST
	        , consumes = MediaType.APPLICATION_JSON_VALUE
	        , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getDepartment(@RequestBody DepartmentJson departmentJson, HttpSession session) {
	    Department department = departmentDao.findById(departmentJson.getDepartment().getDepartmentId());
	    return new ResponseEntity<Object>(department, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> addDepartment(@RequestBody DepartmentJson departmentJson, HttpSession session) {
        Department department = departmentDao.create(departmentJson.getDepartment());
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> updateDepartment(@RequestBody DepartmentJson departmentJson, HttpSession session) {
        Department department = departmentDao.update(departmentJson.getDepartment());
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> deleteDepartment(@RequestBody DepartmentJson departmentJson, HttpSession session) {
        departmentDao.deleteById(departmentJson.getDepartment().getDepartmentId());
        return new ResponseEntity<Department>(departmentJson.getDepartment(), HttpStatus.OK);
    }
}
