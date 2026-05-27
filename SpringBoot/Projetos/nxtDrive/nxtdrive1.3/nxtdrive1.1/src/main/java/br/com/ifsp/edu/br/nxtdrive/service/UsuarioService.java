package br.com.ifsp.edu.br.nxtdrive.service;

import org.springframework.stereotype.Service;

import br.com.ifsp.edu.br.nxtdrive.model.Usuario;

@Service
public class UsuarioService {
	public boolean verificarCredenciais(Usuario usuario) {
		String emailCorreto = "adminsupremo@gmail.com";
		String senhaCorreta = "2doce@admin";
		if (emailCorreto.equals(usuario.getEmail()) && senhaCorreta.equals(usuario.getSenha())) {
			return true;
		} else {
			return false;
		}
	}
}