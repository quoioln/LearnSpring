/**
 * 
 */
package com.quoioln.example.jsondata;

import com.quoioln.example.model.Employee;

/**
 * @author quoioln
 *
 */
public class EmployeeJson extends BaseData {

	private Employee employee;

	/**
	 * Instantiates a new employee json.
	 */
	public EmployeeJson() {
	}
	/**
	 * @param employee
	 */
	public EmployeeJson(Employee employee) {
		super();
		this.employee = employee;
	}
	
	/**
	 * @param employee
	 */
	public EmployeeJson(String token, Long accountId, String roleId, Employee employee) {
		super(token, accountId, roleId);
		this.employee = employee;
	}
	
	/**
	 * @return the employee
	 */
	public final Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public final void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
