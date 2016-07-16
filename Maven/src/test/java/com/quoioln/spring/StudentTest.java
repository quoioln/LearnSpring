/**
 * 
 */
package com.quoioln.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author quoioln
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printFullName();
	}
}
