/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import com.quoioln.example.model.ProjectTeam;

/**
 * @author vpquoi
 *
 */
public interface ProjectTeamDao  {
	
    /**
     * Find all ProjectTeam.
     *
     * @return the List<code>&ltProjectTeam&gt</code>
     */
    public List<ProjectTeam> findAll();
    
    /**
     * Update projectTeam.
     *
     * @param <code>ProjectTeam</code> the projectTeam
     * @return the ProjectTeam
     */
    public ProjectTeam update(ProjectTeam projectTeam);
    
    /**
     * Find projectTeam by id.
     *
     * @param <code>Integer</code> the projectTeam id
     * @return the ProjectTeam
     */
    public ProjectTeam findById(Long projectTeamId);
    
    /**
     * Create the projectTeam.
     *
     * @param <code>ProjectTeam</code> the projectTeam
     * @return ProjectTeam>
     */
    public ProjectTeam create(ProjectTeam projectTeam);
    
    /**
     * Delete projectTeam by id.
     *
     * @param <code>Integer</code> the projectTeam id
     */
    public void deleteById(Long projectTeamId);
}
