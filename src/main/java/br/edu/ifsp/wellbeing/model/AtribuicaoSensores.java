package br.edu.ifsp.wellbeing.model;

public interface AtribuicaoSensores {
    //  É static final POR PADRÃO DENTRO DE UMA INTERFACE 
    int MAXIMO = 50;

    public void adicionarSensor(Sensor sensor);
    public void exibirRelatorio();
}

