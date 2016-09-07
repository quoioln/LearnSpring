/**
 * 
 */
package com.quoioln.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Employee.
 *
 * @author vpquoi
 */
@Entity
@Table(name = "employee")
public class Employee {
	
	/** The employee id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id") 
	private Long employeeId;
	
	/** The full name. */
	@Column(name = "full_name")
	private String fullName;
	
	/** The email. */
	@Column(name = "email")
	private String email;
	
	/** The gender. */
	@Column(name = "gender")
	private Integer gender;
	
	/** The delete flag. */
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	/** The project list. */
	@Column(name = "department_id")
	private Long departmentId;  
	
	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
	}
	
	/**
	 * Instantiates a new employee.
	 *
	 * @param employeeId the employee id
	 * @param loginId the login id
	 * @param fullName the full name
	 * @param email the email
	 * @param gender the gender
	 * @param deleteFlag the delete flag
	 */
	public Employee(Long employeeId, String fullName, String email, Integer gender, Long departmentId,
			Boolean deleteFlag) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.email = email;
		this.gender = gender;
		this.departmentId = departmentId;
		this.deleteFlag = deleteFlag;
	}

	/**
	 * Gets the employee id.
	 *
	 * @return the employeeId
	 */
	public final Long getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the employee id.
	 *
	 * @param employeeId the employeeId to set
	 */
	public final void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the full name.
	 *
	 * @return the fullName
	 */
	public final String getFullName() {
		return fullName;
	}

	/**
	 * Sets the full name.
	 *
	 * @param fullName the fullName to set
	 */
	public final void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public final Integer getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the gender to set
	 */
	public final void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * Gets the delete flag.
	 *
	 * @return the deleteFlag
	 */
	public final Boolean getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * Sets the delete flag.
	 *
	 * @param deleteFlag the deleteFlag to set
	 */
	public final void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * @return the departmentId
	 */
	public final Long getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public final void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

}
