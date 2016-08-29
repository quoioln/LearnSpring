/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quoioln.example.model.Employee;

/**
 * @author vpquoi
 *
 */
public interface EmployeeDao extends CrudRepository<Employee, Long> {
	public List<Employee> findAll();
}
