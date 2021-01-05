package com.example.intropenacova.model;

public class Barra_ElementoEventosAnteriores {


    String TextoNomeEventoAnterior;
    String TextoDataEventoAnterior;
    Integer Imagem_eventoAnterior;

    public String getTextoNomeEventoAnterior() { return TextoNomeEventoAnterior; }
    public void setTextoNomeEventoAnterior(String textoNomeEventoAnterior) {
        this.TextoNomeEventoAnterior = textoNomeEventoAnterior;
    }

    public String getTextoDataEventoAnterior() { return TextoDataEventoAnterior; }
    public void setTextoDataEventoAnterior(String textoDataEventoAnterior) {
        this.TextoDataEventoAnterior = textoDataEventoAnterior;
    }

    public Integer getImagem_eventoAnterior() { return Imagem_eventoAnterior; }
    public void setImagem_eventoAnterior(Integer imagem_eventoAnterior)
    { this.Imagem_eventoAnterior = imagem_eventoAnterior; }



    public Barra_ElementoEventosAnteriores(String textoNomeEventoAnterior_, String textoDataEventoAnterior_, Integer imagem_eventoAnterior_) {
        this.TextoNomeEventoAnterior = textoNomeEventoAnterior_;
        this.TextoDataEventoAnterior = textoDataEventoAnterior_;
        this.Imagem_eventoAnterior = imagem_eventoAnterior_;
    }

}

