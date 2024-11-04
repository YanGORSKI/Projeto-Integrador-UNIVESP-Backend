package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.model.DAO.pessoas.PessEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessEnderecoRepository extends JpaRepository<PessEndereco, Long> {
}
