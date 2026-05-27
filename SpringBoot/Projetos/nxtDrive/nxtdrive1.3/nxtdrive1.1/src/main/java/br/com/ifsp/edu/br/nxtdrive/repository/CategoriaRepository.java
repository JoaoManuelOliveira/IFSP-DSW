package br.com.ifsp.edu.br.nxtdrive.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifsp.edu.br.nxtdrive.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

}
