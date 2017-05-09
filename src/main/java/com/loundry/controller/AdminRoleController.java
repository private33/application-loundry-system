package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/roles")
public class AdminRoleController {

	@RequestMapping("/create")
	public String goToFormCreateRole(Model model1) {
		model1.addAttribute("page", "createrole");
		return "admin/forms/formcreaterole";
	}
	
	@RequestMapping("/datarole")
	public String goToDataRole(Model model2) {
		model2.addAttribute("page", "datarole");
		return "admin/datatables/datarole";
	}
	
	@RequestMapping("/edit")
	public String goToFormEditRole(Model model3) {
		model3.addAttribute("page", "editrole");
		return "admin/forms/formeditrole";
	}
	
	@RequestMapping("/delete")
	public String goToDeleteRole(Model model4) {
		model4.addAttribute("page", "deleteroler");
		return "admin/forms/deleterole";
	}
}
