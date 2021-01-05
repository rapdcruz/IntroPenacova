package com.example.intropenacova.model;

public class Barra_ElementoEventosRecomendados {

    String nome;
    String data;
    Integer PhotoEventoUrl;

    public Barra_ElementoEventosRecomendados(String nome_, String data_, Integer PhotoEventoUrl_) {
        this.nome = nome_;
        this.data = data_;
        this.PhotoEventoUrl = PhotoEventoUrl_;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getPhotoEventoUrl() {
        return PhotoEventoUrl;
    }

    public void setPhotoEventoUrl(Integer photoEventoUrl) {
        PhotoEventoUrl = photoEventoUrl;
    }


}

