package org.hhxx.ssm.service;

import org.hhxx.ssm.entity.Employee;
import org.hhxx.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    
	@Autowired
	private EmployeeMapper employeeMapper; 
	
	@Override
	public void add(Employee employee) {
		employeeMapper.add(employee);

	}

	@Override
	public Employee login(String phone, String password) {
		return employeeMapper.findByPhoneAndPassword(phone, password);
	}

}
