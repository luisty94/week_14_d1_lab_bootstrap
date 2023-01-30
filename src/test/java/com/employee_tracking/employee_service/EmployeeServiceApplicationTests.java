package com.employee_tracking.employee_service;

import com.employee_tracking.employee_service.models.Employee;
import com.employee_tracking.employee_service.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test

	public void createEmployee(){
		Employee Jamie = new Employee("Jamie", 56,563845, "jamie_codeclan_th3boss@codeclan.com");
		employeeRepository.save(Jamie);
	}
}
