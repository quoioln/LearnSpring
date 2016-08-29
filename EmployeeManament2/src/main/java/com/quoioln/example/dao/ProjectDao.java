/**
 * 
 */
package com.quoioln.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.model.Project;

/**
 * @author vpquoi
 *
 */
@Transactional
public interface ProjectDao extends CrudRepository<Project, Long> {
	
	/** 
	 * get all project
	 * @return <code>List<Project></code>
	 */
	public List<Project> findAll();
}
