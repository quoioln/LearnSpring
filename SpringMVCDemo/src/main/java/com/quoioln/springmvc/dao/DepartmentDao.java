/**
 * 
 */
package com.quoioln.springmvc.dao;

import java.util.List;

import com.quoioln.springmvc.model.Department;

/**
 * @author quoioln
 *
 */

public interface DepartmentDao {
	
	public List<Department> findAll();
	
	public void create(Department department);
	
	public Department findById(Long departmentId);
	
	public void update(Department department);
	
	public void deleteById(Long departmentId);
}
