package com.org.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.org.RequestDto.EmployeeRequestDto;
import com.org.ResponseDTo.EmployeeReponseDTo;
import com.org.main.Entity.EmployeeMasterEntity;
import com.org.repositiry.EmplyeeRepository;


@Service
public class EmployeeServiceImp implements EmployeeService {
	

	
	private EmplyeeRepository employeeRepository;
	
	
	

	public EmployeeServiceImp(EmplyeeRepository employeeRepository) {
	    this.employeeRepository = employeeRepository;
	}

	public EmployeeReponseDTo createEmployee(EmployeeRequestDto employeeRequestdto) {
		
			EmployeeReponseDTo employeeReponseDTo = new EmployeeReponseDTo();
			System.out.println("req object created");
			EmployeeMasterEntity newEmployeeMasterEntity = new EmployeeMasterEntity();
			System.out.println("employee object created");
			newEmployeeMasterEntity.setFirstName(employeeRequestdto.getFirstName());
			
			newEmployeeMasterEntity.setLastName(employeeRequestdto.getLastName());
			newEmployeeMasterEntity.setGender(employeeRequestdto.getGender());
			System.out.println(newEmployeeMasterEntity);
			
			EmployeeMasterEntity saveEmployee = employeeRepository.save(newEmployeeMasterEntity);
			System.out.println(saveEmployee);
			
			employeeReponseDTo.setFirstName(saveEmployee.getFirstName());
			employeeReponseDTo.setLastName(saveEmployee.getLastName());
			employeeReponseDTo.setGender(saveEmployee.getGender());
			System.out.println();
			return employeeReponseDTo;
			
			
			
			
			
			
		}
	

}
