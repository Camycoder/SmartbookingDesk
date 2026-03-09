package com.smartbooking.model;

import java.time.LocalDate;

public class Reserva {

    private Usuario usuario;
    private Espaco espaco;
    private StatusReserva status;
    private TipoTurno periodo;
    private LocalDate dataReserva;


    /*Criando getters and setters */

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

    public StatusReserva getStatus(){
        return status;
    }

    public void  setStatus (StatusReserva status){
        this.status = status;
    }

    public TipoTurno getPeriodo(){
        return periodo;
    }

    public void setPeriodo(TipoTurno periodo){
        this.periodo = periodo;
    }

    public LocalDate getDataReserva(){
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
}

    /*Criando o construtor */

    public Reserva(Usuario usuario, Espaco espaco, StatusReserva status, TipoTurno periodo, LocalDate dataReserva){
        this.usuario = usuario;
        this.espaco = espaco;
        this.status = status;
        this.periodo = periodo;
        this.dataReserva = dataReserva;

    }

}
