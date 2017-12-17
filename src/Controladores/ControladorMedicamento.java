/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.DaoMedicamento;
import Logica.Medicamento;

/**
 *
 * @author Iván
 */
public class ControladorMedicamento {
    
    DaoMedicamento daoMedicamento ;
    
    public ControladorMedicamento(){
        daoMedicamento = new DaoMedicamento();
    }

    public int insertarMedicamento(String cod, String nom, String des, String pCosto) {
        
        Medicamento medicamento = new Medicamento();
        
        medicamento.setCodigo_medicamento(cod);
        medicamento.setNombre_medicamento(nom);
        medicamento.setCosto(Integer.parseInt(pCosto));
        medicamento.setDescripcion(des);
        
        return daoMedicamento.guardarMedicamento(medicamento);
    }

    public int comprobar(String codigoConsulta) {
        
        return daoMedicamento.comprobar(codigoConsulta);
 
    }

    public int actualizarMedicamento(String codigoConsulta, String nom, String cod, String des, String cos) {
       return daoMedicamento.actualizarMedicamento(codigoConsulta, nom, cod, des, cos);
    }

    public Medicamento consultarDatosMedicamento(String cod_med) {
        return daoMedicamento.consultarDatosMedicamento(cod_med);
    }
    
}
