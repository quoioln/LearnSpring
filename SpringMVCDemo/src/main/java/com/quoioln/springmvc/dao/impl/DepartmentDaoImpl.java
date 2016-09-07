/**
 * 
 */
package com.quoioln.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.springmvc.dao.AbstractDao;
import com.quoioln.springmvc.dao.DepartmentDao;
import com.quoioln.springmvc.model.Department;

/**
 * @author quoioln
 *
 */
@Repository("departmentDao")
@Transactional
public class DepartmentDaoImpl extends AbstractDao implements DepartmentDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findAll() {
		return getSession().createCriteria(Department.class).list();
	}

	@Override
	public void create(Department department) {
		save(department);
	}

	@Override
	public Department findById(Long departmentId) {
		return (Department) getSession().get(Department.class, departmentId);
	}

	@Override
	public void update(Department department) {
		getSession().update(department);
	}

	@Override
	public void deleteById(Long departmentId) {
		Query query = getSession().createQuery("delete from Department where departmentId = :departmentId");
		query.setParameter("departmentId", departmentId);
		query.executeUpdate();
	}

}
