/**
 * 
 */
package com.quoioln.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author quoioln
 *
 */
public class Profile {
	@Autowired
	@Qualifier("student1")
	private Student student;
	
	public Profile() {
		System.out.println("Inside profile constructor");
	}
	
	public void printAge() {
		System.out.println("Age: " + student.getAge());
	}
	
	public void printFullName() {
		System.out.println("Full name: " + student.getFullName());
	}
}
