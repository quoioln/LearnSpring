/**
 * 
 */
package com.quoioln.jdbcframework;

import java.util.List;

import javax.sql.DataSource;

/**
 * @author quoioln
 *
 */
public interface StudentDAO {
	
	/**
	 * This method is used to initialize 
	 * database resources connection 
	 */
	void setDataSource(final DataSource ds);
	
	/**
	 * This method is used to add student
	 */
	public void add(final Student student);
	
	/**
	 * This method is used to update student
	 */
	public int update(final Student student);
	
	/**
	 * This method is used to remove student
	 */
	public int remove(final int id);
	
	/**
	 * This method is used to get student by id
	 */
	public Student getStudentById(final int id);
	
	/**
	 * This method is used to get all student
	 */
	public List<Student> getAllStudent();
}
