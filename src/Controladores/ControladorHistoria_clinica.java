package Controladores;
import DAO.*;

public class ControladorHistoria_clinica {

    DaoHistoria_clinica daoHistoria_clinica;
    
    public ControladorHistoria_clinica(){
        
        daoHistoria_clinica = new DaoHistoria_clinica();
    }
    
    public String consultarNumero(String cedula) {
        
        return daoHistoria_clinica.consultarNumero(cedula);
    }

    public void crearHistoria(String fecha, String cedula) {
        
        daoHistoria_clinica.crearHistoria(fecha, cedula);
    }
}
