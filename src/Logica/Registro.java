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
public class Registro {
    
    private String numero_registro;
    private String numero_historia;
    private Date fecha_consulta;
    private String hora;
    private int precio;
    private String id_empleado;
    
    public Registro(){
        
        numero_registro = "";
        numero_historia = "";
        fecha_consulta = null;
        hora = "";
        precio = 0;
        id_empleado = ""; 
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
     * @return the fecha_consulta
     */
    public Date getFecha_consulta() {
        return fecha_consulta;
    }

    /**
     * @param fecha_consulta the fecha_consulta to set
     */
    public void setFecha_consulta(Date fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
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
