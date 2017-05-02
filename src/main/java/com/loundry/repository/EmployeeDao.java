package com.loundry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loundry.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
