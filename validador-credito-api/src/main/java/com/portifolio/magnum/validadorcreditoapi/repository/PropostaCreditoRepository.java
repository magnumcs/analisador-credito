package com.portifolio.magnum.validadorcreditoapi.repository;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaCreditoRepository extends JpaRepository<PropostaCredito, Integer> {
}
