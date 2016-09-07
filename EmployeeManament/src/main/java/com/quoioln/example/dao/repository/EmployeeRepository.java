/**
 * 
 */
package com.quoioln.example.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.model.Employee;

/**
 * @author vpquoi
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Query("from Employee where deleteFlag = 'false'")
    public List<Employee> findAll();
    
    @Query("from Employee where employeeId = :employeeId AND deleteFlag = 'false'")
    public Employee findById(@Param("employeeId") Long employeeId);
    
    @Transactional
    @Modifying
    @Query("update Employee set deleteFlag = 'true' where employeeId = :employeeId")
    public void deleteById(@Param("employeeId") Long employeeId);
    
}
