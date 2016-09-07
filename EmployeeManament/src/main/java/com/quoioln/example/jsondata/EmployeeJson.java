/**
 * 
 */
package com.quoioln.example.jsondata;

import com.quoioln.example.model.Employee;

/**
<<<<<<< HEAD
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
	
=======
 * The Class EmployeeJson.
 *
 * @author vpquoi
 */
public class EmployeeJson extends BaseJson{
    
    /** The employee. */
    private Employee employee;
    
    /**
     * Instantiates a new employee json.
     */
    public EmployeeJson() {
        super();
    }
    
    /**
     * Instantiates a new employee json.
     *
     * @param employee the employee
     */
    public EmployeeJson(Employee employee) {
        super();
        this.employee = employee;
    }

    /**
     * Gets the employee.
     *
     * @return the employee
     */
    public final Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the employee.
     *
     * @param employee the employee to set
     */
    public final void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
>>>>>>> 884ec42592f28cbe321e5dea1c82962e9ad47524
}
