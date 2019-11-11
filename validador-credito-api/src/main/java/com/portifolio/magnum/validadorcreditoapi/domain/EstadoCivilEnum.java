package com.portifolio.magnum.validadorcreditoapi.domain;

public enum EstadoCivilEnum {

    SOLTEIRO(0, "Solteiro"),
    CASADO(1, "Casado"),
    DIVORCIADO(3, "Divorciado"),
    VIUVO(4, "Viúvo");

    private Integer id;
    private String valor;

    EstadoCivilEnum(Integer id, String valor) {
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
