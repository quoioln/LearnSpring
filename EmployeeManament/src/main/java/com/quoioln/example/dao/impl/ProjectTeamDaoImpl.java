/**
 * 
 */
package com.quoioln.example.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.dao.ProjectTeamDao;
import com.quoioln.example.dao.repository.ProjectTeamRepository;
import com.quoioln.example.model.ProjectTeam;

/**
 * @author vpquoi
 *
 */
@Service
public class ProjectTeamDaoImpl implements ProjectTeamDao {
    @Resource
    private ProjectTeamRepository repository;

    @Override
    public List<ProjectTeam> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public ProjectTeam update(ProjectTeam projectTeamUpdate) {
        ProjectTeam projectTeam = repository.findById(projectTeamUpdate.getProjectTeamId());
        projectTeam.setEmployee(projectTeamUpdate.getEmployee());
        projectTeam.setProject(projectTeamUpdate.getProject());
        projectTeam.setDeleteFlag(projectTeamUpdate.getDeleteFlag());
        return projectTeam;
    }

    @Override
    public ProjectTeam findById(Long projectTeamId) {
        return repository.findById(projectTeamId);
    }

    @Override
    public ProjectTeam create(ProjectTeam projectTeam) {
        return repository.save(projectTeam);
    }

    @Override
    public void deleteById(Long projectTeamId) {
        repository.deleteById(projectTeamId);
    }

}
