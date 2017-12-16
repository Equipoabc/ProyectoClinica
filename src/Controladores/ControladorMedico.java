package Controladores;
import DAO.*;
import Logica.*;

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
}
