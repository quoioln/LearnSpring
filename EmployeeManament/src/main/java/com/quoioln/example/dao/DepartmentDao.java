/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
public interface DepartmentDao  {
    /**
     * Find all Department.
     *
     * @return the List<code>&ltDepartment&gt</code>
     */
    public List<Department> findAll();
    
    /**
     * Update department.
     *
     * @param <code>Department</code> the department
     * @return the Department
     */
    public Department update(Department department);
    
    /**
     * Find department by id.
     *
     * @param <code>Integer</code> the department id
     * @return the Department
     */
    public Department findById(Long departmentId);
    
    /**
     * Create the department.
     *
     * @param <code>Department</code> the department
     * @return Department>
     */
    public Department create(Department department);
    
    /**
     * Delete department by id.
     *
     * @param <code>Integer</code> the department id
     */
    public void deleteById(Long departmentId);
}
