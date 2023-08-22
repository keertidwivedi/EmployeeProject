
package com.org.main.service;

import java.util.List;

import org.com.main.ResponseDTO.ProjectManagerResponseDTO;
import org.springframework.stereotype.Service;

import com.org.main.RequestDTO.ProjectManagerRequestDTO;

public interface ProjectManagerService {


	public List<ProjectManagerResponseDTO> findByProjectManagerName(String managerName);

	public ProjectManagerResponseDTO findByProjectManagerID(int managerId);

	public ProjectManagerResponseDTO deleteByProjectManagerID(int managerId);

	ProjectManagerResponseDTO updateManager(int managerId, ProjectManagerRequestDTO requestDto);

	public ProjectManagerResponseDTO createProjectManager(ProjectManagerRequestDTO managerRequestDto);

	


}
