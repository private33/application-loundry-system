package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/customers")
public class AdminCustomerController {

	@RequestMapping("/create")
	public String goToFormCreateCustomer(Model model1) {
		model1.addAttribute("page", "createcustomer");
		return "admin/forms/formcreatecustomer";
	}
	
	@RequestMapping("/datacustomer")
	public String goToDataCustomer(Model model2) {
		model2.addAttribute("page", "datacustomer");
		return "admin/datatables/datacustomer";
	}
	
	@RequestMapping("/edit")
	public String goToFormEditCustomer(Model model3) {
		model3.addAttribute("page", "editcustomer");
		return "admin/forms/formeditcustomer";
	}
	
	@RequestMapping("/delete")
	public String goToDeleteCustomer(Model model4) {
		model4.addAttribute("page", "deleteecustomer");
		return "admin/forms/deletecustomer";
	}
	
	/*
	@RequestMapping("/datasoap")
	public String goToDataSoap(Model model4) {
		model4.addAttribute("page", "datacustomer");
		return "admin/datatables/datacustomer";
	}*/
}
