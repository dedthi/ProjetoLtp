package br.edu.ifsp.wellbeing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.Database;
import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.model.AlunoDAO;

@RestController
public class AlunoController {
	//thiago
	//https://localhost:8080/listar/alunos
    @GetMapping("/listar/alunos")
	public List<Aluno> recuperarAlunos(){
		AlunoDAO alunoDAO = AlunoDAO.getInstance();
		return 	alunoDAO.read();
	}

	@PostMapping("/cadastrar/aluno")
	public void addAluno(@RequestBody Aluno novoAluno) {
        Database.addDadoAluno(novoAluno);
    }
}
