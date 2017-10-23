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
public class Area {
    
    private String id_area;
    private String nombre_area;
    private String descripcion;
    
    public Area(){
        
        id_area = "";
        nombre_area = "";
        descripcion = "";
    }

    /**
     * @return the id_area
     */
    public String getId_area() {
        return id_area;
    }

    /**
     * @param id_area the id_area to set
     */
    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    /**
     * @return the nombre_area
     */
    public String getNombre_area() {
        return nombre_area;
    }

    /**
     * @param nombre_area the nombre_area to set
     */
    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
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
