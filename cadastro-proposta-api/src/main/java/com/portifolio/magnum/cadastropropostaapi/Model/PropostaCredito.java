package com.portifolio.magnum.cadastropropostaapi.Model;

import com.portifolio.magnum.cadastropropostaapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.cadastropropostaapi.domain.EstadoEnum;
import com.portifolio.magnum.cadastropropostaapi.domain.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private String cpf;
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
