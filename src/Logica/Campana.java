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
public class Campana {
    
    private String codigo_campana;
    private String nombre_campana;
    private String objetivo;
    private Date fecha_realizacion;
    private String id_empleado;
    
    public Campana(){
        
        codigo_campana = "";
        nombre_campana = "";
        objetivo = "";
        fecha_realizacion = null;
        id_empleado = "";
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

    /**
     * @return the nombre_campana
     */
    public String getNombre_campana() {
        return nombre_campana;
    }

    /**
     * @param nombre_campana the nombre_campana to set
     */
    public void setNombre_campana(String nombre_campana) {
        this.nombre_campana = nombre_campana;
    }

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the fecha_realizacion
     */
    public Date getFecha_realizacion() {
        return fecha_realizacion;
    }

    /**
     * @param fecha_realizacion the fecha_realizacion to set
     */
    public void setFecha_realizacion(Date fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
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
