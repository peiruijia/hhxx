package org.hhxx.ssm;

import org.hhxx.ssm.entity.Salary;
import org.hhxx.ssm.service.ISalaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testSalary {
	
	@Autowired
	private ISalaryService salaryService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testFindByEmp() {
		System.out.println(salaryService.findByEmp("NO-001", 2019, 10));
		System.out.println(salaryService.findByEmp("NO-001", null, 10));
		System.out.println(salaryService.findByEmp("NO-001", 2019, null));
	}
	
	@Test
	public void testFindByAdmin() {
		for(Salary s:salaryService.findByAdmin(1, null, "%", "", null, null, null)) {
			System.out.println(s);
		}
		
	}
	
	@Test
	public void testFindByAdminMohu() {
		
		for(Salary s:salaryService.findByAdmin(null, null, "员工%", null, null, null, null)) {
			System.out.println(s);
		}
	}
	

}
