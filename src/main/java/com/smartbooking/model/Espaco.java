package com.smartbooking.model;

public class Espaco {
    private String nomeEspaco;
    private int capacidade;
    private boolean disponibilidade;


/*Criando getters and setters */

public  String getNomeEspaco(){
    return nomeEspaco;
}

public void setNomeEspaco(String nomeEspaco){
    this.nomeEspaco = nomeEspaco;
}

public int getCapacidade(){
    return capacidade;
}

public void setCapacidade (int capacidade){
    this.capacidade = capacidade;

}

public boolean isDisponibilidade(){
    return disponibilidade;
}

 public void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;

 }   

 /*Criando construtor */

 public Espaco(String nomeEspaco, int capacidade, boolean disponibilidade){

    this.nomeEspaco = nomeEspaco;
    this.capacidade = capacidade;
    this.disponibilidade = disponibilidade;

 }

}



