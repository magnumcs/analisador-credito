package com.portifolio.magnum.cadastropropostaapi.domain;

public enum RespostaPropostaEnum {

    APROVADO(0, "Aprovado"),
    REPROVADO(1, "Reprovado");

    private Integer id;
    private String valor;

    RespostaPropostaEnum(Integer id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
