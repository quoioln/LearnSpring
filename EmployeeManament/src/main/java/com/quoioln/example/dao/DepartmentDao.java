/**
 * 
 */
package com.quoioln.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
public interface DepartmentDao extends CrudRepository<Department, Long> {

}
