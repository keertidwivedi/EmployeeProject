package com.org.main.service;

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional;

import org.com.main.ResponseDTO.EmployeeResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.main.Entity.EmployeeMasterEntity;
import com.org.main.Entity.ProjectManagerEntity;
import com.org.main.Repository.EmployeeRepository;
import com.org.main.RequestDTO.EmployeeRequestDto;
import com.org.main.RequestDTO.ProjectManagerRequestDTO;

@Service()
public class EmployeeServiceImp  implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	
	EmployeeResponseDto employeeResponseDto= new EmployeeResponseDto();
	

EmployeeService employeeService;


	@Override
	public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {
		EmployeeMasterEntity newEmployeeMasterEntity = new EmployeeMasterEntity();
		newEmployeeMasterEntity.setEmployeeName(employeeRequestDto.getEmployeeName());
		newEmployeeMasterEntity.setBaseLocation(employeeRequestDto.getBaseLocation());
		newEmployeeMasterEntity.setDateOfBirth(employeeRequestDto.getDateOfBirth());
		newEmployeeMasterEntity.setDateOfEnd(employeeRequestDto.getDateOfEnd());
		newEmployeeMasterEntity.setDateOfJoining(employeeRequestDto.getDateOfJoining());
		newEmployeeMasterEntity.setDesignation(employeeRequestDto.getDesignation());
		newEmployeeMasterEntity.setEmployeeCode(employeeRequestDto.getEmployeeCode());
		newEmployeeMasterEntity.setEmployeeStatus(employeeRequestDto.getEmployeeStatus());
		newEmployeeMasterEntity.setFirstLastName(employeeRequestDto.getFirstLastName());
		newEmployeeMasterEntity.setGender(employeeRequestDto.getGender());
		newEmployeeMasterEntity.setHrbpID(employeeRequestDto.getHrbpID());
		newEmployeeMasterEntity.setReportinManager(employeeRequestDto.getReportinManager());
		newEmployeeMasterEntity.setRegion(employeeRequestDto.getRegion());
		newEmployeeMasterEntity.setPhoneNumber(employeeRequestDto.getPhoneNumber());
		newEmployeeMasterEntity.setPastExperienceMonths(employeeRequestDto.getPastExperienceMonths());
		newEmployeeMasterEntity.setPastExperienceYears(employeeRequestDto.getPastExperienceYears());
		newEmployeeMasterEntity.setBaseLocation(employeeRequestDto.getBaseLocation());
		newEmployeeMasterEntity.setFtCount(employeeRequestDto.getFtCount());
		newEmployeeMasterEntity.setPersonalEmployeeID(employeeRequestDto.getPersonalEmployeeID());
		newEmployeeMasterEntity.setHrbpRemarks(employeeRequestDto.getHrbpRemarks());
		newEmployeeMasterEntity.setLinkedin(employeeRequestDto.getLinkedin());
		
		
		EmployeeMasterEntity saveEmployee = employeeRepository.save(newEmployeeMasterEntity);
		if(saveEmployee == null)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("Not empty");
		}
		System.out.println(saveEmployee.hashCode());
		
		employeeResponseDto.setEmployeeName(saveEmployee.getEmployeeName());
		System.out.println("=========");
		employeeResponseDto.setBaseLocation(saveEmployee.getBaseLocation());
		employeeResponseDto.setClientMaster(saveEmployee.getClientMaster());
		employeeResponseDto.setDateOfBirth(saveEmployee.getDateOfBirth());
		employeeResponseDto.setDateOfEnd(saveEmployee.getDateOfEnd());
		employeeResponseDto.setDateOfJoining(saveEmployee.getDateOfJoining());
		employeeResponseDto.setDesignation(saveEmployee.getDesignation());
		employeeResponseDto.setEmployeeCode(saveEmployee.getEmployeeCode());
		employeeResponseDto.setEmployeeID(saveEmployee.getEmployeeID());
		employeeResponseDto.setEmployeeStatus(saveEmployee.getEmployeeStatus());
		employeeResponseDto.setFirstLastName(saveEmployee.getFirstLastName());
		employeeResponseDto.setGender(saveEmployee.getGender());
		employeeResponseDto.setHrbpID(saveEmployee.getHrbpID());
		employeeResponseDto.setReportinManager(saveEmployee.getReportinManager());
		employeeResponseDto.setRegion(saveEmployee.getRegion());
		employeeResponseDto.setProjectManager(saveEmployee.getProjectManager());
		employeeResponseDto.setProjectManagement(saveEmployee.getProjectManagement());
		employeeResponseDto.setPracticeMasterEntity(saveEmployee.getPracticeMasterEntity());
		employeeResponseDto.setPhoneNumber(saveEmployee.getPhoneNumber());
		employeeResponseDto.setPastExperienceMonths(saveEmployee.getPastExperienceMonths());
		employeeResponseDto.setPastExperienceYears(saveEmployee.getPastExperienceYears());
		employeeResponseDto.setBaseLocation(saveEmployee.getBaseLocation());
		employeeResponseDto.setFtCount(saveEmployee.getFtCount());
		employeeResponseDto.setPersonalEmployeeID(saveEmployee.getPersonalEmployeeID());
		employeeResponseDto.setHrbpRemarks(saveEmployee.getHrbpRemarks());
		employeeResponseDto.setLinkedin(saveEmployee.getLinkedin());
			return employeeResponseDto;
		
		
		
	}

	//Getting employee Details
	@Override
	public List<EmployeeResponseDto> getEmployeeByName(String employeeName) {
		
		
		 List<EmployeeResponseDto> listEmployeeResponseDtos = new ArrayList<EmployeeResponseDto>();
		 List<EmployeeMasterEntity> searchByEmployee = employeeRepository.findByEmployeeName(employeeName);
		 for(EmployeeMasterEntity employeeMaster : searchByEmployee)
		 {
			 employeeResponseDto = new EmployeeResponseDto();
			 employeeResponseDto.setEmployeeID(employeeMaster.getEmployeeID());
			 employeeResponseDto.setProjectManager(employeeMaster.getProjectManager());
			 employeeResponseDto.setDateOfJoining(employeeMaster.getDateOfJoining());
			 employeeResponseDto.setDateOfEnd(employeeMaster.getDateOfEnd());
			 employeeResponseDto.setEmployeeName(employeeMaster.getEmployeeName());
			 employeeResponseDto.setEmployeeStatus(employeeMaster.getEmployeeStatus());
			 employeeResponseDto.setProjectManagement(employeeMaster.getProjectManagement());
			 employeeResponseDto.setClientMaster(employeeMaster.getClientMaster());
			 
			 
			 listEmployeeResponseDtos.add(employeeResponseDto);
		 }
		return listEmployeeResponseDtos;

	}

	@Override
	public EmployeeResponseDto getEmployeeById(int employeeId) {
		employeeResponseDto = new EmployeeResponseDto();
		EmployeeMasterEntity searchByEmployeeID = employeeRepository.findById(employeeId);
		if(searchByEmployeeID.getEmployeeID()== employeeId)
		{
			employeeResponseDto.setEmployeeName(searchByEmployeeID.getEmployeeName());
			employeeResponseDto.setProjectManager(searchByEmployeeID.getProjectManager());
			employeeResponseDto.setClientMaster(searchByEmployeeID.getClientMaster());
			employeeResponseDto.setDateOfJoining(searchByEmployeeID.getDateOfJoining());
			employeeResponseDto.setDateOfEnd(searchByEmployeeID.getDateOfEnd());
			employeeResponseDto.setEmployeeStatus(searchByEmployeeID.getEmployeeStatus());
			employeeResponseDto.setHrbpRemarks(searchByEmployeeID.getHrbpID());
			employeeResponseDto.setPracticeMasterEntity(searchByEmployeeID.getPracticeMasterEntity());
		}
		else
		{
			System.out.println("Employee not found");
		}
		
		return employeeResponseDto;
	}

	@Override
	public EmployeeResponseDto deleteById(int employeeId) {
		
		
	
		Optional<EmployeeMasterEntity> searchbyEmployeeId = employeeRepository.deleteById(employeeId);
		
		if (searchbyEmployeeId.isEmpty()) {
			System.out.println("Employe not found");
		} else {
			EmployeeMasterEntity valuesfromoptional = searchbyEmployeeId.get();
			employeeResponseDto = new EmployeeResponseDto();
			
			employeeResponseDto.setEmployeeName(valuesfromoptional.getEmployeeName());
			employeeResponseDto.setBaseLocation(valuesfromoptional.getBaseLocation());
			employeeResponseDto.setClientMaster(valuesfromoptional.getClientMaster());
			employeeResponseDto.setDateOfBirth(valuesfromoptional.getDateOfBirth());
			employeeResponseDto.setDateOfEnd(valuesfromoptional.getDateOfEnd());
			employeeResponseDto.setDateOfJoining(valuesfromoptional.getDateOfJoining());
			employeeResponseDto.setDesignation(valuesfromoptional.getDesignation());
			employeeResponseDto.setEmployeeCode(valuesfromoptional.getEmployeeCode());
			employeeResponseDto.setEmployeeID(valuesfromoptional.getEmployeeID());
			employeeResponseDto.setEmployeeStatus(valuesfromoptional.getEmployeeStatus());
			employeeResponseDto.setFirstLastName(valuesfromoptional.getFirstLastName());
			employeeResponseDto.setGender(valuesfromoptional.getGender());
			employeeResponseDto.setHrbpID(valuesfromoptional.getHrbpID());
			employeeResponseDto.setReportinManager(valuesfromoptional.getReportinManager());
			employeeResponseDto.setRegion(valuesfromoptional.getRegion());
			employeeResponseDto.setProjectManager(valuesfromoptional.getProjectManager());
			employeeResponseDto.setProjectManagement(valuesfromoptional.getProjectManagement());
			employeeResponseDto.setPracticeMasterEntity(valuesfromoptional.getPracticeMasterEntity());
			employeeResponseDto.setPhoneNumber(valuesfromoptional.getPhoneNumber());
			employeeResponseDto.setPastExperienceMonths(valuesfromoptional.getPastExperienceMonths());
			employeeResponseDto.setPastExperienceYears(valuesfromoptional.getPastExperienceYears());
			employeeResponseDto.setBaseLocation(valuesfromoptional.getBaseLocation());
			employeeResponseDto.setFtCount(valuesfromoptional.getFtCount());
			employeeResponseDto.setPersonalEmployeeID(valuesfromoptional.getPersonalEmployeeID());
			employeeResponseDto.setHrbpRemarks(valuesfromoptional.getHrbpRemarks());
			employeeResponseDto.setLinkedin(valuesfromoptional.getLinkedin());
			
		}
		
		return employeeResponseDto;
		


}

	@Override
	public EmployeeResponseDto addProjectManager(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * @Override public EmployeeResponseDto updateEmployee(int employeeId,
	 * EmployeeRequestDto requestDto) { // TODO Auto-generated method stub return
	 * null; }
	 */

	/*
	 * @Override public EmployeeResponseDto addProjectManager(int employeeId) {
	 * EmployeeMasterEntity searchByEmployeeID =
	 * employeeRepository.findById(employeeId);
	 * 
	 * 
	 * 
	 * if(searchByEmployeeID.getEmployeeID()== employeeId) {
	 * employeeResponseDto.setEmployeeName(searchByEmployeeID.getEmployeeName());
	 * employeeResponseDto.setProjectManager(searchByEmployeeID.getProjectManager())
	 * ; employeeResponseDto.setClientMaster(searchByEmployeeID.getClientMaster());
	 * employeeResponseDto.setDateOfJoining(searchByEmployeeID.getDateOfJoining());
	 * employeeResponseDto.setDateOfEnd(searchByEmployeeID.getDateOfEnd());
	 * employeeResponseDto.setEmployeeStatus(searchByEmployeeID.getEmployeeStatus())
	 * ; employeeResponseDto.setHrbpRemarks(searchByEmployeeID.getHrbpID());
	 * employeeResponseDto.setPracticeMasterEntity(searchByEmployeeID.
	 * getPracticeMasterEntity()); } else {
	 * System.out.println("Employee not found"); }
	 * 
	 * return null; }
	 */
	
	
	
}
