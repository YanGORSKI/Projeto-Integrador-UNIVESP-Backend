package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.model.DAO.Crianca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessCriancaRepository extends JpaRepository<Crianca, Long> {
}
