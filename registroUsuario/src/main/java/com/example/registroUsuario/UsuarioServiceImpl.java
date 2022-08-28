package com.example.registroUsuario;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioService usuarioService;

    @Override
    public Usuario save(Usuario usuario) throws Exception {
        return null;
    }

    @Override
    public void saveUsuario(String nombre, String direc, String telefono) {

    }
}
