package com.org.service;



import com.org.RequestDto.EmployeeRequestDto;
import com.org.ResponseDTo.EmployeeReponseDTo;



public interface EmployeeService {
	
	EmployeeReponseDTo createEmployee(EmployeeRequestDto employeeRequestDto);
	
	


}
