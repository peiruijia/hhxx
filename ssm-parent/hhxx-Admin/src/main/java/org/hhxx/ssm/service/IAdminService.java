package org.hhxx.ssm.service;

import org.hhxx.ssm.entity.Admin;

public interface IAdminService {
	
	Admin login(String name,String password);

}
