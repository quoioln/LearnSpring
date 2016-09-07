/**
 * 
 */
package com.quoioln.springmvc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class Department.
 *
 * @author vpquoi
 */
@Entity
@Table(name = "department")
public class Department {
	
	/** The department id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id")
	private Long departmentId;
	
	/** The name. */
	@Column(name = "name")
	private String name;
	
	/** The delete flag. */
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	/** The project list. */
	@OneToMany(mappedBy = "departmentId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@Filter(condition = )
//	@WhereJoinTable(clause = "")
//	@JsonBackReference
	private Set<Employee> employeeList;
//	private
	
	/**
	 * Instantiates a new department.
	 */
	public Department() {
	}
	
	/**
	 * Instantiates a new department.
	 *
	 * @param departmentId the department id
	 */
	public Department(Long departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * Instantiates a new department.
	 *
	 * @param departmentId the department id
	 * @param name the name
	 * @param deleteFlag the delete flag
	 */
	public Department(Long departmentId, String name, Set<Employee> employeeList, Boolean deleteFlag) {
		this.departmentId = departmentId;
		this.name = name;
		this.employeeList = employeeList;
		this.deleteFlag = deleteFlag;
	}

	/**
	 * Gets the department id.
	 *
	 * @return the departmentId
	 */
	public final Long getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets the department id.
	 *
	 * @param departmentId the departmentId to set
	 */
	public final void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
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
	 * @return the employeeList
	 */
	public final Set<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * @param employeeList the employeeList to set
	 */
	public final void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
