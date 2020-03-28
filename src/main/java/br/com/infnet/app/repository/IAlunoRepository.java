package br.com.infnet.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.app.negocio.Aluno;

@Repository
public interface IAlunoRepository extends CrudRepository<Aluno, Integer> {
	
}
