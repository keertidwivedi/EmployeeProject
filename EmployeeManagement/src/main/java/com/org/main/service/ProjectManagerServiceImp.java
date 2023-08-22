
package com.org.main.service;

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional;


import org.com.main.ResponseDTO.ProjectManagerResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.main.Entity.EmployeeMasterEntity;
import com.org.main.Entity.ProjectManagerEntity;
import com.org.main.Entity.ProjectMasterEntity;
import com.org.main.Repository.ProjectManagerRepository;
import com.org.main.RequestDTO.ProjectManagerRequestDTO;

@Service("ProjectManagerService")
public class ProjectManagerServiceImp implements ProjectManagerService {

	private final Logger mLogger = LoggerFactory.getLogger(ProjectManagerEntity.class);

	@Autowired(required = false)
	private ProjectManagerRepository managerRepository;
	
	ProjectManagerResponseDTO projectManagerResponseDto = new ProjectManagerResponseDTO(); 
	
	public ProjectManagerResponseDTO createProjectManager(ProjectManagerRequestDTO managerRequestDto) {

	 projectManagerResponseDto = new ProjectManagerResponseDTO();
		ProjectManagerEntity masterEntityObject = new ProjectManagerEntity();
		masterEntityObject.setProjectManagerID(managerRequestDto.getProjectManagerID());
		masterEntityObject.setProjectManagerName(managerRequestDto.getProjectMangerName());
		ProjectManagerEntity savedProjectManager = managerRepository.save(masterEntityObject);

		projectManagerResponseDto.setProjectManagerID(savedProjectManager.getProjectManagerID());
		projectManagerResponseDto.setProjectMangerName(savedProjectManager.getProjectManagerName());

		return projectManagerResponseDto;
	}



	@Override
	public List<ProjectManagerResponseDTO> findByProjectManagerName(String managerName) 
	{ 
	
		 List<ProjectManagerResponseDTO> listMAsterResponseDtos = new ArrayList<ProjectManagerResponseDTO>();
		 List<ProjectManagerEntity> searchByManagerName = managerRepository.findByProjectManagerName(managerName);
		 for(ProjectManagerEntity projectManager : searchByManagerName)
		 {
			 projectManagerResponseDto = new ProjectManagerResponseDTO();
			 projectManagerResponseDto.setProjectManagerID(projectManager.getProjectManagerID());
			 projectManagerResponseDto.setProjectMangerName(projectManager.getProjectManagerName());
			 listMAsterResponseDtos.add(projectManagerResponseDto);
		 }
		return listMAsterResponseDtos;
	}

	@Override
	public ProjectManagerResponseDTO findByProjectManagerID(int managerId) {
		 projectManagerResponseDto = new ProjectManagerResponseDTO();
		ProjectManagerEntity searchBtManagerID = managerRepository.findByProjectManagerID(managerId);
		if(searchBtManagerID.getProjectManagerID()== managerId)
		{
			projectManagerResponseDto.setProjectMangerName(searchBtManagerID.getProjectManagerName());
			projectManagerResponseDto.setProjectManagerID(searchBtManagerID.getProjectManagerID());
		}
		else
		{
			System.out.println("MAnager Not FOunt");
		}
		
		return projectManagerResponseDto;
	}

	@Override
	public ProjectManagerResponseDTO deleteByProjectManagerID(int managerId) {
Optional<ProjectManagerEntity> searchByManagerId = managerRepository.deleteByProjectManagerID(managerId);
		
		if (searchByManagerId.isEmpty()) {
			System.out.println("MAnager not found");
		} else {
			ProjectManagerEntity valuesfromoptional = searchByManagerId.get();
			projectManagerResponseDto = new ProjectManagerResponseDTO();
			
			projectManagerResponseDto.setProjectMangerName(valuesfromoptional.getProjectManagerName());
			projectManagerResponseDto.setProjectManagerID(valuesfromoptional.getProjectManagerID());
			return projectManagerResponseDto;
		}
		return projectManagerResponseDto;
	}

	@Override
	public ProjectManagerResponseDTO updateManager(int managerId, ProjectManagerRequestDTO requestDto) { 
	return null;	
	}
}
