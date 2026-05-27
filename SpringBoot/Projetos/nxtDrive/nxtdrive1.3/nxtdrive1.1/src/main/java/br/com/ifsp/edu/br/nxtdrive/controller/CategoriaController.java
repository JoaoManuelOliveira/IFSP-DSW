package br.com.ifsp.edu.br.nxtdrive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ifsp.edu.br.nxtdrive.model.Categoria;
import br.com.ifsp.edu.br.nxtdrive.model.Usuario;
import br.com.ifsp.edu.br.nxtdrive.service.CategoriaService;
import br.com.ifsp.edu.br.nxtdrive.service.UsuarioService;

@Controller
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	@PostMapping("/adicionarCategoria")
	public String postAdicionarCategoria(@ModelAttribute Categoria categoria) {
		categoriaService.adicionarCategoria(categoria.getNome());
		return "redirect:/dashboard";
	}

	@PostMapping("/removerCategoria")
	public String postRemoverCategoria(@ModelAttribute Categoria categoria) {
		categoriaService.excluirCategoria(categoria.getIdCategoria());
		return "redirect:/dashboard";
	}

	@PostMapping("/editarCategoria")
	public String postEditarCategoria(@ModelAttribute Categoria categoria) {
		categoriaService.editarCategoria(categoria.getIdCategoria(), categoria.getNome());
		return "redirect:/dashboard";
	}
}