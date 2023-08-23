package br.edu.ifsp.wellbeing.model;

public class Especificacoes {
    private String codigo;
    private double preco;

    public Especificacoes(String codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}
