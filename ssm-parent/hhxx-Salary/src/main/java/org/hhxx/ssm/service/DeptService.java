package org.hhxx.ssm.service;

import java.util.List;

import org.hhxx.ssm.entity.Dept;
import org.hhxx.ssm.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService implements IDeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<Dept> findAll() {
		return deptMapper.findAll();
	}

}
