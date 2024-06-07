package org.demothymleaf.repos;

import org.demothymleaf.entity.Employee;
import org.demothymleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo   extends JpaRepository<Employee, Long> {
}
