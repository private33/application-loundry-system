package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/employees")
public class AdminEmployeeController {
	
	@RequestMapping("/create")
	public String goToFormCreateEmployee(Model model1) {
		model1.addAttribute("page", "createemployee");
		return "admin/forms/formcreateemployee";
	}
	
	@RequestMapping("/dataemployee")
	public String goToDataEmployee(Model model2) {
		model2.addAttribute("page", "dataemployee");
		return "admin/datatables/dataemployee";
	}
	
	@RequestMapping("/edit")
	public String goToFormEditEmployee(Model model3) {
		model3.addAttribute("page", "editemployee");
		return "admin/forms/formeditemployee";
	}
	
	@RequestMapping("/delete")
	public String goToDeleteEmployee(Model model4) {
		model4.addAttribute("page", "deleteemployee");
		return "admin/forms/deleteemployee";
	}
	
	/*
	@RequestMapping("/formcreatesoap")
	public String goToFormSoap(Model model4) {
		model4.addAttribute("page", "formcreatesoap");
		return "admin/forms/formcreatesoap";
	}*/
}
