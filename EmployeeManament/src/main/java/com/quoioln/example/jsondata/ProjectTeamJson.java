/**
 * 
 */
package com.quoioln.example.jsondata;

import com.quoioln.example.model.ProjectTeam;

/**
 * The Class ProjectTeamJson.
 *
 * @author vpquoi
 */
public class ProjectTeamJson extends BaseJson{
    
    /** The projectTeam. */
    private ProjectTeam projectTeam;
    
    /**
     * Instantiates a new projectTeam json.
     */
    public ProjectTeamJson() {
        super();
    }
    
    /**
     * Instantiates a new projectTeam json.
     *
     * @param projectTeam the projectTeam
     */
    public ProjectTeamJson(ProjectTeam projectTeam) {
        super();
        this.projectTeam = projectTeam;
    }

    /**
     * Gets the projectTeam.
     *
     * @return the projectTeam
     */
    public final ProjectTeam getProjectTeam() {
        return projectTeam;
    }

    /**
     * Sets the projectTeam.
     *
     * @param projectTeam the projectTeam to set
     */
    public final void setProjectTeam(ProjectTeam projectTeam) {
        this.projectTeam = projectTeam;
    }
    
    
}
