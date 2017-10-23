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
public class Registros_Causas {
    
    private String numero_registro;
    private String numero_historia;
    private String codigo_causa;
    
    public Registros_Causas(){
        
        numero_registro = "";
        numero_historia = "";
        codigo_causa = "";
    } 

    /**
     * @return the numero_registro
     */
    public String getNumero_registro() {
        return numero_registro;
    }

    /**
     * @param numero_registro the numero_registro to set
     */
    public void setNumero_registro(String numero_registro) {
        this.numero_registro = numero_registro;
    }

    /**
     * @return the numero_historia
     */
    public String getNumero_historia() {
        return numero_historia;
    }

    /**
     * @param numero_historia the numero_historia to set
     */
    public void setNumero_historia(String numero_historia) {
        this.numero_historia = numero_historia;
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
}
