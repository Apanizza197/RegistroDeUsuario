package com.example.registroUsuario.controlador;

import javax.persistence.*;

@Entity
@Table
public class Usuario {


    @Column (name= "nombre")
    private String nombre;
    @Column
    private String direc;
    @Id
    private String telefono;

    public Usuario(String nombre, String direc, String telefono) {
        this.nombre = nombre;
        this.direc = direc;
        this.telefono = telefono;
    }

    public Usuario() {

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
