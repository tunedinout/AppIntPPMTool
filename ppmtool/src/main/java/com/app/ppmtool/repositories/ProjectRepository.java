package com.app.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.ppmtool.domain.Project;

//indicate that class provides mechanism for storage
//retrieval , search, update, and delete operations
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	@Override
	Iterable<Project> findAllById(Iterable<Long> ids); 
}
