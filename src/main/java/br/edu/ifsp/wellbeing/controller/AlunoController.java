package br.edu.ifsp.wellbeing.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.model.AlunoDAO;

public class AlunoController {
    @GetMapping("/alunos")
	public ArrayList<Aluno> endPoint1(){
	ArrayList<Aluno> alunos = new ArrayList<>();
	alunos.add(new Aluno(null, null, null, null, null));

	// Criar um objeto do DAO
	AlunoDAO alunoDao = AlunoDAO.getInstance();
	// Recuperar todos os alunos
	//ArrayList<Aluno> aluno = AlunoDAO.findAll();
	// Retornar as listas do animais
	return alunos;
	}
}
