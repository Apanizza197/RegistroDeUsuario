package com.example.registroUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service  //llamamos meteodos que ya estan implementados en el Repository
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    @Override
    public Usuario save(Usuario usuario) throws Exception {
        return usuarioRepository.save(usuario);
    }
}
