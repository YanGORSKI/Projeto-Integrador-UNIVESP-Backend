package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.model.DAO.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
