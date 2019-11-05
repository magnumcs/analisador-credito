package com.portifolio.magnum.cadastropropostaapi.service.Imp;

import com.portifolio.magnum.cadastropropostaapi.Model.PropostaCredito;
import com.portifolio.magnum.cadastropropostaapi.client.AnalisePropostaCreditoClient;
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
    private final AnalisePropostaCreditoClient analisePropostaCreditoClient;

    @Autowired
    public PropostaCreditoServiceImp(PropostaCreditoRepository propostaCreditoRepository,
                                     AnalisePropostaCreditoClient analisePropostaCreditoClient) {
        this.propostaCreditoRepository = propostaCreditoRepository;
        this.analisePropostaCreditoClient = analisePropostaCreditoClient;
    }

    @Override
    public List<PropostaCreditoWrapper> listarTodasPropostas() {
        List<PropostaCreditoWrapper> propostaCreditoWrappers = new ArrayList<>();
        List<PropostaCredito> proppostasCredito = propostaCreditoRepository.findAll();
        if(proppostasCredito.isEmpty()) {
            throw new NoContentException("Propostas de crédito não encontradas.");
        }
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
    public PropostaCreditoWrapper cadastrarNovaProposta(PropostaCreditoRespostaWrapper propostaCreditoWrapper) {
        PropostaCredito propostaCredito = propostaCreditoRepository
                .save(PropostaCredito.builder()
                        .id(propostaCreditoWrapper.getId())
                        .nome(propostaCreditoWrapper.getNome())
                        .cpf(propostaCreditoWrapper.getCpf())
                        .idade(propostaCreditoWrapper.getIdade())
                        .genero(propostaCreditoWrapper.getGenero())
                        .estado(propostaCreditoWrapper.getEstado())
                        .estadoCivil(propostaCreditoWrapper.getEstadoCivil())
                        .dependentes(propostaCreditoWrapper.getDependentes())
                        .renda(propostaCreditoWrapper.getRenda())
                        .respostaProposta(propostaCreditoWrapper.getRespostaProposta())
                        .detalheResposta(propostaCreditoWrapper.getDetalheResposta())
                        .score(propostaCreditoWrapper.getScore())
                        .build()
                );
        return new PropostaCreditoWrapper(propostaCredito);
    }

    @Override
    public PropostaCreditoWrapper analisarPropostaCredito(PropostaCreditoWrapper propostaCreditoWrapper) {
        PropostaCreditoRespostaWrapper resposta = analisePropostaCreditoClient.analisarPropostaCredito(propostaCreditoWrapper);
        Optional<PropostaCredito> propostaCredito = propostaCreditoRepository.findByCpf(resposta.getCpf());
        propostaCredito.ifPresent(credito -> resposta.setId(credito.getId()));
        return cadastrarNovaProposta(resposta);
    }
}
