/**
 * 
 */
package com.quoioln.springsimple.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class Student.
 */
@Entity
@Table(name="Student")
public class Student {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/** The name. */
	@NotNull
	private String name;
	
	/** The age. */
	@NotNull
	private Integer age;
	
	/**
	 * Instantiates a new student.
	 */
	public Student() {
	}
	
	/**
	 * Instantiates a new student.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 */
	public Student(Long id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * Gets the id of student.
	 *
	 * @return the id of student
	 */
	public final Long getId() {
		return id;
	}

	/**
	 * Sets the id of student.
	 *
	 * @param id the new id of student
	 */
	public final void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name of student.
	 *
	 * @return the name of student
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Sets the name of student.
	 *
	 * @param name the new name of student
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public final Integer getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public final void setAge(Integer age) {
		this.age = age;
	}
	
	
}
