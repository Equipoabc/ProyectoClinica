package Controladores;
import DAO.*;
import Logica.*;

public class ControladorOperador {
    
    DaoOperador daoOperador;
    
    public ControladorOperador(){
        
        daoOperador = new DaoOperador();
    }
    
    public Operador loginOperador(String user){
        
        Operador operador;
        operador = daoOperador.loginOperador(user);
        return operador;
    }
    
    public int actualizarContrasena(String cedula, String contrasena) {
        return daoOperador.actualizarContrasena(cedula, contrasena);
    }
    
}