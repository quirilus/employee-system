package com.Employeesystem02.Employeesytem02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Employeesystem02.Employeesytem02.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
