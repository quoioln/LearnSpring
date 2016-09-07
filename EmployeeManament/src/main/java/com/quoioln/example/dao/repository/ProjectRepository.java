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

import com.quoioln.example.model.Project;

/**
 * @author vpquoi
 *
 */
public interface ProjectRepository extends JpaRepository<Project, Long>{
    @Query("from Project where deleteFlag = 'false'")
    public List<Project> findAll();
    
    @Query("from Project where projectId = :projectId AND deleteFlag = 'false'")
    public Project findById(@Param("projectId") Long projectId);
    
    @Transactional
    @Modifying
    @Query("update Project set deleteFlag = 'true' where projectId = :projectId")
    public void deleteById(@Param("projectId") Long projectId);
    
}
