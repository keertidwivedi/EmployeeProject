package com.org.Controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.RequestDto.EmployeeRequestDto;
import com.org.ResponseDTo.EmployeeReponseDTo;
import com.org.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	

	@PostMapping("/newEmployee")
	public EmployeeReponseDTo createEmployee(@RequestBody EmployeeRequestDto EmployeeRequestDto) {
		System.out.println("called new");
		EmployeeReponseDTo saveEmployee = employeeService.createEmployee(EmployeeRequestDto);
		return saveEmployee;
		
	}

}
