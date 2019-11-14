package org.hhxx.ssm.service;

import java.util.List;

import org.hhxx.ssm.entity.Salary;
import org.hhxx.ssm.mapper.SalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService implements ISalaryService {

	@Autowired
	private SalaryMapper salaryMapper;
	
	@Override
	public List<Salary> findByEmp(Integer empId, Integer salaryYear, Integer salaryMonth) {
		return salaryMapper.findByEmp(empId, salaryYear, salaryMonth);
	}

	@Override
	public List<Salary> findByAdmin(Integer deptId, Integer positionId, String empName, Integer empId,
			Integer startMonth, Integer endMonth, Integer salaryYear) {
		return salaryMapper.findByAdmin(deptId, positionId, empName, empId, startMonth, endMonth, salaryYear);
	}

}
