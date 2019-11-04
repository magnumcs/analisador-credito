package com.portifolio.magnum.validadorcreditoapi.domain.wrapper;

import com.portifolio.magnum.validadorcreditoapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.EstadoEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.GeneroEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropostaCreditoWrapper implements Serializable {

    @ApiModelProperty(hidden = true)
    private Long id;
    @ApiModelProperty(value = "nome", position = 1, required = true)
    private String nome;
    @ApiModelProperty(value = "cpf", position = 1, required = true)
    private String cpf;
    @ApiModelProperty(value = "idade", position = 2, required = true)
    private Integer idade;
    @ApiModelProperty(value = "genero", position = 3, required = true)
    private GeneroEnum genero;
    @ApiModelProperty(value = "estadoCivil", position = 4, required = true)
    private EstadoCivilEnum estadoCivil;
    @ApiModelProperty(value = "estado", position = 5, required = true)
    private EstadoEnum estado;
    @ApiModelProperty(value = "dependentes", position = 6, required = true)
    private Integer dependentes;
    @ApiModelProperty(value = "renda", position = 7, required = true)
    private Double renda;

    @ApiModelProperty(hidden = true)
    private String respostaProposta;
    @ApiModelProperty(hidden = true)
    private String detalheResposta;
    @ApiModelProperty(hidden = true)
    private Double score;

}
