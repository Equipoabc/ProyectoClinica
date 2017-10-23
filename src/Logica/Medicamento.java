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
public class Medicamento {
    
    private String codigo_medicamento;
    private String nombre_medicamento;
    private int costo;
    private String descripcion;
    
    public Medicamento(){
        
        codigo_medicamento = "";
        nombre_medicamento = "";
        costo = 0;
        descripcion = "";
    }

    /**
     * @return the codigo_medicamento
     */
    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    /**
     * @param codigo_medicamento the codigo_medicamento to set
     */
    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    /**
     * @return the nombre_medicamento
     */
    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    /**
     * @param nombre_medicamento the nombre_medicamento to set
     */
    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
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
