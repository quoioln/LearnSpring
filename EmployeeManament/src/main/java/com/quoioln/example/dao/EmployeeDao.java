/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import com.quoioln.example.model.Employee;

/**
 * The Interface EmployeeDao.
 *
 * @author vpquoi
 */
public interface EmployeeDao {
	
	/**
     * Find all Employee.
     *
     * @return the List<code>&ltEmployee&gt</code>
     */
	public List<Employee> findAll();
	
	/**
     * Update employee.
     *
     * @param <code>Employee</code> the employee
     * @return the Employee
     */
	public Employee update(Employee employee);
	
	/**
     * Find employee by id.
     *
     * @param <code>Integer</code> the employee id
     * @return the Employee
     */
	public Employee findById(Long employeeId);
	
	/**
     * Create the employee.
     *
     * @param <code>Employee</code> the employee
     * @return Employee>
     */
	public Employee create(Employee employee);
	
	/**
     * Delete employee by id.
     *
     * @param <code>Integer</code> the employee id
     */
	public void deleteById(Long employeeId);
}
