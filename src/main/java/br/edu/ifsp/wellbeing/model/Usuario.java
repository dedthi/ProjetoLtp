package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String nome;
    protected String CPF;
    ArrayList<Relatorio> relatorios;
    ArrayList<Leitura> leituras;

    public Usuario(){

    }

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
    }

    public abstract String gerarDadosUsuario();
    public abstract void processarLeitura();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }     
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }   
}
