package com.portifolio.magnum.cadastropropostaapi.repository;

import com.portifolio.magnum.cadastropropostaapi.Model.PropostaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropostaCreditoRepository extends JpaRepository<PropostaCredito, Integer> {

    Optional<PropostaCredito> findByCpf(String cpf);

}
