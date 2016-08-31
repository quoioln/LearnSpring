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

import com.quoioln.example.model.Department;

/**
 * @author vpquoi
 *
 */
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    @Query("from Department where deleteFlag = 'false'")
    public List<Department> findAll();
    
    @Query("from Department where departmentId = :departmentId AND deleteFlag = 'false'")
    public Department findById(@Param("departmentId") Long departmentId);
    
    @Transactional
    @Modifying
    @Query("update Department set deleteFlag = 'true' where departmentId = :departmentId")
    public void deleteById(@Param("departmentId") Long departmentId);
    
}
