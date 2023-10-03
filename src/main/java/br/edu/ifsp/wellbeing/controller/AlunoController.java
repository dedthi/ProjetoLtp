package br.edu.ifsp.wellbeing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.repository.AlunoRepository;

@RestController
public class AlunoController {
	// thiago
	// https://localhost:8080/wellbeing/alunos/listar
	@Autowired
    AlunoRepository alunoRepository;
	@GetMapping("wellbeing/alunos/listar")
    public List<Aluno> consultAluno() {
    	return (List<Aluno>) alunoRepository.findAll();
    }

	// https://localhost:8080/wellbeing/alunos/cadastrar
	@PostMapping("wellbeing/alunos/cadastrar")
	public String addAluno(@RequestBody Aluno novoAluno) {
		alunoRepository.save(novoAluno);
		return "Aluno cadastrado com Sucesso";
	}

	// https://localhost:8080/wellbeing/alunos/deletar
	@DeleteMapping("wellbeing/alunos/deletar/{id}")
	public String delAluno(@PathVariable("id") Long id) {
		alunoRepository.deleteById(id);
		return "Aluno com id: " + id +" deletado com sucesso";
	}
	// @DeleteMapping("wellbeing/alunos/deletar/{nome}")
	// public Aluno delAluno(@PathVariable("nome") String nome) {
	// 	List<Aluno> listaAlunos = Database.recupAlunos();
	// 	for (Aluno aluno : listaAlunos) {
	// 		if (aluno.getNome().equals(nome)) {
	// 			Database.delDadoAluno(aluno);
	// 			return aluno;
	// 		}
	// 	}
	// 	return null;
	// }

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