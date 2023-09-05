package br.edu.ifsp.wellbeing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	//https://localhost:8080/cadastrar/aluno
	@PostMapping("/cadastrar/aluno")
	public void addAluno(@RequestBody Aluno novoAluno) {
        Database.addDadoAluno(novoAluno);
    }

	//https://localhost:8080/deletar/aluno
	@DeleteMapping("/deletar/aluno")
	public void delAluno(@RequestBody Aluno delAluno){
		Database.delDadoAluno(delAluno);
	}

	//vitor
	//https://localhost:8080/recuperar/{nome}
	@GetMapping("/recuperar/{nome}")
	public Aluno endPoint2(
				@PathVariable("nome")
            	String nome
	){
		System.out.println(nome);
        Aluno alunos = AlunoDAO.getInstance().getByName(nome);
         return alunos;

	}

}
