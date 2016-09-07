/**
 * 
 */
package com.quoioln.springmvc.dao;

import java.util.List;

import com.quoioln.springmvc.model.Employee;

/**
 * @author quoioln
 *
 */

public interface EmployeeDao {
	
	public List<Employee> findAll();
	
	public void create(Employee employee);
	
	public Employee findById(Long employeeId);
	
	public void update(Employee employee);
	
	public void deleteById(Long employeeId);
}
