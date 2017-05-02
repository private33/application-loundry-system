package com.loundry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsumenController {

	@RequestMapping("/")
	public String goHome() {
		return "user/index";
	}
	
	@RequestMapping("/index")
	public String goHomeWithModel(Model model) {
		return "user/index";
	}
	
	@RequestMapping("/about")
	public String goAboutWithModel(Model model2) {
		return "user/about";
	}
	
	@RequestMapping("/services")
	public String goServicesWithModel(Model model3) {
		return "user/services";
	}
	
	@RequestMapping("/pricing")
	public String goPricingWithModel(Model model4) {
		return "user/pricing";
	}
	
	@RequestMapping("/faq")
	public String goFaqWithModel(Model model5) {
		return "user/faq";
	}
	
	@RequestMapping("/blog")
	public String goBlogWithModel(Model model6) {
		return "user/blog";
	}
	
	@RequestMapping("/contact")
	public String goContactWithModel(Model model7) {
		return "user/contact";
	}
	
	@RequestMapping("/blog-1")
	public String goBlog1WithModel(Model model8) {
		return "user/blog-1";
	}
	
	@RequestMapping("/blog-2")
	public String goBlog2WithModel(Model model9) {
		return "user/blog-2";
	}
	
	@RequestMapping("/blog-3")
	public String goBlog3WithModel(Model model10) {
		return "user/blog-3";
	}
}
