package com.portifolio.magnum.cadastropropostaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CadastroPropostaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroPropostaApiApplication.class, args);
	}

}
