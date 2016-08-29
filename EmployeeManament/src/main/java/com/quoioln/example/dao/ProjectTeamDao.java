/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.model.Project;
import com.quoioln.example.model.ProjectTeam;

/**
 * @author vpquoi
 *
 */
@Transactional
public interface ProjectTeamDao extends CrudRepository<ProjectTeam, Long> {
	
	/** 
	 * get all project
	 * @return <code>List<Project></code>
	 */
	public List<ProjectTeam> findAll();
	
	public ProjectTeam findOne(Long id);
}
