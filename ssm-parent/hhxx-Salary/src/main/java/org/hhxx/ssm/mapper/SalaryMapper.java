package org.hhxx.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hhxx.ssm.entity.Salary;

@Mapper
public interface SalaryMapper {

	List<Salary> findByEmp(@Param("workNumber") String workNumber, 
			@Param("salaryYear") Integer salaryYear,
			@Param("salaryMonth") Integer salaryMonth);

	List<Salary> findByAdmin(@Param("deptId") Integer deptId, 
			@Param("positionId") Integer positionId,
			@Param("empName") String empName, 
			@Param("workNumber") String workNumber, 
			@Param("startMonth") Integer startMonth,
			@Param("endMonth") Integer endMonth, 
			@Param("salaryYear") Integer salaryYear);

}
