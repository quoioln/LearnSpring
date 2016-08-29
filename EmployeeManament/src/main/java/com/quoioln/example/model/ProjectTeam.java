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
 * The Class ProjectTeam.
 *
 * @author vpquoi
 */
@Entity
@Table(name = "project_team")
public class ProjectTeam {
    
    /** The project team id. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_team_id")
    private Long projectTeamId;
    
    /** The project. */
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    
    /** The employee. */
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    
    /** The delete flag. */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;
    
    /**
     * Instantiates a new project team.
     */
    public ProjectTeam() {
    }
    
    /**
     * Instantiates a new project team.
     *
     * @param projectTeamId the project team id
     * @param project the project
     * @param employee the employee
     * @param deleteFlag the delete flag
     */
    public ProjectTeam(Long projectTeamId, Project project, Employee employee, Boolean deleteFlag) {
        this.projectTeamId = projectTeamId;
        this.project = project;
        this.employee = employee;
        this.deleteFlag = deleteFlag;
    }

    /**
     * Gets the project team id.
     *
     * @return the projectTeamId
     */
    public final Long getProjectTeamId() {
        return projectTeamId;
    }

    /**
     * Sets the project team id.
     *
     * @param projectTeamId the projectTeamId to set
     */
    public final void setProjectTeamId(Long projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    /**
     * Gets the project.
     *
     * @return the project
     */
    public final Project getProject() {
        return project;
    }

    /**
     * Sets the project.
     *
     * @param project the project to set
     */
    public final void setProject(Project project) {
        this.project = project;
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
    
}
