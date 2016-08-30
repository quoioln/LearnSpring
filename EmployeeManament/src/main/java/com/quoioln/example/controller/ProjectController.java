/**
 * 
 */
package com.quoioln.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.ProjectDao;
import com.quoioln.example.dao.ProjectTeamDao;
import com.quoioln.example.model.ProjectTeam;
import com.quoioln.example.util.Const;

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
	public ResponseEntity<List<ProjectTeam>> getAllProject(HttpSession session) {
		List<ProjectTeam> projectList = projectTeamDao.findAll();
		session.setAttribute(Const.Session.ACCOUNT_ID, "1");
		System.out.println(session.getId());
		return new ResponseEntity<>(projectList, HttpStatus.OK);
	}
}
