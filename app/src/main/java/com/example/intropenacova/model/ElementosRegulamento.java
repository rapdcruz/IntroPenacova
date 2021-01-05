package com.example.intropenacova.model;

public class ElementosRegulamento {
    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String descricao;


    public ElementosRegulamento(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }



    }

