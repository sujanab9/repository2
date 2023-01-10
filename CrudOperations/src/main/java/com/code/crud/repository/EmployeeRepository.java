package com.code.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
   //all crud database methods
	
}
