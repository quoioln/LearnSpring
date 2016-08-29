/**
 * 
 */
package com.quoioln.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Project.
 *
 * @author vpquoi
 */
@Entity
@Table(name = "project")
public class Project {
	
	/** The project id. */
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "project_id")
	private Long projectId;
	
	/** The name. */
	@Column(name = "name")
	private String name;
	
	/** The status. */
	@Column(name = "status")
	private Integer status;
	
	/** The delete flag. */
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	
	/** The department. */
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
//	/** The employee list. */
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "project_team",
//	joinColumns = @JoinColumn(name="project_id", referencedColumnName = "project_id")
//	, inverseJoinColumns = @JoinColumn(name="employee_id", referencedColumnName = "employee_id"))
//	@WhereJoinTable(clause= "delete_flag = 'false'")
//	private Set<Employee> employeeList;
	
		
	
	/**
	 * Instantiates a new project.
	 */
	public Project() {
	}

	/**
	 * Instantiates a new project.
	 *
	 * @param projectId the project id
	 */
	public Project(Long projectId) {
		this.projectId = projectId;
	}
	
	/**
	 * Instantiates a new project.
	 *
	 * @param projectId the project id
	 * @param name the name
	 * @param departmentId the department id
	 * @param status the status
	 * @param department the department
	 * @param deleteFlag the delete flag
	 */
	public Project(Long projectId, String name, Integer departmentId, Integer status, Department department, Boolean deleteFlag) {
		this.projectId = projectId;
		this.name = name;
		this.status = status;
		this.deleteFlag = deleteFlag;
		this.department = department;
	}

	/**
	 * Gets the project id.
	 *
	 * @return the projectId
	 */
	public final Long getProjectId() {
		return projectId;
	}

	/**
	 * Sets the project id.
	 *
	 * @param projectId the projectId to set
	 */
	public final void setProjectId(Long projectId) {
		this.projectId = projectId;
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
	 * Gets the status.
	 *
	 * @return the status
	 */
	public final Integer getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the status to set
	 */
	public final void setStatus(Integer status) {
		this.status = status;
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

//	/**
//	 * Gets the employee list.
//	 *
//	 * @return the employeeList
//	 */
//	public final Set<Employee> getEmployeeList() {
//		return employeeList;
//	}
//
//	/**
//	 * Sets the employee list.
//	 *
//	 * @param employeeList the employeeList to set
//	 */
//	public final void setEmployeeList(Set<Employee> employeeList) {
//		this.employeeList = employeeList;
//	}
	
}
