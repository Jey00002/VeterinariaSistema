
package modelo;
public class Cita {
    
    private int id_cita;       
    private String fecha_hora; 
    private String motivo;
    private String estado;
    private int id_mascota;
    private int id_servicio;
    //==========================================================================

    public Cita() {
    }

    public Cita(int id_cita, String fecha_hora, String motivo, String estado, int id_mascota, int id_servicio) {
        this.id_cita = id_cita;
        this.fecha_hora = fecha_hora;
        this.motivo = motivo;
        this.estado = estado;
        this.id_mascota = id_mascota;
        this.id_servicio = id_servicio;
    }
    //==========================================================================

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    @Override
    public String toString() {
        return "Cita: " + fecha_hora + " - " + estado;
    }

    

}
