package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/index")
	public String goToindex(Model model) {
		return "admin/index";
	}
	
	@RequestMapping("/login")
	public String goToLogin(Model model1) {
		model1.addAttribute("page", "login");
		return "admin/login";
	}
	
	@RequestMapping("/profile")
	public String goToProfile(Model model2) {
		model2.addAttribute("page", "profile");
		return "admin/profile";
	}
}
