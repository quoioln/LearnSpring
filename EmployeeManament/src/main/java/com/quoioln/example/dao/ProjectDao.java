/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import com.quoioln.example.model.Project;

/**
 * @author vpquoi
 *
 */
public interface ProjectDao {
	
    /**
     * Find all Project.
     *
     * @return the List<code>&ltProject&gt</code>
     */
    public List<Project> findAll();
    
    /**
     * Update project.
     *
     * @param <code>Project</code> the project
     * @return the Project
     */
    public Project update(Project project);
    
    /**
     * Find project by id.
     *
     * @param <code>Integer</code> the project id
     * @return the Project
     */
    public Project findById(Long projectId);
    
    /**
     * Create the project.
     *
     * @param <code>Project</code> the project
     * @return Project>
     */
    public Project create(Project project);
    
    /**
     * Delete project by id.
     *
     * @param <code>Integer</code> the project id
     */
    public void deleteById(Long projectId);
}
