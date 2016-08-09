/**
 * 
 */
package com.quoioln.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.dao.StudentDAO;
import com.quoioln.model.Student;

/**
 * @author quoioln
 *
 */
public class StudentDAOImpl implements StudentDAO {
	private SessionFactory sessionFactory;
	
	public StudentDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory =  sessionFactory;
	}
	
	@Override
	@Transactional
	public List<Student> getAllStudent() {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		Criteria cr = session.createCriteria(Student.class);
		List<Student> studentList = cr.list();
		return studentList;
	}

	@Override
	@Transactional
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			try {
				session.getTransaction().rollback();
				System.out.println("rollback");
			} catch (RuntimeException e2) {
				System.out.println("cannot rollback");
			}
		}
	}

}
