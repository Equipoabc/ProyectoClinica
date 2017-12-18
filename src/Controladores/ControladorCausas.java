package Controladores;
import DAO.*;

public class ControladorCausas {

    DaoCausa daoCausa;
    
    public ControladorCausas(){
        
        daoCausa = new DaoCausa();
    }
    public int registrarCausa(String descripcion, String nombre) {
        
        return daoCausa.registrarCausa(nombre, descripcion);
    }   
}
