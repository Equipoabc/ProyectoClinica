/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.DaoMedicamento;
import Logica.Medicamento;
import java.util.ArrayList;

/**
 *
 * @author Iván
 */
public class ControladorMedicamento {
    
    DaoMedicamento daoMedicamento;
    
    public ControladorMedicamento(){
       daoMedicamento = new DaoMedicamento();
      
    }    
    
    public int  insertarMedicamento(String codigo, String nombre, String descripcion, int costo){

        Medicamento medicamento = new Medicamento();
        medicamento.setCodigo_medicamento(codigo);
        medicamento.setNombre_medicamento(nombre);
        medicamento.setDescripcion(descripcion);
        medicamento.setCosto(costo);      
        
        int result = daoMedicamento.guardarMedicamento(medicamento);
        return result;
    }
    
    public ArrayList<String> llenarMedicamentos() {
        return daoMedicamento.llenarMedicamentos();
    }
    


}
