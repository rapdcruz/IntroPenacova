package com.example.intropenacova.model;

public class Faqs {

    private String NomeFaqs, DescricaoFaqs;
    private boolean expandable;


    public String getNomeFaqs() {
        return NomeFaqs;
    }

    public void setNomeFaqs(String nomeFaqs) {
        NomeFaqs = nomeFaqs;
    }

    public String getDescricaoFaqs() {
        return DescricaoFaqs;
    }

    public void setDescricaoFaqs(String descricaoFaqs) {
        DescricaoFaqs = descricaoFaqs;
    }

    public Faqs(String NomeFaqs, String DescricaoFaqs) {
        this.NomeFaqs = NomeFaqs;
        this.DescricaoFaqs = DescricaoFaqs;
        this.expandable = false;
    }


    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    @Override
    public String toString() {
        return "faqs{" +
                "NomeFaqs='" + NomeFaqs + '\'' +
                ", DescricaoFaqs='" + DescricaoFaqs + '\'' +
                '}';
    }
}
