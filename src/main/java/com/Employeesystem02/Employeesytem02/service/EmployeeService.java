package com.Employeesystem02.Employeesytem02.service;
import com.Employeesystem02.Employeesytem02.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteById(Long id);


}
