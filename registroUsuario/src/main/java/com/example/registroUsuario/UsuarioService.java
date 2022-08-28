package com.example.registroUsuario;

import java.util.List;

public interface UsuarioService extends CrudService<Usuario, Long>{
    //List<Usuario> findByNombre(String nombre) throws Exception;
    //List<Usuario> findByDirec(String direc) throws Exception;
    //List<Usuario> findByTelefono(String telefono) throws Exception;
    void saveUsuario(String nombre, String direc, String telefono);
}
