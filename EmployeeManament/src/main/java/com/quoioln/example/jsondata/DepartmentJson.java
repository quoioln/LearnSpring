/**
 * 
 */
package com.quoioln.example.jsondata;

import com.quoioln.example.model.Department;

/**
 * The Class DepartmentJson.
 *
 * @author vpquoi
 */
public class DepartmentJson extends BaseJson{
    
    /** The department. */
    private Department department;
    
    /**
     * Instantiates a new department json.
     */
    public DepartmentJson() {
        super();
    }
    
    /**
     * Instantiates a new department json.
     *
     * @param department the department
     */
    public DepartmentJson(Department department) {
        super();
        this.department = department;
    }

    /**
     * Gets the department.
     *
     * @return the department
     */
    public final Department getDepartment() {
        return department;
    }

    /**
     * Sets the department.
     *
     * @param department the department to set
     */
    public final void setDepartment(Department department) {
        this.department = department;
    }
    
    
}
