package com.bolsadeideas.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping(value = { "/index", "/", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "MERWEBO DIJE!");
		return "index";
	}

	@GetMapping(value = "/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Edgar");
		usuario.setApellido("Hernandez");
		usuario.setEmail("edgar.burrox5@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Que dice mi bro, " + usuario.getNombre());
		return "perfil";
	}

	@GetMapping(value = "/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Un coñazo de gente");

		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Mamerto", "Ibarreto", "mamerto@gmail.com"));
		usuarios.add(new Usuario("Benito", "Tocamelo", "benito@gmail.com"));
		usuarios.add(new Usuario("Debora", "Meltroso", "debora@gmail.com"));
		
		return usuarios;
	}

}
