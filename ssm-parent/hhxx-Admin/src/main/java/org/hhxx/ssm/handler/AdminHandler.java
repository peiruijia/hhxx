package org.hhxx.ssm.handler;


import javax.servlet.http.HttpSession;

import org.hhxx.ssm.entity.Admin;
import org.hhxx.ssm.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminHandler {
	
	@Autowired
	private IAdminService adminService;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "admin/login";
	}
	
	@RequestMapping("/login")
	public String login(String name,String password,HttpSession session) {
		Admin admin = adminService.login(name, password);
		if(admin!=null) {
			session.setAttribute("admin", admin);
		   return "admin/login_success";
		}else {
			return "admin/login";
		}
	}
	

}
