package com.portifolio.magnum.cadastropropostaapi.client;

import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoRespostaWrapper;
import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "validador-credito-api", url = "${application.validador-credito-api.url}")
public interface AnalisePropostaCreditoClient {


    @PostMapping(value = "/proposta")
    PropostaCreditoRespostaWrapper analisarPropostaCredito(@RequestBody PropostaCreditoWrapper propostaCreditoWrapper);

}
