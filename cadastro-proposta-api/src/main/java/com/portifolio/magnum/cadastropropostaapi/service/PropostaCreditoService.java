package com.portifolio.magnum.cadastropropostaapi.service;

import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoRespostaWrapper;
import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoWrapper;

import java.util.List;

public interface PropostaCreditoService {

    List<PropostaCreditoWrapper> listarTodasPropostas();

    PropostaCreditoWrapper buscarPropostaCreditoPorCPF(String cpf);

    PropostaCreditoWrapper cadastrarNovaProposta(PropostaCreditoWrapper propostaCredito);

    PropostaCreditoRespostaWrapper analisarPropostaCredito(PropostaCreditoWrapper propostaCreditoWrapper);

}
