package com.smartbooking.model;

/*Definindo os atributos da classe */

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private TipoUsuario role;


    /*Criando getters e setters */

    public String getNome(){
        return nome;
    }

    public void  setNome(String nome){
    this.nome = nome;
    
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;

    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
    this.senha = senha;

    }

    public TipoUsuario getRole(){
        return role;
    }

    public void setRole(TipoUsuario role){
    this.role = role;
    }

    /*Definindo construtor */

    public Usuario(String nome, String email, String senha, TipoUsuario role){
        this.nome = nome;
        this.email =email;
        this.senha = senha;
         this.role = role;
    }
}


