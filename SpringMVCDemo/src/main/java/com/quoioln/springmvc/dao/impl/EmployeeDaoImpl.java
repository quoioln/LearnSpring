/**
 * 
 */
package com.quoioln.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.quoioln.springmvc.dao.AbstractDao;
import com.quoioln.springmvc.dao.EmployeeDao;
import com.quoioln.springmvc.model.Employee;

/**
 * @author quoioln
 *
 */
@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAll() {
		return getSession().createCriteria(Employee.class).list();
	}

	@Override
	public void create(Employee employee) {
		save(employee);
	}

	@Override
	public Employee findById(Long employeeId) {
		return (Employee) getSession().get(Employee.class, employeeId);
	}

	@Override
	public void update(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public void deleteById(Long employeeId) {
		Query query = getSession().createQuery("delete from Employee where employeeId = :employeeId");
		query.setParameter("employeeId", employeeId);
		query.executeUpdate();
	}

}
