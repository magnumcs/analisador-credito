package com.portifolio.magnum.validadorcreditoapi.domain.wrapper;

import com.portifolio.magnum.validadorcreditoapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.EstadoEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.GeneroEnum;
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

}
