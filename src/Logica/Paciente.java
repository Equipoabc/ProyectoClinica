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
public class Paciente {
    
    private String id_paciente;
    private String nombre_paciente;
    private String direccion;
    private String telefono;
    private String numero_seguro; 
    private String actividad_economica;
    private Date fecha_nacimiento;
    
    public Paciente(){
        
        id_paciente = "";
        nombre_paciente = "";
        direccion = "";
        telefono = "";
        numero_seguro = "";
        actividad_economica = "";
        fecha_nacimiento = null;
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
     * @return the nombre_paciente
     */
    public String getNombre_paciente() {
        return nombre_paciente;
    }

    /**
     * @param nombre_paciente the nombre_paciente to set
     */
    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the numero_seguro
     */
    public String getNumero_seguro() {
        return numero_seguro;
    }

    /**
     * @param numero_seguro the numero_seguro to set
     */
    public void setNumero_seguro(String numero_seguro) {
        this.numero_seguro = numero_seguro;
    }

    /**
     * @return the actividad_economica
     */
    public String getActividad_economica() {
        return actividad_economica;
    }

    /**
     * @param actividad_economica the actividad_economica to set
     */
    public void setActividad_economica(String actividad_economica) {
        this.actividad_economica = actividad_economica;
    }

    /**
     * @return the fecha_nacimiento
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
}
