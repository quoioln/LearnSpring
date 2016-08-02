/**
 * 
 */
package com.quoioln.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author quoioln
 *
 */
public class HelloWorldTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloA = (HelloWorld) context.getBean("helloWorld");
		helloA.setMessage("Hello world");
		System.out.println(helloA.getMessage());
		HelloWorld helloB = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloB.getMessage());
//		context.registerShutdownHook();
//		System.out.println("OK");
		
	}
}
