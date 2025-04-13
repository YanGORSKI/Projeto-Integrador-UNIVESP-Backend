package com.univesp.sistemainternoadra.controllers.login;

import com.univesp.sistemainternoadra.model.DAO.usuarios.Usuario;
import com.univesp.sistemainternoadra.model.DTO.usuarios.LoginRequest;
import com.univesp.sistemainternoadra.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public Usuario login(@RequestBody LoginRequest request) {
        Optional<Usuario> usuarioEncontrado = usuarioService.login(request.email, request.senha);
        return usuarioEncontrado.orElse(null); // retorna null caso não encontre
    }

    @PostMapping("/cadastrar")
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }
}
