package config; 

public class Principal {

    public static void main(String[] args) {
        
        // Como 'Conexion' y 'Principal' están en la misma carpeta (config),
        // NO hace falta hacer "import". Se saludan directamente.
        
        Conexion miConexion = new Conexion();
        miConexion.getConexion();
        
    }
}