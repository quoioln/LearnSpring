/**
 * 
 */
package com.quoioln.example.jsondata;

import com.quoioln.example.model.Employee;

/**
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
    
    
}
