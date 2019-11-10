package com.portifolio.magnum.cadastropropostaapi.domain;

public enum EstadoEnum {

    AC("AC"), AL("AL"), AP("AP"), AM("AM"), BA("BA"), CE("CE"),
    DF("DF"), ES("ES"), GO("GO"), MA("MA"), MT("MT"), MS("MS"),
    MG("MG"), PA("PA"), PB("PB"), PR("PR"), PE("PE"), PI("PI"),
    RJ("RJ"), RN("RN"), RS("RS"), RO("RO"), RR("RR"), SC("SC"),
    SP("SP"), SE("SE"), TO("TO");

    String value;

    EstadoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
