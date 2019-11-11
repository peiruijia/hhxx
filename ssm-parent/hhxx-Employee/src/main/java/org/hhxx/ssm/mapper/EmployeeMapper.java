package org.hhxx.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hhxx.ssm.entity.Employee;

@Mapper
public interface EmployeeMapper {
	
	void add(Employee employee);
	
	void update(Employee employee);
	
	Employee findByPhoneAndPassword(@Param("phone")String phone,@Param("password")String password);
	
	Employee findById(int id);
	
	List<Employee> findAll();
	

}
