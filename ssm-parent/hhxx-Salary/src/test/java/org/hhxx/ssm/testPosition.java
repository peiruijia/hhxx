package org.hhxx.ssm;

import org.hhxx.ssm.entity.Position;
import org.hhxx.ssm.service.IPositionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testPosition {
	
	@Autowired
	private IPositionService positionService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testFindByDeptId() {
		for(Position p:positionService.findByDeptId(1)) {
			System.out.println(p);
		}
	}
	

}
