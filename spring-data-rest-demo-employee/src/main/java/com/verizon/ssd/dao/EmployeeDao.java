package com.verizon.ssd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizon.ssd.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
