package com.portifolio.magnum.cadastropropostaapi.service.Imp;

import com.portifolio.magnum.cadastropropostaapi.Model.PropostaCredito;
import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoRespostaWrapper;
import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.cadastropropostaapi.exception.NoContentException;
import com.portifolio.magnum.cadastropropostaapi.repository.PropostaCreditoRepository;
import com.portifolio.magnum.cadastropropostaapi.service.PropostaCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropostaCreditoServiceImp implements PropostaCreditoService {

    private final PropostaCreditoRepository propostaCreditoRepository;

    @Autowired
    public PropostaCreditoServiceImp(PropostaCreditoRepository propostaCreditoRepository) {
        this.propostaCreditoRepository = propostaCreditoRepository;
    }

    @Override
    public List<PropostaCreditoWrapper> listarTodasPropostas() {
        List<PropostaCreditoWrapper> propostaCreditoWrappers = new ArrayList<>();
        List<PropostaCredito> proppostasCredito = propostaCreditoRepository.findAll();
        proppostasCredito.forEach(propostaCredito -> propostaCreditoWrappers.add(new PropostaCreditoWrapper(propostaCredito)));
        return propostaCreditoWrappers;
    }

    @Override
    public PropostaCreditoWrapper buscarPropostaCreditoPorCPF(String cpf) {
        Optional<PropostaCredito> propostaCredito = propostaCreditoRepository.findByCpf(cpf);
        if(propostaCredito.isPresent()) {
            return new PropostaCreditoWrapper(propostaCredito.get());
        } else {
            throw new NoContentException("Proposta de crédito não encontrada.");
        }
    }

    @Override
    public PropostaCreditoWrapper cadastrarNovaProposta(PropostaCreditoWrapper propostaCreditoWrapper) {
        PropostaCredito propostaCredito = propostaCreditoRepository
                .save(PropostaCredito.builder()
                        .nome(propostaCreditoWrapper.getNome())
                        .cpf(propostaCreditoWrapper.getCpf())
                        .idade(propostaCreditoWrapper.getIdade())
                        .genero(propostaCreditoWrapper.getGenero())
                        .estado(propostaCreditoWrapper.getEstado())
                        .estadoCivil(propostaCreditoWrapper.getEstadoCivil())
                        .dependentes(propostaCreditoWrapper.getDependentes())
                        .renda(propostaCreditoWrapper.getRenda())
                        .build()
                );
        return new PropostaCreditoWrapper(propostaCredito);
    }

    @Override
    public PropostaCreditoRespostaWrapper analisarPropostaCredito(PropostaCreditoWrapper propostaCreditoWrapper) {
        return null;
    }
}
