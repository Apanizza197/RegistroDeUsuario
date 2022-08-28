package com.example.registroUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioControllerImpl {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public Usuario save(Usuario usuario) throws Exception {
        return usuarioService.save(usuario);
    }


}
