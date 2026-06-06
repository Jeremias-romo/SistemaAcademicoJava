package com.sistemaacademico.principal;

import com.sistemaacademico.dao.UsuarioDAO;
import com.sistemaacademico.modelo.Usuario;

public class Main {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = usuarioDAO.validarLogin("admin", "123456");

        if (usuario != null) {
            System.out.println("Login correcto.");
            System.out.println("Usuario: " + usuario.getUsuario());
            System.out.println("Rol ID: " + usuario.getIdRol());
        } else {
            System.out.println("Usuario o clave incorrectos.");
        }
    }
}