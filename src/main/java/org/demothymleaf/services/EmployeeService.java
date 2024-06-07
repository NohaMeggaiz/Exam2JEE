package org.demothymleaf.services;

import org.demothymleaf.entity.Employee;
import org.demothymleaf.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


        private final EmployeeRepo employeeRepository;

        @Autowired
        public EmployeeService(EmployeeRepo employeeRepository) {
            this.employeeRepository = employeeRepository;
        }


        public Employee saveEmployee(Employee employee) {
            return employeeRepository.save(employee);
        }


        public Optional<Employee> getEmployeeById(Long id) {
            return employeeRepository.findById(id);
        }


        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }


            public Employee updateEmployee(Employee employee) {
            return employeeRepository.save(employee);
        }


        public void deleteEmployee(Long id) {
            employeeRepository.deleteById(id);
        }
    }


