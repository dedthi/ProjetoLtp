package br.edu.ifsp.wellbeing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sensor extends Especificacoes{
    private String nome;
    private String tipoSensor;
    private String dataEntrada;
    private String garantia;
    ArrayList<Sensor> sensoresMonitorados;

    public Sensor(String codigo, double preco, String nome, String tipoSensor, String dataEntrada, String garantia) {
        super(codigo, preco);
        this.nome = nome;
        this.tipoSensor = tipoSensor;
        this.dataEntrada = dataEntrada;
        this.garantia = garantia;
    }

    public static void imprimirSensor(List<Sensor> sensoresMonitorados2) {
        for(int i=0 ; i<sensoresMonitorados2.size() ; i++){
                System.out.println(sensoresMonitorados2.get(i));
             }
        }
    
    public static void deletarSensor(ArrayList<Sensor> sensoresMonitorados) {
        Scanner x = new Scanner(System.in);
        String buscaItem;
        System.out.println("Digite o nome do sensor que deseja apagar: ");
        buscaItem = x.next();
            for(int i=0 ; i<sensoresMonitorados.size() ; i++){
                if((sensoresMonitorados.get(i)).getNome().equals(buscaItem) == true) {
                    sensoresMonitorados.remove(i);
                }
            }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    
}
