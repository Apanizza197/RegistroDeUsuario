package com.example.registroUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsuarioControllerImpl {

    @Autowired
    private UsuarioService usuarioService;


    //@PostMapping
    //@ResponseBody
    //@GetMapping("/save-student")
    public Usuario save(Usuario usuario) throws Exception {
        return usuarioService.save(usuario);
    }


}
