package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminUserController {
	
	@RequestMapping("/formuser")
	public String goHome(Model model) {
		model.addAttribute("page", "formcreateuser");
		return "admin/formcreateuser";
	}

}
