package com.sistemaacademico.dao;

import com.sistemaacademico.conexion.ConexionBD;
import com.sistemaacademico.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario validarLogin(String nombreUsuario, String clave) {
        String sql = """
                     SELECT id_usuario, usuario, clave, id_rol
                     FROM usuarios
                     WHERE usuario = ?
                     AND clave = ?
                     AND estado = TRUE
                     """;

        try (
            Connection conexion = ConexionBD.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(sql)
        ) {
            ps.setString(1, nombreUsuario);
            ps.setString(2, clave);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id_usuario"));
                    usuario.setUsuario(rs.getString("usuario"));
                    usuario.setClave(rs.getString("clave"));
                    usuario.setIdRol(rs.getInt("id_rol"));
                    return usuario;
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al validar login: " + e.getMessage());
        }

        return null;
    }
}
