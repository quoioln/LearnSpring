/**
 * 
 */
package com.quoioln.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quoioln
 *
 */
public class AbstractDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void save(Object object) {
		getSession().save(object);
	}
}
