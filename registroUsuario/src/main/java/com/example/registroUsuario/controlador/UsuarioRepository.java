package com.example.registroUsuario.controlador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    //List<Usuario> findByNombre(String nombre) throws Exception;
    //List<Usuario> findByDirec(String direc) throws Exception;
    //List<Usuario> findByTelefono(String telefono) throws Exception;
}
