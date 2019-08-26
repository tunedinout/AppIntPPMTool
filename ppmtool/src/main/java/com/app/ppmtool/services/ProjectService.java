package com.app.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.ppmtool.domain.Project;
import com.app.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	
	public Project saveOrUpdateProject(Project project) {
		//TODO
		
		return projectRepository.save(project);
	}
}
