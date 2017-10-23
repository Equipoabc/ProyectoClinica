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
public class Cama {
    
    private String numero_cama;
    private String descripcion;
    private String estado;
    private String id_area;
    
    public Cama(){
        
        numero_cama = "";
        descripcion = "";
        estado = "";
        id_area = "";
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

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
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
}   
