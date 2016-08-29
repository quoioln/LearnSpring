/**
 * 
 */
package com.quoioln.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.ProjectDao;
import com.quoioln.example.dao.ProjectTeamDao;
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
	 * @return the all project
	 */
	@RequestMapping("")
	public ResponseEntity<List<ProjectTeam>> getAllProject() {
		List<ProjectTeam> projectList = projectTeamDao.findAll();
		return new ResponseEntity<>(projectList, HttpStatus.OK);
	}
}
