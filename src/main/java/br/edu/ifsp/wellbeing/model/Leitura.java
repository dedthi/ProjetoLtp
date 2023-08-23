package br.edu.ifsp.wellbeing.model;

import java.util.Date;
import java.util.ArrayList;

public class Leitura {
    private Date dataEntrada;
    private double valor;
    private String descricao, hora;
    ArrayList<Leitura> leituras;

    public Leitura(Date dataEntrada, double valor, String descricao, String hora) {
        this.dataEntrada = dataEntrada;
        this.valor = valor;
        this.descricao = descricao;
        this.hora = hora;
        leituras = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return "Leitura do sensor no paciente \n[Descricao=" + descricao + "\nDataEntrada=" + dataEntrada + "\nValor=" + valor + "]";
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
}
