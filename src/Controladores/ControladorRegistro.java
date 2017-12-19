package Controladores;
import DAO.*;

public class ControladorRegistro {

    DaoRegistro daoRegistro;
    
    public ControladorRegistro(){
        
        daoRegistro = new DaoRegistro();
    }
    
    public int crearRegistro(String historia, String fech, String hor, String cedula_medico) {
        
        return daoRegistro.crearRegistro(historia, fech, hor, cedula_medico);
    }  
    
    public int consultarRegistro(String historia, String fech, String hor){
        
        return daoRegistro.consultarRegistro(historia, fech, hor);
    }
}
