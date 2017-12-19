/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.DaoPacientes_Camas;
import Logica.Pacientes_Camas;

/**
 *
 * @author Iván
 */
public class ControladorPacientes_Camas {
    
    DaoPacientes_Camas daoPacientes_Camas;
    
    public ControladorPacientes_Camas(){
        
        daoPacientes_Camas = new DaoPacientes_Camas();
    }
    public Pacientes_Camas consultarAsignacion(String cedulaBusqueda) {
        
        return daoPacientes_Camas.consultarAsignacion(cedulaBusqueda);
    }   
  /*  public Pacientes_Camas asignarCama(String cedula, String numeroCama) {
        
        return daoPacientes_Camas.asignarCama(cedula, numeroCama);
    } */    
}
