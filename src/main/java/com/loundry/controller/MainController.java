package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String goHome() {
		return "frontend/index";
	}
	
	@RequestMapping("/index")
	public String goHomeWithModel(Model model) {
		return "frontend/index";
	}
	
	@RequestMapping("/about")
	public String goAboutWithModel(Model model2) {
		return "frontend/about";
	}
	
	@RequestMapping("/services")
	public String goServicesWithModel(Model model3) {
		return "frontend/services";
	}
	
	@RequestMapping("/pricing")
	public String goPricingWithModel(Model model4) {
		return "frontend/pricing";
	}
	
	@RequestMapping("/faq")
	public String goFaqWithModel(Model model5) {
		return "frontend/faq";
	}
	
	@RequestMapping("/blog")
	public String goBlogWithModel(Model model6) {
		return "frontend/blog";
	}
	
	@RequestMapping("/contact")
	public String goContactWithModel(Model model7) {
		return "frontend/contact";
	}
	
	@RequestMapping("/blog-1")
	public String goBlog1WithModel(Model model8) {
		return "frontend/blog-1";
	}
	
	@RequestMapping("/blog-2")
	public String goBlog2WithModel(Model model9) {
		return "frontend/blog-2";
	}
	
	@RequestMapping("/blog-3")
	public String goBlog3WithModel(Model model10) {
		return "frontend/blog-3";
	}
}
