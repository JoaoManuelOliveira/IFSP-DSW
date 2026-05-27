package br.com.ifsp.edu.br.nxtdrive.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifsp.edu.br.nxtdrive.model.Categoria;
import br.com.ifsp.edu.br.nxtdrive.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;


	public void adicionarCategoria(String nome) {
		Categoria categoria = new Categoria();
		categoria.setNome(nome);
		categoriaRepository.save(categoria);
	}

	public List<Categoria> listarCategorias() {
		return categoriaRepository.findAll();
	}

	public void editarCategoria(UUID idCategoria, String novoNome) {
		categoriaRepository.findById(idCategoria).ifPresent(categoria -> {
			categoria.setNome(novoNome);
			categoriaRepository.save(categoria);
		});
	}

	public void excluirCategoria(UUID idCategoria) {
		if (categoriaRepository.existsById(idCategoria)) {
			categoriaRepository.deleteById(idCategoria);
		}
	}
}