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
	
	@RequestMapping("/top")
	public String top() {
		return "salary/top";
	}
	
	@RequestMapping("/adminLeft")
	public String adminLeft() {
		return "salary/adminLeft";
	}
	
	@RequestMapping("/empLeft")
	public String empLeft() {
		return "salary/empLeft";
	}
	
	@RequestMapping("/adminList")
	public String adminList() {
		return "salary/adminList";
	}
	
	@RequestMapping("/empList")
	public String empList() {
		return "salary/empList";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "salary/index";
	}
	
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
		List<Salary> salaryList = salaryService.findByEmp(emp.getWorkNumber(), salaryYear, salaryMonth);
		map.put("salaryList", salaryList);
		return "salary/empSalarySearch";
	}
	
	@RequestMapping("/adminSalarySearch")
	public String adminSearch(Integer deptId,Integer positionId,String empName,String workNumber,Integer salaryYear,Integer startMonth,Integer endMonth,Map<String,Object> map) {
		List<Salary> salaryList = salaryService.findByAdmin(deptId, positionId, empName+"%", workNumber, startMonth, endMonth, salaryYear);
		/*for(Salary s:salaryList) {
			System.out.println(s);
		}*/
		map.put("salaryList", salaryList);
		return "salary/adminList";
	}
}
