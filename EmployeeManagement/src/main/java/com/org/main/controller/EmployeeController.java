package com.org.main.controller;

import java.util.List;

import org.com.main.ResponseDTO.EmployeeResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.main.Entity.EmployeeMasterEntity;
import com.org.main.Repository.EmployeeRepository;
import com.org.main.RequestDTO.EmployeeRequestDto;
import com.org.main.RequestDTO.ProjectManagerRequestDTO;
import com.org.main.service.EmployeeService;

@RestController
public class EmployeeController  {
	
	public EmployeeController(EmployeeService employeeService) {
	    this.employeeService = employeeService;
	}

	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome To My page";
		
	}

	@PostMapping(path = "/employee") 
	public EmployeeResponseDto createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) 

	{
		EmployeeResponseDto saveEmployee = employeeService.createEmployee(employeeRequestDto);

		return saveEmployee;

	}
	
	//@GetMapping(path = "/employee/{employeeName}")
	@RequestMapping(value = "/employee/{employeeName}", method = RequestMethod.GET)
	public List<EmployeeResponseDto> getEmployeeByName(@PathVariable String employeeName) {
		
		List<EmployeeResponseDto> employeeByName = employeeService.getEmployeeByName(employeeName);
		return employeeByName;

	}
	
	

	@GetMapping(path = "/employee/{employeeId}")
	public EmployeeResponseDto getEmployeeById(@PathVariable int employeeId) {
		EmployeeResponseDto employeeBasedOnId = employeeService.getEmployeeById(employeeId);
		return employeeBasedOnId;

	}

	@DeleteMapping(path ="/employee/{employeeID}")
	public ResponseEntity<EmployeeResponseDto> deleteById(@PathVariable("employeeID") int employeeID) {
		
		EmployeeResponseDto deletedEmployee = employeeService.deleteById(employeeID);
		return ResponseEntity.ok().body(deletedEmployee);
	}
	
	@PostMapping (path="/employee/{employeeId}/projectmanager")
	public ResponseEntity<EmployeeResponseDto> addProjectManager(@PathVariable ("employeeId") int employeeId)
	{
		EmployeeResponseDto employeeBasedOnId = employeeService.getEmployeeById(employeeId);		
		return ResponseEntity.ok().body(employeeBasedOnId);
		
	}

	/*
	 * @PutMapping(path = "/employee/{employeeId}") public
	 * ResponseEntity<EmployeeResponseDto>
	 * updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody
	 * EmployeeRequestDto requestDto) { EmployeeResponseDto updateEmployee =
	 * employeeService.updateEmployee(employeeId, requestDto); return
	 * ResponseEntity.ok().body(updateEmployee); }
	 * 
	 * 
	 */
	


}

