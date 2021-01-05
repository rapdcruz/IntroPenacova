package com.example.intropenacova.model;

public class ElementosPoliticaPrivacidade {

    String Titulo;
    String Conteudo;

    public String getTitulo_politicaPrivacidade() {
        return Titulo;
    }

    public void setTitulo_politicaPrivacidade(String titulo_politicaPrivacidade) {
        Titulo = titulo_politicaPrivacidade;
    }

    public String getTexto_politicaPrivacidade() {
        return Conteudo;
    }

    public void setTexto_politicaPrivacidade(String texto_politicaPrivacidade) {
        Conteudo = texto_politicaPrivacidade;
    }

    public ElementosPoliticaPrivacidade(String titulo_politicaPrivacidade, String texto_politicaPrivacidade) {
        Titulo = titulo_politicaPrivacidade;
        Conteudo = texto_politicaPrivacidade;
    }


}








