/**
 * 
 */
package com.quoioln.springsimple.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.springsimple.model.Student; 

/**
 * The Interface StudentDao.
 *
 * @author quoioln
 */
@Transactional
public interface StudentDao extends CrudRepository<Student, Long> {
	
	/**
	 * Get the student by id.
	 *
	 * @param id the id
	 * @return <code>Student</code>
	 */
	public Student findOneById(Long id);
	
	
	/**
	 * Get all student.
	 *
	 * @return <code>List<Student></code>
	 */
	public List<Student> findAll();
	
//	public fin
}
