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
public class Formula_medica {
    
    private String codigo_formula;
    private String id_empleado;
    
    public Formula_medica(){
        
        codigo_formula = "";
        id_empleado = "";
    }

    /**
     * @return the codigo_formula
     */
    public String getCodigo_formula() {
        return codigo_formula;
    }

    /**
     * @param codigo_formula the codigo_formula to set
     */
    public void setCodigo_formula(String codigo_formula) {
        this.codigo_formula = codigo_formula;
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
