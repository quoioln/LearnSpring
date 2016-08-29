/**
 * 
 */
package com.quoioln.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.ProjectDao;
import com.quoioln.example.model.Employee;
import com.quoioln.example.model.Project;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectDao projectDao;
	@RequestMapping("")
	public ResponseEntity<List<Project>> getAllProject() {
		List<Project> projectList = projectDao.findAll();
		int i = 0;
		for (Project project : projectList) {
			System.out.println("i = " + (++i) + "\n");
			for (Employee employee : project.getEmployeeList()) {
				System.out.println(employee.getFullName());
			}
		}
		
		return new ResponseEntity<>(projectList, HttpStatus.OK);
	}
}
