package org.hhxx.ssm.service;

import org.hhxx.ssm.entity.Employee;

public interface IEmployeeService {
	
	void add(Employee employee);
	
	Employee login(String phone,String password);

}
