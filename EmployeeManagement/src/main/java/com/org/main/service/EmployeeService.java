package com.org.main.service;

import java.util.List;

import org.com.main.ResponseDTO.EmployeeResponseDto;

import com.org.main.RequestDTO.EmployeeRequestDto;
import com.org.main.RequestDTO.ProjectManagerRequestDTO;

public interface EmployeeService {
	
	EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

	List<EmployeeResponseDto> getEmployeeByName(String employeeName);

	EmployeeResponseDto getEmployeeById(int bookId);

	EmployeeResponseDto deleteById(int bookId);

	//EmployeeResponseDto updateEmployee(int employeeId, EmployeeRequestDto requestDto);

	
	EmployeeResponseDto addProjectManager(int employeeId);

}
