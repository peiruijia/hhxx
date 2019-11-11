package org.hhxx.ssm;

import java.util.Date;

import org.hhxx.ssm.entity.Employee;
import org.hhxx.ssm.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

	@Autowired
	private IEmployeeService employeeService;
	
	@Test
	public void testAdd() {
		Employee employee = new Employee(null,"张三","No-001","456",new Date(),new Date(),true,1,"15195806666","11@qq.com",1111,1111,1,1,1,1);
		employeeService.add(employee);
	}
	
	@Test
	public void testLogin() {
		System.out.println(employeeService.login("15195806666", "456"));
	}
}
