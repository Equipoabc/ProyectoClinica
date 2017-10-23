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
public class Empleado {
 
    private String id_empleado;
    private String id_jefe;
    private String id_area;
    private String nombre_empleado;
    private String direccion;
    private String telefono;
    private int salario;
    private String email;
    private String cargo;
    
    public Empleado(){
        
        id_empleado = "";
        id_jefe = "";
        id_area = "";
        nombre_empleado = "";
        direccion = "";
        telefono = "";
        salario = 0;
        email = "";
        cargo = "";
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
     * @return the id_jefe
     */
    public String getId_jefe() {
        return id_jefe;
    }

    /**
     * @param id_jefe the id_jefe to set
     */
    public void setId_jefe(String id_jefe) {
        this.id_jefe = id_jefe;
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
     * @return the nombre_empleado
     */
    public String getNombre_empleado() {
        return nombre_empleado;
    }

    /**
     * @param nombre_empleado the nombre_empleado to set
     */
    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
