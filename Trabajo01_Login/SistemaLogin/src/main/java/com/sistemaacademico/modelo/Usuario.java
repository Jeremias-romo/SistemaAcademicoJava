package com.sistemaacademico.modelo;

public class Usuario {

    private int id;
    private String usuario;
    private String clave;
    private int idRol;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String clave, int idRol) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.idRol = idRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}
