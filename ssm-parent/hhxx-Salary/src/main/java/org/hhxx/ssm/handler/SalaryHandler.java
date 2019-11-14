package org.hhxx.ssm.handler;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hhxx.ssm.entity.Employee;
import org.hhxx.ssm.entity.Salary;
import org.hhxx.ssm.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalaryHandler {
	@Autowired
	private ISalaryService salaryService;
	
	@RequestMapping("/toEmpSalarySearch")
	public String toEmpSearch() {
		return "salary/empSalarySearch";
	}
	
	@RequestMapping("/toAdminSalarySearch")
	public String toAdminSearch() {
		return "salary/adminSalarySearch";
	}
	
	@RequestMapping("/empSalarySearch")
	public String empSearch(Integer salaryYear,Integer salaryMonth,Map<String,Object> map,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Employee emp = (Employee) session.getAttribute("employee");
		List<Salary> salaryList = salaryService.findByEmp(emp.getId(), salaryYear, salaryMonth);
		map.put("salaryList", salaryList);
		return "salary/empSalarySearch";
	}
	
	@RequestMapping("/adminSalarySearch")
	public String adminSearch(Integer deptId,Integer positionId,String empName,Integer empId,Integer salaryYear,Integer startMonth,Integer endMonth,Map<String,Object> map) {
		List<Salary> salaryList = salaryService.findByAdmin(deptId, positionId, empName, empId, startMonth, endMonth, salaryYear);
		map.put("salaryList", salaryList);
		return "salary/adminSalarySearch";
	}
}
