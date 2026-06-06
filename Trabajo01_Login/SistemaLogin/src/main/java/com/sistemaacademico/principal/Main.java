package com.sistemaacademico.principal;

import com.sistemaacademico.conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.obtenerConexion();

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                conexion.close();
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            System.out.println("Detalle: " + e.getMessage());
        }
    }
}