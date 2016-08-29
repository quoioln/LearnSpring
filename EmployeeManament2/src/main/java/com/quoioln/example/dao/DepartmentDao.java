/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
@Transactional
public interface DepartmentDao extends CrudRepository<Department, Long> {
    /**
     * Get all department
     * @return <code>List<Department></code>
     */
    public List<Department> findAll();
    
    /**
     * create the department
     * @return <code>Department</code>
     */
    public Department save(Department department);
}
