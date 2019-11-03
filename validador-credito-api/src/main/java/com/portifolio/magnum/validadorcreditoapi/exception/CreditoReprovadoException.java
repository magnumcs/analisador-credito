package com.portifolio.magnum.validadorcreditoapi.exception;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;

public class CreditoReprovadoException extends RuntimeException {

    private PropostaCreditoWrapper propostaCreditoWrapper;

    public CreditoReprovadoException(PropostaCreditoWrapper propostaCreditoWrapper) {
        super();
        this.propostaCreditoWrapper = propostaCreditoWrapper;
    }

    public PropostaCreditoWrapper getPropostaCreditoWrapper() {
        return propostaCreditoWrapper;
    }

    public void setPropostaCreditoWrapper(PropostaCreditoWrapper propostaCreditoWrapper) {
        this.propostaCreditoWrapper = propostaCreditoWrapper;
    }
}
