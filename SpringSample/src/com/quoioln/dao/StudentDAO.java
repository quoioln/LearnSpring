/**
 * 
 */
package com.quoioln.dao;

import java.util.List;

import com.quoioln.model.Student;

/**
 * @author quoioln
 *
 */
public interface StudentDAO {
	/**
	 * The method use add student
	 */
	public void addStudent(Student student);
	
	/**
	 * The method use get all student
	 */
	public List<Student> getAllStudent();
	
	/**
	 * The method use get student by id
	 */
	public Student getStudentById(int id);
}
