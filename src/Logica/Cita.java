package Logica;

public class Cita {
    
    private int numero_cita;
    private String id_paciente;
    private String fecha;
    private String hora;
    private String id_empleado;
    private String precio;
    
    public Cita(){
        
        numero_cita = 0;
        id_paciente = "";
        fecha = "";
        hora = "";
        id_empleado = "";
        precio = "";
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }
    
    /**
     * @return the numero_cita
     */
    public int getNumero_cita() {
        return numero_cita;
    }

    /**
     * @param numero_cita the numero_cita to set
     */
    public void setNumero_cita(int numero_cita) {
        this.numero_cita = numero_cita;
    }

    /**
     * @return the id_paciente
     */
    public String getId_paciente() {
        return id_paciente;
    }

    /**
     * @param id_paciente the id_paciente to set
     */
    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the id_empleado
     */
    public String getId_empleado() {
        return id_empleado;
    }

    /**
     * @param id_empleado the id_empleado to set
     */
    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }
}
