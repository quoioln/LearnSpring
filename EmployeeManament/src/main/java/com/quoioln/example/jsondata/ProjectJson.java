/**
 * 
 */
package com.quoioln.example.jsondata;

import com.quoioln.example.model.Project;

/**
 * The Class ProjectJson.
 *
 * @author vpquoi
 */
public class ProjectJson extends BaseJson{
    
    /** The project. */
    private Project project;
    
    /**
     * Instantiates a new project json.
     */
    public ProjectJson() {
        super();
    }
    
    /**
     * Instantiates a new project json.
     *
     * @param project the project
     */
    public ProjectJson(Project project) {
        super();
        this.project = project;
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
    
}
