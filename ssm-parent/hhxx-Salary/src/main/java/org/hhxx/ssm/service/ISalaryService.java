package org.hhxx.ssm.service;

import java.util.List;

import org.hhxx.ssm.entity.Salary;

public interface ISalaryService {

	List<Salary> findByEmp(String workNumber, Integer salaryYear, Integer salaryMonth);

	List<Salary> findByAdmin(Integer deptId, Integer positionId, String empName, String workNumber, Integer startMonth,
			Integer endMonth, Integer salaryYear);

}
