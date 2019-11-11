package org.hhxx.ssm.handler;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hhxx.ssm.entity.Employee;
import org.hhxx.ssm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeHandler {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "employee/login";
	}
	
	@RequestMapping("/login")
	public String login(String phone,String password,HttpServletRequest request) {
		Employee employee = employeeService.login(phone, password);
		if(employee!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("employee", employee);
			return "employee/login_success";
		}else {
		    return "employee/login";
		}
	}

}
