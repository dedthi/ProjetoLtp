package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;

public abstract class Usuario {
    protected String nome;
    protected String CPF;
    ArrayList<Relatorio> relatorios;
    ArrayList<Leitura> leituras;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
    }

    public abstract String gerarDadosUsuario();

    public abstract void processarLeitura();

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
