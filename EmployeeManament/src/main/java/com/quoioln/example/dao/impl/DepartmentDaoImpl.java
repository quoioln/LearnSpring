/**
 * 
 */
package com.quoioln.example.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.dao.DepartmentDao;
import com.quoioln.example.dao.repository.DepartmentRepository;
import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
@Service
public class DepartmentDaoImpl implements DepartmentDao {
    @Resource
    private DepartmentRepository repository;

    @Override
    public List<Department> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Department update(Department departmentUpdate) {
        Department department = repository.findById(departmentUpdate.getDepartmentId());
        department.setName(departmentUpdate.getName());
        department.setDeleteFlag(departmentUpdate.getDeleteFlag());
        return department;
    }

    @Override
    public Department findById(Long departmentId) {
        return repository.findById(departmentId);
    }

    @Override
    public Department create(Department department) {
        return repository.save(department);
    }

    @Override
    public void deleteById(Long departmentId) {
        repository.deleteById(departmentId);
    }

}
