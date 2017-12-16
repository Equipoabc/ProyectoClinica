package Controladores;
import DAO.*;
import Logica.*;

public class ControladorAdministrador {
    
    DaoAdministrador daoAdministrador;
    
    public ControladorAdministrador(){
        
        daoAdministrador = new DaoAdministrador();
    }
    
    public Administrador loginAdministrador(String user){
        
        Administrador administrador;
        administrador = daoAdministrador.loginAdministrador(user);
        return administrador;
    }
}
