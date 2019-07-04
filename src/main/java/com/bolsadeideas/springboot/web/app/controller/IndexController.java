package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(value = {"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "MERWEBO DIJE!");
		return "index";
	}
}
