package com.portifolio.magnum.validadorcreditoapi.domain;

public enum DetalheRespostaEnum {

    ENTRE_500_1000(0, "Entre 500 e 1000"),
    ENTRE_100_500(1, "Entre 100 e 500"),
    ENTRE_1000_1500(2, "Entre 1000 e 1500"),
    ENTRE_1500_2000(3, "Entre 1500 e 2000"),
    SUPERIOR_2000(4, "Super a 2000"),
    REPROVADO_POLITIVA_CREDITO(5, "Reprovado pela política de crédito"),
    RENDA_BAIXA(6, "Renda baixa");

    private Integer id;
    private String valor;

    DetalheRespostaEnum(Integer id, String valor) {
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
