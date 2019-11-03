package com.portifolio.magnum.validadorcreditoapi.Model;

import com.portifolio.magnum.validadorcreditoapi.domain.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "f_RespostaCredito")
public class PropostaCredito {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private GeneroEnum genero;
    private EstadoCivilEnum estadoCivil;
    private EstadoEnum estado;
    private Integer dependentes;
    private Double renda;

    private String respostaProposta;
    private String detalheResposta;

    private Double score;

}
