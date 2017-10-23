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
public class Formulas_medicas_Medicamentos { 
    
    private String codigo_formula;
    private String id_empleado;
    private String codigo_medicamento;
    
    public Formulas_medicas_Medicamentos(){
        
        codigo_formula = "";
        id_empleado = "";
        codigo_medicamento = "";
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
}
