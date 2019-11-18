package org.hhxx.ssm.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.hhxx.ssm.entity.Dept;
import org.hhxx.ssm.entity.Employee;
import org.hhxx.ssm.entity.Position;
import org.hhxx.ssm.entity.Salary;
import org.hhxx.ssm.service.IDeptService;
import org.hhxx.ssm.service.IPositionService;
import org.hhxx.ssm.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class SalaryHandler {
	@Autowired
	private ISalaryService salaryService;
	
	@Autowired
	private IDeptService deptService;
	
	@Autowired
	private IPositionService positionService;
	
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
		//Employee emp = new Employee();
		//emp.setWorkNumber("NO-001");
		List<Salary> salaryList = salaryService.findByEmp(emp.getWorkNumber(), salaryYear, salaryMonth);
		map.put("salaryList", salaryList);
		return "salary/empList";
	}
	
	@RequestMapping("/adminSalarySearch")
	public String adminSearch(String deptId,String positionId,String empName,String workNumber,Integer salaryYear,Integer startMonth,Integer endMonth,Map<String,Object> map) {
		Integer sdeptId=null;
		if(deptId.equals("undefined")) {
		}else {
			sdeptId=Integer.valueOf(deptId);
		}
		Integer spositionId =null;
		if(positionId !=null) {
		if(positionId.equals("undefined")) {
		}else {
			spositionId=Integer.valueOf(positionId);
		}
		}
		List<Salary> salaryList = salaryService.findByAdmin(sdeptId, spositionId, empName+"%", workNumber, startMonth, endMonth, salaryYear);
		map.put("salaryList", salaryList);
		return "salary/adminList";
	}
	
	@RequestMapping("/deptList")
	@ResponseBody
	private void deptList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Dept> deptList = deptService.findAll();
		Dept dept0 = new Dept(null,"",null,null);
		deptList.add(0,dept0);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String json = JSON.toJSONString(deptList);
		out.write(json);
		out.close();
	}
	
	@RequestMapping("/positionList")
	@ResponseBody
	private void positionList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sdeptId = request.getParameter("deptId");
		Integer deptId=null;
		if(sdeptId.equals("undefined")) {
			
		}else {
			deptId=Integer.valueOf(sdeptId);
		}
		List<Position> positionList = positionService.findByDeptId(deptId);
		Position position0 = new Position(null,"",null,null,null,null);
		positionList.add(0,position0);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String json = JSON.toJSONString(positionList);
		out.write(json);
		out.close();
	}
}
