package Controladores;
import DAO.*;
import Logica.*;
import java.util.ArrayList;

public class ControladorMedico {
    
    DaoMedico daoMedico;


    public ControladorMedico(){
        
        daoMedico = new DaoMedico();
    }
    
    public Medico consultarDatosMedico(String user){
        
        Medico medico;
        medico = daoMedico.consultarDatosMedico(user);
        return medico;
    }
    public ArrayList<String> llenarCombo() {
        return daoMedico.llenarCombo();
    }        
}
