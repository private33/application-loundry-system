package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminDataController {

	@RequestMapping("/dataemployee")
	public String goToDataEmployee(Model model1) {
		model1.addAttribute("page", "dataemployee");
		return "admin/datatables/dataemployee";
	}
	
	@RequestMapping("/datacustomer")
	public String goToDataCustomer(Model model2) {
		model2.addAttribute("page", "datacustomer");
		return "admin/datatables/datacustomer";
	}
	
	@RequestMapping("/datarole")
	public String goToDataRole(Model model3) {
		model3.addAttribute("page", "dataemployee");
		return "admin/datatables/dataemployee";
	}
	
	@RequestMapping("/datasoap")
	public String goToDataSoap(Model model4) {
		model4.addAttribute("page", "datacustomer");
		return "admin/datatables/datacustomer";
	}
}
