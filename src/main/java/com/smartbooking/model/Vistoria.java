package com.smartbooking.model;

import java.time.LocalDate;

public class Vistoria {

    private Usuario usuario;
    private Espaco espaco;
    private StatusVistoria status;
    private LocalDate dataVistoria;


    /*Criando setters and getters */

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Espaco getEspaco(){
        return espaco;
    }

    public void setEspaco(Espaco espaco){
        this.espaco = espaco;
    }

    public StatusVistoria getStatus(){
        return status;
    }

    public void setStatus(StatusVistoria status){
        this.status = status;
    
    }

    public LocalDate getDataVistoria(){
        return dataVistoria;

    }
    
     public void setDataVistoria(LocalDate dataVistoria){
        this.dataVistoria = dataVistoria;
    }

    /*Criando o construtor */

    public Vistoria (Usuario usuario, Espaco espaco, StatusVistoria status, LocalDate dataVistoria) {
        this.usuario = usuario;
        this.espaco = espaco;
        this.status = status;
        this.dataVistoria = dataVistoria;

    }


}
