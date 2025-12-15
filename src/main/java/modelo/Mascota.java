
package modelo;
public class Mascota {

    private int id_mascota;      
    private String nombre;
    private String especie;
    private String raza;
    private String fecha_nacimiento; 
    private int id_dueno;
    //==========================================================================

    public Mascota() {
    }

    public Mascota(int id_mascota, String nombre, String especie, String raza, String fecha_nacimiento, int id_dueno) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.id_dueno = id_dueno;
    }  
    //==========================================================================

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId_dueno() {
        return id_dueno;
    }

    public void setId_dueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    @Override
    public String toString() {
       return nombre + " (" + raza + ")";
    }

    


    
}
