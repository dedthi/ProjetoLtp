package br.edu.ifsp.wellbeing.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Leitura {
    private LocalDate dataEntrada;
    private double valor;
    private String descricao;
    private LocalTime hora;
    ArrayList<Leitura> leituras;

    public Leitura (LocalDate dataEntrada, double valor, String descricao, LocalTime hora) {
        this.dataEntrada = dataEntrada;
        this.valor = valor;
        this.descricao = descricao;
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return "Leitura do sensor no paciente \n[Descricao=" + descricao + "\nDataEntrada=" + dataEntrada + "\nValor=" + valor + "]";
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada (LocalDate dataEntrada) {
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
}
