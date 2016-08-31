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

import com.quoioln.example.model.ProjectTeam;

/**
 * @author vpquoi
 *
 */
public interface ProjectTeamRepository extends JpaRepository<ProjectTeam, Long>{
    @Query("from ProjectTeam where deleteFlag = 'false'")
    public List<ProjectTeam> findAll();
    
    @Query("from ProjectTeam where projectTeamId = :projectTeamId AND deleteFlag = 'false'")
    public ProjectTeam findById(@Param("projectTeamId") Long projectTeamId);
    
    @Transactional
    @Modifying
    @Query("update ProjectTeam set deleteFlag = 'true' where projectTeamId = :projectTeamId")
    public void deleteById(@Param("projectTeamId") Long projectTeamId);
    
}
