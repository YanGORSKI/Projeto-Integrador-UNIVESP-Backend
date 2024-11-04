package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessEscolaridade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessEscolaridadeRepository extends JpaRepository<PessEscolaridade, Long> {
}
