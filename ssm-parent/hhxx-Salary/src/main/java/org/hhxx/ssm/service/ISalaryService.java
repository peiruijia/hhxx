package org.hhxx.ssm.service;

import java.util.List;

import org.hhxx.ssm.entity.Salary;

public interface ISalaryService {

	List<Salary> findByEmp(Integer empId, Integer salaryYear, Integer salaryMonth);

	List<Salary> findByAdmin(Integer deptId, Integer positionId, String empName, Integer empId, Integer startMonth,
			Integer endMonth, Integer salaryYear);

}
