package com.griffith.OmikujiForm.Controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	@RequestMapping("/")
	public String home() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@PostMapping("/omikuji_info")
	public String process(
			@RequestParam("num_input") Integer num_input,
			@RequestParam("city") String city,
			@RequestParam("name") String name,
			@RequestParam("activity") String activity,
			@RequestParam("animal") String animal,
			@RequestParam("nice") String nice,
			HttpSession session
			) {
		
		session.setAttribute("num_input", num_input);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("activity", activity);
		session.setAttribute("animal", animal);
		session.setAttribute("nice", nice);

		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String showDetails() {

		return "omikuji.jsp";
	}
}
