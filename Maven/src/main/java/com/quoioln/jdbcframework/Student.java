/**
 * 
 */
package com.quoioln.jdbcframework;

/**
 * @author quoioln
 *
 */
public class Student {
	private String name;
	private int age;
	private int id;
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public final int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public final void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
}
