package com.org.main.Repository;

import java.util.List;
import java.util.Optional;

import org.com.main.ResponseDTO.ProjectManagerResponseDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.main.Entity.EmployeeMasterEntity;
import com.org.main.Entity.ProjectManagerEntity;
import com.org.main.RequestDTO.ProjectManagerRequestDTO;

@Repository
public interface ProjectManagerRepository extends CrudRepository<ProjectManagerEntity, Integer> {
	

	List<ProjectManagerEntity> findByProjectManagerName(String managerName);

	ProjectManagerEntity findByProjectManagerID(int managerId);

	Optional<ProjectManagerEntity> deleteByProjectManagerID(int id);

	ProjectManagerEntity save(ProjectManagerResponseDTO saveProjectManager);
	
	

}
