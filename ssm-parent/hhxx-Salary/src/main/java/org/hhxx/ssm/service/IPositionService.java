package org.hhxx.ssm.service;

import java.util.List;

import org.hhxx.ssm.entity.Position;

public interface IPositionService {

	List<Position> findByDeptId(Integer deptId);
	
}
