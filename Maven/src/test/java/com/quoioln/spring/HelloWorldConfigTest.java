/**
 * 
 */
package com.quoioln.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.quoioln.jdbcframework.StudentDAOImlTest;

/**
 * @author quoioln
 *
 */
public class HelloWorldConfigTest {
	private static Logger logger = Logger.getLogger(HelloWorldConfigTest.class.getName());
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.setMessage("hello world");
		System.out.println(helloWorld.getMessage());
	}
}
