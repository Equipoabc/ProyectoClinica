package Controladores;
import DAO.*;

public class ControladorFormula_medica {

    DaoFormula_medica daoFormula_medica;
    
    public ControladorFormula_medica(){
        
        daoFormula_medica = new DaoFormula_medica();
    }
    
    public int crearFormulaMedica(String idMedico, int registro) {
        
        return daoFormula_medica.crearFormulaMedica(idMedico, registro);
    }    
}
