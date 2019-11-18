package org.hhxx.ssm;

import org.hhxx.ssm.entity.Dept;
import org.hhxx.ssm.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testDept {
	
	@Autowired
	private IDeptService deptService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testFindAll() {
		for(Dept d:deptService.findAll()) {
			System.out.println(d);
		}
	}
	

}
