package com.portifolio.magnum.cadastropropostaapi.domain;

public enum GeneroEnum {

    Feminino(0, "Feminino"),
    Masculino(1, "Masculino");

    private Integer id;
    private String value;

    GeneroEnum(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
