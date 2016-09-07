/**
 * 
 */
package com.quoioln.example.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.dao.EmployeeDao;
import com.quoioln.example.dao.repository.EmployeeRepository;
import com.quoioln.example.model.Employee;

/**
 * @author vpquoi
 *
 */
@Service
public class EmployeeDaoImpl implements EmployeeDao {
    @Resource
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Employee update(Employee employeeUpdate) {
        Employee employee = repository.findById(employeeUpdate.getEmployeeId());
        employee.setEmail(employeeUpdate.getEmail());
        employee.setFullName(employeeUpdate.getFullName());
        employee.setGender(employeeUpdate.getGender());
        employee.setDeleteFlag(employeeUpdate.getDeleteFlag());
        return employee;
    }

    @Override
    public Employee findById(Long employeeId) {
        return repository.findById(employeeId);
    }

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void deleteById(Long employeeId) {
        repository.deleteById(employeeId);
    }

}
