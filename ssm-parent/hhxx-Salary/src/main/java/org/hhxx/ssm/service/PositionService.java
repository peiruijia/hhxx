package org.hhxx.ssm.service;

import java.util.List;

import org.hhxx.ssm.entity.Position;
import org.hhxx.ssm.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService implements IPositionService {

	@Autowired
	private PositionMapper positionMapper;
	
	@Override
	public List<Position> findByDeptId(Integer deptId) {
		return positionMapper.findByDeptId(deptId);
	}

}
