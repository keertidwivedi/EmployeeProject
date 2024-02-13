package com.org.repositiry;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.ResponseDTo.EmployeeReponseDTo;
import com.org.main.Entity.EmployeeMasterEntity;

@Repository
public interface EmplyeeRepository extends JpaRepository<EmployeeMasterEntity, Integer> {
	
	EmployeeMasterEntity save(EmployeeReponseDTo newEmployee);

}
