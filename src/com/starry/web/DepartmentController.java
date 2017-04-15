package com.starry.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starry.entity.Department;
import com.starry.service.IDepartmentService;

@Controller
@RequestMapping("/")
public class DepartmentController {
	@Autowired
	private IDepartmentService departmentService;
	
	public IDepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@RequestMapping(value="getDepart")
	public String getAll(Model model) {
		List<Department> departments = departmentService.getAll();
		model.addAttribute("department", departments);
		System.out.println("Controller" + departments);
		return "adv";
	}
	@RequestMapping(value="getName")
	public String getName(Model model) {
		List<Department> departments = departmentService.getAll();
		model.addAttribute("department", departments);
		System.out.println("Controller" + departments);
		return "info";
	}
}