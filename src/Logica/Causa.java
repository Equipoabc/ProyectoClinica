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
public class Causa {
    
    private String codigo_causa;
    private String nombre_causa;
    private String descripcion;
    
    public Causa(){
        
        codigo_causa = "";
        nombre_causa = "";
        descripcion = ""; 
    }

    /**
     * @return the codigo_causa
     */
    public String getCodigo_causa() {
        return codigo_causa;
    }

    /**
     * @param codigo_causa the codigo_causa to set
     */
    public void setCodigo_causa(String codigo_causa) {
        this.codigo_causa = codigo_causa;
    }

    /**
     * @return the nombre_causa
     */
    public String getNombre_causa() {
        return nombre_causa;
    }

    /**
     * @param nombre_causa the nombre_causa to set
     */
    public void setNombre_causa(String nombre_causa) {
        this.nombre_causa = nombre_causa;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
