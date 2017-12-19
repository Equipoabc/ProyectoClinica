/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.DaoFormulas_medicas_Medicamentos;
import java.util.ArrayList;

/**
 *
 * @author Iván
 */
public class ControladorFormulas_medicas_Medicamentos {
    
    DaoFormulas_medicas_Medicamentos daoFormulas_medicas_Medicamentos;
    
    public ControladorFormulas_medicas_Medicamentos(){
       daoFormulas_medicas_Medicamentos = new DaoFormulas_medicas_Medicamentos();
      
    }    
    public int insertarFormula(int formula, String codigo) {
        
        return daoFormulas_medicas_Medicamentos.insertarFormula(formula, codigo);
    }      
}
