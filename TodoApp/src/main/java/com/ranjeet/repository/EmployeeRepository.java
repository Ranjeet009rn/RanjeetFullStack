package com.ranjeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
