/**
 * 
 */
package com.quoioln.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.WhereJoinTable;

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
	
	/** The login id. */
	@Column(name = "login_id")
	private String loginId;
	
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
	
	@ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
	
	/** The project list. */
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "project_team",
        joinColumns = @JoinColumn(name="employee_id", referencedColumnName = "employee_id")
        , inverseJoinColumns = @JoinColumn(name="project_id", referencedColumnName = "project_id"))
    @WhereJoinTable(clause= "delete_flag = 'false'")
	private Set<Project> projectList;  
	
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
	public Employee(Long employeeId, String loginId, String fullName, String email, Integer gender,
			Boolean deleteFlag) {
		this.employeeId = employeeId;
		this.loginId = loginId;
		this.fullName = fullName;
		this.email = email;
		this.gender = gender;
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
	 * Gets the login id.
	 *
	 * @return the loginId
	 */
	public final String getLoginId() {
		return loginId;
	}

	/**
	 * Sets the login id.
	 *
	 * @param loginId the loginId to set
	 */
	public final void setLoginId(String loginId) {
		this.loginId = loginId;
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
	 * Gets the project list.
	 *
	 * @return the projectList
	 */
	public final Set<Project> getProjectList() {
		return projectList;
	}

	/**
	 * Sets the project list.
	 *
	 * @param projectList the projectList to set
	 */
	public final void setProjectList(Set<Project> projectList) {
		this.projectList = projectList;
	}

    /**
     * @return the department
     */
    public final Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public final void setDepartment(Department department) {
        this.department = department;
    }
	
}
