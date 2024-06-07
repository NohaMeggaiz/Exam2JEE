package org.demothymleaf.services;

import org.demothymleaf.entity.Project;
import org.demothymleaf.repos.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
   

        private final ProjectRepo projectRepository;

        @Autowired
        public ProjectService(ProjectRepo projectRepository) {
            this.projectRepository = projectRepository;
        }

       
        public Project saveProject(Project project) {
            return projectRepository.save(project);
        }

  
        public Optional<Project> getProjectById(Long id) {
            return projectRepository.findById(id);
        }


        public List<Project> getAllProjects() {
            return projectRepository.findAll();
        }


        public Project updateProject(Project project) {
            return projectRepository.save(project);
        }


        public void deleteProject(Long id) {
            projectRepository.deleteById(id);
        }
    }


