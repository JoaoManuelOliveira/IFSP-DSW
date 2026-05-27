package br.com.ifsp.edu.br.nxtdrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.ifsp.edu.br.nxtdrive.service.CategoriaService;

@Controller
public class DashboardController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
	    model.addAttribute("categorias", categoriaService.listarCategorias());
	    return "dashboard";
	}
}