
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion() {
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria_bd", "root", "1234");
            System.out.println("¡CONEXIÓN EXITOSA!");
            return con;
        } catch (SQLException e) {
            
            System.out.println("Error: " + e);
            return null;
        }
    }
}
