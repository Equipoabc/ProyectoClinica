package Controladores;
import DAO.DaoCampanas_Pacientes;


public class ControladorCampanas_Pacientes {
    
    DaoCampanas_Pacientes dao;
    
    public ControladorCampanas_Pacientes(){
        dao = new DaoCampanas_Pacientes();
    }

    public int asignarPaciente(String cedula, String codigoCampana) {
        return dao.asignarPaciente(cedula, codigoCampana);
    }
    
}
