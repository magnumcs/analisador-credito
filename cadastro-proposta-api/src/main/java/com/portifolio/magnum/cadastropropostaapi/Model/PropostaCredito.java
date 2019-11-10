package com.portifolio.magnum.cadastropropostaapi.Model;

import com.portifolio.magnum.cadastropropostaapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.cadastropropostaapi.domain.EstadoEnum;
import com.portifolio.magnum.cadastropropostaapi.domain.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "f_PropostaCredito")
public class PropostaCredito {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private Integer idade;
    @Enumerated(EnumType.STRING)
    private GeneroEnum genero;
    @Enumerated(EnumType.STRING)
    private EstadoCivilEnum estadoCivil;
    @Enumerated(EnumType.STRING)
    private EstadoEnum estado;
    private Integer dependentes;
    private Double renda;

    private String respostaProposta;
    private String detalheResposta;

    private Double score;

}
