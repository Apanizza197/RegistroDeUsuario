package com.example.registroUsuario;

import javax.persistence.*;

@Entity
@Table
public class Usuario {
    @Id
    private Long id;
    @Column (name= "nombre")
    private String nombre;
    @Column
    private String direc;
    @Column (name = "telefono", unique = true)
    private String telefono;

    public Usuario(String nombre, String direc, String telefono) {
        this.id = 1L;
        this.nombre = nombre;
        this.direc = direc;
        this.telefono = telefono;
    }

    public Usuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
