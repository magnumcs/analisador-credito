package com.portifolio.magnum.cadastropropostaapi.domain.wrapper;

import com.portifolio.magnum.cadastropropostaapi.Model.PropostaCredito;
import com.portifolio.magnum.cadastropropostaapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.cadastropropostaapi.domain.EstadoEnum;
import com.portifolio.magnum.cadastropropostaapi.domain.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropostaCreditoRespostaWrapper implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private Integer idade;
    private GeneroEnum genero;
    private EstadoCivilEnum estadoCivil;
    private EstadoEnum estado;
    private Integer dependentes;
    private Double renda;
    private String respostaProposta;
    private String detalheResposta;

    public PropostaCreditoRespostaWrapper(PropostaCredito propostaCredito) {
        this.id = propostaCredito.getId();
        this.nome = propostaCredito.getNome();
        this.nome = propostaCredito.getCpf();
        this.idade = propostaCredito.getIdade();
        this.genero = propostaCredito.getGenero();
        this.estadoCivil = propostaCredito.getEstadoCivil();
        this.estado = propostaCredito.getEstado();
        this.dependentes = propostaCredito.getDependentes();
        this.renda = propostaCredito.getRenda();
        this.respostaProposta = propostaCredito.getRespostaProposta();
        this.detalheResposta = propostaCredito.getDetalheResposta();
    }
}
