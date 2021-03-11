package guru.springframework.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokesapp.services.JokesService;

@Controller
public class JokesController {
	
	private final JokesService jokesService;

	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}
	
	@RequestMapping("/")
	public String showJoke(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		return "index";
	}
}
