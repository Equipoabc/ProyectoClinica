/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.DaoCama;
import Logica.Cama;
import java.util.ArrayList;

/**
 *
 * @author Iván
 */
public class ControladorCama {
    
    DaoCama daoCama;
    
    public ControladorCama(){
       daoCama = new DaoCama();
      
    }
    public int  insertarCama(String numeroCama,String area,String  descripcion,String estado){

        Cama cama = new Cama();
        cama.setNumero_cama(numeroCama);
        cama.setId_area(area);
        cama.setDescripcion(descripcion);
        cama.setEstado(estado);        
        
        int result = daoCama.guardarCama(cama);
        return result;
    }
       

    
}
