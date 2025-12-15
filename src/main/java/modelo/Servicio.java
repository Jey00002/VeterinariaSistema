
package modelo;
public class Servicio {
    
    private int id_servicio; 
    private String nombre;
    private double precio;
    private String descripcion;
    //==========================================================================

    public Servicio() {
    }

    public Servicio(int id_servicio, String nombre, double precio, String descripcion) {
        this.id_servicio = id_servicio;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    //==========================================================================

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
    
    
    
}
