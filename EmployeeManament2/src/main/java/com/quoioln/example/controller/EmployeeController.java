/**
 * 
 */
package com.quoioln.example.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	@RequestMapping("/add")
	public ResponseEntity<Employee> createEmployee(Employee employee) {
		System.out.println(employee.toString());
		Set<Project> projectList = new HashSet<Project>();
//		Project project = new Project();
//		project.setDeleteFlag(false);
//		project.setDepartment(new Department(1L)); 
//		project.setName("New project");
//		project.setStatus(1);
//		projectList.add(project);
		projectList.add(new Project(1L));
		employee.setProjectList(projectList);
		employee = employeeDao.save(employee);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@RequestMapping("/changeProject")
	
	public ResponseEntity<Employee> changeProject(HttpServletRequest request
//			@RequestParam("employeeId") String employeeId, 
//			@RequestParam("projectIdList") List<String> projectIdList
			) {
		System.out.println(request.getQueryString());
		System.out.println(request.getHeaderNames());
		System.out.println(request.getParameterNames().nextElement());
		System.out.println("OK");
//		Employee employee = new Employee();
//		employee.setEmployeeId(employeeId); 
		Set<Project> projectList = new HashSet<Project>();
//		System.out.println(employeeId);
////		Project project;
//		projectIdList.forEach(projectId -> {
//			Project project = new Project();
//			project.setProjectId(Long.parseLong(projectId));
//			projectList.add(project);
//		});
		
//		Employee employee = new Employee();
		Employee employee = employeeDao.updateProject(projectList, 1L);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
}
