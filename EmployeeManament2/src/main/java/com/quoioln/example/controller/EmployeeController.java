/**
 * 
 */
package com.quoioln.example.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.quoioln.example.dao.EmployeeDao;
import com.quoioln.example.model.Employee;
import com.quoioln.example.model.Project;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeController.
 *
 * @author vpquoi
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
	 * @return the all employee
	 */
	@RequestMapping("")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> employeeList = employeeDao.findAll();
		return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json")
    @JsonView(Employee.class)
	public ResponseEntity<Employee> createEmployee(Employee employee) {
		System.out.println(employee.toString());
		Set<Project> projectList = new HashSet<Project>();
		projectList.add(new Project(1L));
		employee.setProjectList(projectList);
		employee = employeeDao.save(employee);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/changeProject", method = RequestMethod.POST,consumes = "application/json")
	public ResponseEntity<Employee> changeProject(
			@RequestParam("employeeId") String employeeId, 
			@RequestParam("projectIdList") List<String> projectIdList
			) {
		Set<Project> projectList = new HashSet<Project>();
		System.out.println(employeeId);
		projectIdList.forEach(projectId -> {
			Project project = new Project();
			project.setProjectId(Long.parseLong(projectId));
			projectList.add(project);
		});
//		Employee employee = new Employee();
		Employee employee = employeeDao.updateProject(projectList, 1L);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
}
