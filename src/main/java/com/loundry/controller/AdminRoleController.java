package com.loundry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.loundry.entity.Roles;
import com.loundry.service.IRoles;

@Controller
@RequestMapping("/admin/roles")
public class AdminRoleController {

	@Autowired
	private IRoles roleService;
	
	@RequestMapping(path="/create")
	public String goToFormCreateRole(Model model1) {
		return "admin/forms/formcreaterole";
	}
	
	@RequestMapping(path="/createnewroles", method=RequestMethod.POST)
	public String createRole(Roles roles, RedirectAttributes redirectAttributes){
		try {
			this.roleService.createRoles(roles);
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("belum berhasil, failed!");
			return "../../admin/roles/create";
		}	
	redirectAttributes.addFlashAttribute("msg", "Create new category has been successfully!!");
	return "redirect:../../admin/index";
	}
	
	@RequestMapping(path="/dataroles", method=RequestMethod.GET)
	public String goToDataRole(Model model2) {
		List<Roles>roles = this.roleService.findAllRoles();
		model2.addAttribute("data", roles);
		return "admin/datatables/dataroles";
	}
	
	@RequestMapping(path="/edit/{roleId}", method = RequestMethod.GET)
	public String goToFormEditRole(@PathVariable int roleId, Model model3) {
		Roles editrole = this.roleService.findOneRoles(roleId);
		model3.addAttribute("editrole", editrole);
		return "admin/forms/formeditrole";
	}
	
	@RequestMapping(path ="/edit/editroles", method = RequestMethod.POST)
	public String updateRoles(Roles roles, RedirectAttributes redirectAttributes, Model model4) {
		try {
			this.roleService.updateRoles(roles);
		} catch (Exception ex) {
			model4.addAttribute("data", roles);
			return "formeditrole";
		}
		return "redirect:../../roles/dataroles";
	}
	
	@RequestMapping(path="/delete/{roleId}" ,  method=RequestMethod.GET)
	public String goToDeleteRole(@PathVariable int roleId, RedirectAttributes redirectAttributes) {
		try {
			this.roleService.deleteOne(roleId);
		} catch (Exception ex) {
			return "redirect:/admin/roles/dataroles/#";
		}
		return "redirect:/admin/roles/dataroles";
	}
}
