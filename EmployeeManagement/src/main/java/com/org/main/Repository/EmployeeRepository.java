package com.org.main.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.com.main.ResponseDTO.EmployeeResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.main.Entity.EmployeeMasterEntity;

@Repository
public interface EmployeeRepository  extends CrudRepository<EmployeeMasterEntity, Integer>{
	
	
	
	EmployeeMasterEntity findById(int employeeID);

	Optional<EmployeeMasterEntity> deleteById(int employeeID);

	List<EmployeeMasterEntity> findAll();

	List<EmployeeMasterEntity> findByEmployeeName(String employeeName);

	EmployeeMasterEntity save(EmployeeResponseDto newEmployee);

}
