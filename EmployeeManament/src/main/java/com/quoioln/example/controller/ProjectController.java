/**
 * 
 */
package com.quoioln.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.ProjectDao;
import com.quoioln.example.dao.ProjectTeamDao;
import com.quoioln.example.jsondata.ProjectJson;
import com.quoioln.example.model.Project;
import com.quoioln.example.model.ProjectTeam;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectDao projectDao;
	
	@Autowired
    private ProjectTeamDao projectTeamDao;
	
	/**
     * Gets the all project.
     *
     * @param session the session
     * @return the all project
     */
	@RequestMapping("")
	public ResponseEntity<List<ProjectTeam>> getAllProject(HttpSession session) {
		List<ProjectTeam> projectList = projectTeamDao.findAll();
		return new ResponseEntity<>(projectList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getProject(@RequestBody ProjectJson employeeJson, HttpSession session) {
        Project employee = projectDao.findById(employeeJson.getProject().getProjectId());
        return new ResponseEntity<Object>(employee, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Project> addProject(@RequestBody ProjectJson employeeJson, HttpSession session) {
        Project employee = projectDao.create(employeeJson.getProject());
        return new ResponseEntity<Project>(employee, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Project> updateProject(@RequestBody ProjectJson employeeJson, HttpSession session) {
        Project employee = projectDao.update(employeeJson.getProject());
        return new ResponseEntity<Project>(employee, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Project> deleteProject(@RequestBody ProjectJson employeeJson, HttpSession session) {
        projectDao.deleteById(employeeJson.getProject().getProjectId());
        return new ResponseEntity<Project>(employeeJson.getProject(), HttpStatus.OK);
    }
}
