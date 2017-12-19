/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.DaoCama;
import DAO.DaoCampana;
import Logica.Cama;
import Logica.Campana;

/**
 *
 * @author Iván
 */
public class ControladorCampana {
    DaoCampana daoCampana;

    
    public ControladorCampana(){
       daoCampana = new DaoCampana();
      
    }
    public int insertarCampana(String nombre, String codigo, String objetivo, String medico, String date){
          
        Campana campana = new Campana();
        campana.setCodigo_campana(codigo);
        campana.setNombre_campana(nombre);
        campana.setObjetivo(objetivo);
        campana.setId_empleado(medico);
        campana.setFecha_realizacion(date);
        
        int result = daoCampana.guardarCampana(campana);
        return result;
    } 
    public Campana consultarDatosCampana(String id_campana) {
        return daoCampana.consultarDatosCampana(id_campana);
    }
    public int comprobar(String codigo) {
        return daoCampana.comprobar(codigo);
    }
    public int actualizarCampana(String codigo, String nombre, String objetivo, String fecha, String medico) {
        return daoCampana.actualizarCampana(codigo, nombre, objetivo, fecha, medico);
    }    
}
