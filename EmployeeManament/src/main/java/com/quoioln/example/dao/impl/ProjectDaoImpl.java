/**
 * 
 */
package com.quoioln.example.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.example.dao.ProjectDao;
import com.quoioln.example.dao.repository.ProjectRepository;
import com.quoioln.example.model.Project;

/**
 * @author vpquoi
 *
 */
@Service
public class ProjectDaoImpl implements ProjectDao {
    @Resource
    private ProjectRepository repository;

    @Override
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Project update(Project projectUpdate) {
        Project project = repository.findById(projectUpdate.getProjectId());
        project.setDepartment(projectUpdate.getDepartment());
        project.setName(projectUpdate.getName());
        project.setStatus(projectUpdate.getStatus());
        project.setDeleteFlag(projectUpdate.getDeleteFlag());
        return project;
    }

    @Override
    public Project findById(Long projectId) {
        return repository.findById(projectId);
    }

    @Override
    public Project create(Project project) {
        return repository.save(project);
    }

    @Override
    public void deleteById(Long projectId) {
        repository.deleteById(projectId);
    }

}
