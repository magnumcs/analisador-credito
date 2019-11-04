package com.portifolio.magnum.cadastropropostaapi.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "validador-credito-api", url = "${application.validador-credito-api.url}")
public interface AnalisePropostaCreditoClient {


}
