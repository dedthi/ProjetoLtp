package br.edu.ifsp.wellbeing.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.wellbeing.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    public Aluno findByNome(String nome);
}
