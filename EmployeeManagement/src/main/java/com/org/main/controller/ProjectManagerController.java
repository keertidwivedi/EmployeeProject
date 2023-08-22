
package com.org.main.controller;

import java.util.List; 

import org.com.main.ResponseDTO.ProjectManagerResponseDTO;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.Constants;
import com.org.main.Entity.ProjectManagerEntity;
import com.org.main.Repository.ProjectManagerRepository;
import com.org.main.RequestDTO.ProjectManagerRequestDTO;
import com.org.main.service.ProjectManagerService;

import org.slf4j.Logger;

@RestController
public class ProjectManagerController {

	private final Logger mLogger = LoggerFactory.getLogger(ProjectManagerEntity.class);

	
	@Autowired
	private ProjectManagerService managerService;

	@PostMapping(path = "/save/Projectmanager")
	public ProjectManagerResponseDTO createProjectManager(@RequestBody ProjectManagerRequestDTO managerRequestDto) {
		ProjectManagerResponseDTO  saveProjectManger = managerService.createProjectManager(managerRequestDto);
		return saveProjectManger;
	} 

	@GetMapping(path = "/manager/{managerName}")
	public List<ProjectManagerResponseDTO> getManagerByName(@PathVariable String managerName) {
		mLogger.info("getManagerByName Controller has Strated() " + managerName);
		List<ProjectManagerResponseDTO> managerByName = managerService.findByProjectManagerName(managerName);
		mLogger.debug("Recieved managerbyname" + managerByName);
		mLogger.info("getManagerByName Controller has Ended();");
		return managerByName;

	}

	@GetMapping(path = "/manager/{managerId}")
	public ProjectManagerResponseDTO getManagerById(@PathVariable("managerId") int managerId) {
		mLogger.info("getManagerById Controller has Strated(),recived " + managerId);

		ProjectManagerResponseDTO managerBasedOnId = managerService.findByProjectManagerID(managerId);
		mLogger.debug("Recieved managerbyname" + managerBasedOnId);
		mLogger.info("getManagerById Controller has Ended();");
		return managerBasedOnId;

	}

	@DeleteMapping(path = "/manager/{managerId}")
	public ResponseEntity<ProjectManagerResponseDTO> deleteById(@PathVariable("managerId") int managerId) {
		mLogger.info("deleteById Controller has Strated()+ manager id 	recieved" + managerId);
		ProjectManagerResponseDTO deletedmanager = managerService.deleteByProjectManagerID(managerId);

		mLogger.debug("deleted managerbyid" + managerId);
		mLogger.info("deleteById Controller has Ended();");
		return ResponseEntity.ok().body(deletedmanager);
	}

	@PutMapping(path = "/manager/{managerId}")
	public ResponseEntity<ProjectManagerResponseDTO> updateBook(@PathVariable("managerId") int managerId,

			@RequestBody ProjectManagerRequestDTO requestDto) {
		mLogger.info("updatemanager Controller has Strated()+ manager id 	recieved" + managerId + requestDto);
		ProjectManagerResponseDTO updateManager = managerService.updateManager(managerId, requestDto);
		mLogger.debug("Recived updated manager based on id updateUSer() :" + updateManager);
		return ResponseEntity.ok().body(updateManager);
	}

}
