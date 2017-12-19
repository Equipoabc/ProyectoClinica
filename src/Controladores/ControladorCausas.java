package Controladores;
import DAO.*;
import java.util.ArrayList;

public class ControladorCausas {

    DaoCausa daoCausa;
    
    public ControladorCausas(){
        
        daoCausa = new DaoCausa();
    }
    public int registrarCausa(String descripcion, String nombre) {
        
        return daoCausa.registrarCausa(nombre, descripcion);
    }   

    public ArrayList<String> llenarCausas() {
        
        return daoCausa.llenarCausas();
    }
}
