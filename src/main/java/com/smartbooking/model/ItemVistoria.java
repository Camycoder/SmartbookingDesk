package com.smartbooking.model;

public class ItemVistoria {
    
    private String itemVistoria;
    private boolean avariado;
    private String descricaoAvaria;

    /*Criando getters and setters */

    public String getItemVistoria(){
        return itemVistoria;
    }

    public void setItemVistoria(String itemVistoria){
        this.itemVistoria = itemVistoria;
    }


    public boolean isAvariado(){
        return avariado;
    }

    public void setAvariado(boolean avariado){
        this.avariado = avariado;
    }


    public String getDescricaoAvaria(){
        return descricaoAvaria;

    }

    public void setDescricaoAvaria(String descricaoAvaria){
        this.descricaoAvaria = descricaoAvaria;

    }

    /*Criacao construtor */

    public ItemVistoria(String itemVistoria, boolean avariado, String descricaoAvaria){

        this.itemVistoria = itemVistoria;
        this.avariado = avariado;
        this.descricaoAvaria = descricaoAvaria;

    }


}

