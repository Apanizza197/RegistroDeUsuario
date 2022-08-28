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
    private UsuarioRepository usuarioRepository;


    public Usuario save(Usuario usuario) throws Exception {
        System.out.println("ok conroller");
        return usuarioRepository.save(usuario);
    }


}
