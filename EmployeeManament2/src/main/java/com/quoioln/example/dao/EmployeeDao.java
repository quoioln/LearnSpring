/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.quoioln.example.model.Employee;
import com.quoioln.example.model.Project;

/**
 * @author vpquoi
 *
 */
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	public List<Employee> findAll();
	
	@SuppressWarnings("unchecked")
	public Employee save(Employee employee);
	
	@Query("update Employee set projectList = :projectList where employeeId = :employeeId")
	public Employee updateProject(
			@Param("projectList") Set<Project> projectList
			, @Param("employeeId") Long employeeId);
}
