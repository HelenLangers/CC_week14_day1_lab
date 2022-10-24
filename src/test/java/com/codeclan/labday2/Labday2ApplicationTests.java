package com.codeclan.labday2;

import com.codeclan.labday2.models.Employee;
import com.codeclan.labday2.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Labday2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee mike = new Employee("Mike", 35, 2234, "Mike@test.com");
		employeeRepository.save(mike);
	}

}
