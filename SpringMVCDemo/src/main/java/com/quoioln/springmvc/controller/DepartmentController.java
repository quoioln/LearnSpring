/**
 * 
 */
package com.quoioln.springmvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.springmvc.dao.DepartmentDao;
import com.quoioln.springmvc.model.Department;

/**
 * @author quoioln
 *
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity getAllDepartment() {
		List<Department> departmentList = departmentDao.findAll();
		return new ResponseEntity<Object>(departmentList, HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.POST,
		produces = MediaType.APPLICATION_JSON_VALUE
		, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addDepartment(@RequestBody Department department) throws FileNotFoundException {
//		try {
//			InputStream inputStream = getClass().getResourceAsStream("D:/study/JAVA/Java_Project/SpringMVCDemo/src/main/resources/departmentValidation.json");
			InputStream inputStream = new FileInputStream("departmentValidation.json");
			JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
			Schema schema = SchemaLoader.load(rawSchema);
			schema.validate(new JSONObject(department)); // throws a ValidationException if this object is invalid
			departmentDao.create(department);
//		} catch (Exception)
		return new ResponseEntity<Object>(department, HttpStatus.OK);
	}
}
