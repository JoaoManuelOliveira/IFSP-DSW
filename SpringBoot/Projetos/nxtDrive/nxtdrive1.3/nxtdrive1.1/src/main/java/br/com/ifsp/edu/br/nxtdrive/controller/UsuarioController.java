package br.com.ifsp.edu.br.nxtdrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ifsp.edu.br.nxtdrive.model.Usuario;
import br.com.ifsp.edu.br.nxtdrive.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@PostMapping("/dashboard")
	public String postIndex(@ModelAttribute Usuario usuario, Model model) {
		// @ModelAttribute faz o Spring pegar os dados do formulário HTML
		// automaticamente.

		boolean valido = usuarioService.verificarCredenciais(usuario);

		if (valido) {
			return "redirect:/dashboard";
		}
		model.addAttribute("erro", "Email ou senha incorretos!");

		return "index";
	}
}
