package com.griffith.DojoNinja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.griffith.DojoNinja.models.Dojo;
import com.griffith.DojoNinja.models.Ninja;
import com.griffith.DojoNinja.services.AppService;

@Controller
public class HomeController {
	private final AppService appServ;
	
	public HomeController(AppService appServ) {
		this.appServ = appServ;
	}
	
	@RequestMapping("/")
	public String homee() {
		return "redirect:/dojo/new";
	}
	
	@RequestMapping("/dojo/new")
	public String home(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "index.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			this.appServ.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/ninja/add")
	public String addNinja(Model model) {
		model.addAttribute("ninja", new Ninja());
		model.addAttribute("alldojos",this.appServ.getAllDojos());
		return "ninja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		}else {
			this.appServ.createNinja(ninja);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/dojo/{id}")
	public String showOneDojoInfo(@PathVariable("id") Long id, Model model) {
		Dojo dojoToshow = this.appServ.getOneDojo(id);
		
		model.addAttribute("dojoToshow", dojoToshow);
		
		return "oneDojoInfo.jsp";
	}
}
