/**
 * 
 */
package com.quoioln.springsimple.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.springsimple.dao.StudentDao;
import com.quoioln.springsimple.model.Student;

/**
 * @author quoioln
 *
 */
@RestController
@RequestMapping("/user")
public class HelloWorldController {
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/")
	public List<Student> getAll() {
//		List<Student> studentList = Arrays.asList(new Student(1L, "vpquoi", 22), new Student(2L, "ntcnhung", 22));
		List<Student> studentList = studentDao.findAll();
		return studentList;
	}
	
	@RequestMapping("/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return studentDao.findOneById(id);
	}
	
}
