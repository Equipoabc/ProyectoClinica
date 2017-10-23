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
public class Historia_clinica {
    
    private int numero_historia;
    private Date fecha_apertura;
    private String id_paciente;
    
    public Historia_clinica(){
        
        numero_historia = 0;
        fecha_apertura = null;
        id_paciente = "";
    }

    /**
     * @return the numero_historia
     */
    public int getNumero_historia() {
        return numero_historia;
    }

    /**
     * @param numero_historia the numero_historia to set
     */
    public void setNumero_historia(int numero_historia) {
        this.numero_historia = numero_historia;
    }

    /**
     * @return the fecha_apertura
     */
    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    /**
     * @param fecha_apertura the fecha_apertura to set
     */
    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
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
}
