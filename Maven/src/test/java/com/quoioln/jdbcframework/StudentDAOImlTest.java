/**
 * 
 */
package com.quoioln.jdbcframework;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author quoioln
 *
 */
@Component
public class StudentDAOImlTest {
	private static Logger logger = Logger.getLogger(StudentDAOImlTest.class.getName());
	
	@Autowired
	@Qualifier("studentDAOImp")
	private static StudentDAO studentDAOImp;
	public static void main(String[] args) {
		logger.info("Get context");
//		ApplicationContCext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
//		StudentDAO studentDAOImp = (StudentDAOImp) context.getBean("studentDAOImp");
		Student student = new Student();
		student.setName("Truong Quoc Huy");
		student.setAge(23);
		studentDAOImp.add(student);
		logger.info("add successfuly student");
		
		// Test update  
		student.setId(7);
		student.setAge(30);
		studentDAOImp.update(student);
		logger.info("update successfuly student");
		
		// Test delete
		studentDAOImp.remove(6);
		logger.info("remove successfuly student");

		System.out.println("Test get student 1:" + studentDAOImp.getStudentById(1).getName());
		List<Student> studentList = studentDAOImp.getAllStudent();
		for (Student s : studentList) {
			System.out.println(s.getName());
		}
	}
}
