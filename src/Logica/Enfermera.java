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
public class Enfermera {
     
    private String id_empleado;
    private int anos_experiencia;
    
    public Enfermera(){
        
        id_empleado = "";
        anos_experiencia = 0;
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

    /**
     * @return the anos_experiencia
     */
    public int getAnos_experiencia() {
        return anos_experiencia;
    }

    /**
     * @param anos_experiencia the anos_experiencia to set
     */
    public void setAnos_experiencia(int anos_experiencia) {
        this.anos_experiencia = anos_experiencia;
    } 
}
