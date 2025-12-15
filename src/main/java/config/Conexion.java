
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion() {
        try {
            // Intenta conectar directamente. Si funciona, imprime el mensaje.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria_bd", "root", "1234");
            System.out.println("¡CONEXIÓN EXITOSA!");
            return con;
        } catch (SQLException e) {
            // Si falla, imprime el error
            System.out.println("Error: " + e);
            return null;
        }
    }
}