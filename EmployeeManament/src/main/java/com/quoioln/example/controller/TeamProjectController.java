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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.ProjectTeamDao;
import com.quoioln.example.jsondata.ProjectTeamJson;
import com.quoioln.example.model.ProjectTeam;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/projectTeam")
public class TeamProjectController {
	
	/** The projectTeam dao. */
	@Autowired
	private ProjectTeamDao projectTeamDao;
	
	/**
     * Gets the all projectTeam.
     *
     */
	@RequestMapping("")
	public ResponseEntity<List<ProjectTeam>> getAllProjectTeam(HttpSession session) {
		List<ProjectTeam> projectTeamList = projectTeamDao.findAll();
		return new ResponseEntity<>(projectTeamList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST
	        , consumes = MediaType.APPLICATION_JSON_VALUE
	        , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getProjectTeam(@RequestBody ProjectTeamJson projectTeamJson, HttpSession session) {
	    ProjectTeam projectTeam = projectTeamDao.findById(projectTeamJson.getProjectTeam().getProjectTeamId());
	    return new ResponseEntity<Object>(projectTeam, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectTeam> addProjectTeam(@RequestBody ProjectTeamJson projectTeamJson, HttpSession session) {
        ProjectTeam projectTeam = projectTeamDao.create(projectTeamJson.getProjectTeam());
        return new ResponseEntity<ProjectTeam>(projectTeam, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectTeam> updateProjectTeam(@RequestBody ProjectTeamJson projectTeamJson, HttpSession session) {
        ProjectTeam projectTeam = projectTeamDao.update(projectTeamJson.getProjectTeam());
        return new ResponseEntity<ProjectTeam>(projectTeam, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectTeam> deleteProjectTeam(@RequestBody ProjectTeamJson projectTeamJson, HttpSession session) {
        projectTeamDao.deleteById(projectTeamJson.getProjectTeam().getProjectTeamId());
        return new ResponseEntity<ProjectTeam>(projectTeamJson.getProjectTeam(), HttpStatus.OK);
    }
}
