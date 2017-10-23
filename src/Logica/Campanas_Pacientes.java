/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Iván
 */
public class Campanas_Pacientes {
    
    private String id_paciente;
    private String codigo_campana;
    
    public Campanas_Pacientes(){
        
        id_paciente = "";
        codigo_campana = "";
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
     * @return the codigo_campana
     */
    public String getCodigo_campana() {
        return codigo_campana;
    }

    /**
     * @param codigo_campana the codigo_campana to set
     */
    public void setCodigo_campana(String codigo_campana) {
        this.codigo_campana = codigo_campana;
    }
}
