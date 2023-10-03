package br.edu.ifsp.wellbeing.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.Database;
import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.model.Relatorio;

@RestController
public class AlunoController {
	// thiago
	// https://localhost:8080/listar/alunos
	@GetMapping("wellbeing/alunos/listar")
	// public List<Aluno> recuperarAlunos() {
	// 	AlunoDAO alunoDAO = AlunoDAO.getInstance();
	// 	return alunoDAO.read();
	// }

	// https://localhost:8080/wellbeing/alunos/cadastrar
	@PostMapping("wellbeing/alunos/cadastrar")
	public void addAluno(@RequestBody Aluno novoAluno) {
		Database.addDadoAluno(novoAluno);
	}

	// https://localhost:8080/wellbeing/alunos/deletar
	@DeleteMapping("wellbeing/alunos/deletar/{nome}")
	public Aluno delAluno(@PathVariable("nome") String nome) {
		List<Aluno> listaAlunos = Database.recupAlunos();
		for (Aluno aluno : listaAlunos) {
			if (aluno.getNome().equals(nome)) {
				Database.delDadoAluno(aluno);
				return aluno;
			}
		}
		return null;
	}

	// vitor
	// https://localhost:8080/recuperar/{nome}
// 	@GetMapping("/recuperar/{nome}")
// 	public Aluno endPoint2(
// 			@PathVariable("nome") String nome) {
// 		System.out.println(nome);
// 		Aluno alunos = AlunoDAO.getInstance().getByName(nome);
// 		return alunos;

// 	}
 }