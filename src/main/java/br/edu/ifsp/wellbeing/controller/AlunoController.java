package br.edu.ifsp.wellbeing.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifsp.wellbeing.Database;
import br.edu.ifsp.wellbeing.model.Aluno;
import br.edu.ifsp.wellbeing.model.AlunoDAO;

public class AlunoController {
	//https://localhost:8080/alunos
    @GetMapping("/alunos")
	public ArrayList<Aluno> recuperarAlunos(){
		return Database.recupAlunos();
	}


}
