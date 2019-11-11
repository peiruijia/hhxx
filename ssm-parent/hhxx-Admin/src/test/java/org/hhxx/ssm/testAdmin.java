package org.hhxx.ssm;

import org.hhxx.ssm.service.IAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testAdmin {
	
	@Autowired
	private IAdminService adminService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testLogin() {
		System.out.println(adminService.login("小裴", "123"));
	}

}
