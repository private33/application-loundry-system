package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminManagementController {
	
	@RequestMapping("/formcreateemployee")
	public String goToFormEmployee(Model model1) {
		model1.addAttribute("page", "formcreateuser");
		return "admin/forms/formcreateemployee";
	}
	
	@RequestMapping("/formcreatecustomer")
	public String goToFormCustomer(Model model2) {
		model2.addAttribute("page", "formcreatecustomer");
		return "admin/forms/formcreatecustomer";
	}
	
	@RequestMapping("/formcreaterole")
	public String goToFormRole(Model model3) {
		model3.addAttribute("page", "formcreaterole");
		return "admin/forms/formcreaterole";
	}
	
	@RequestMapping("/formcreatesoap")
	public String goToFormSoap(Model model4) {
		model4.addAttribute("page", "formcreatesoap");
		return "admin/forms/formcreatesoap";
	}
}
