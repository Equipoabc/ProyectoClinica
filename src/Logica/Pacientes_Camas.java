/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Iván
 */
public class Pacientes_Camas {
    
    private String id_paciente;
    private String numero_cama;
    private String fecha_asignacion;
    
    public Pacientes_Camas(){
        
        id_paciente = "";
        numero_cama = "";
        fecha_asignacion = "";
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
     * @return the numero_cama
     */
    public String getNumero_cama() {
        return numero_cama;
    }

    /**
     * @param numero_cama the numero_cama to set
     */
    public void setNumero_cama(String numero_cama) {
        this.numero_cama = numero_cama;
    }

    /**
     * @return the fecha_asignacion
     */
    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    /**
     * @param fecha_asignacion the fecha_asignacion to set
     */
    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }
}
