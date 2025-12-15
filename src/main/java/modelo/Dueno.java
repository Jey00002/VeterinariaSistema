
package modelo;
public class Dueno {
    
    private int id_dueno;  
    private String nombre;
    private String apellidos; 
    private String telefono;
    private String direccion;
    private String correo;
    
    //==========================================================================

    public Dueno() {
    }

    public Dueno(int id_dueno, String nombre, String apellidos, String telefono, String direccion, String correo) {
        this.id_dueno = id_dueno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

   
    //==========================================================================

    public int getId_dueno() {
        return id_dueno;
    }

    public void setId_dueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos; // Ahora mostramos nombre y apellido completo
    }
   
   
    
    
}
