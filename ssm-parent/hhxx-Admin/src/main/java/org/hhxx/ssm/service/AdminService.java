package org.hhxx.ssm.service;

import org.hhxx.ssm.entity.Admin;
import org.hhxx.ssm.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin login(String name, String password) {
		
		return adminMapper.findByNameAndPassword(name, password);
	}

}
