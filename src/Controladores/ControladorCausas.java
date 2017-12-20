package Controladores;
import DAO.*;
import Logica.Causa;
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

    public Causa consultarDatosCausa(String cod_causa) {
        return daoCausa.consultarDatosCausa(cod_causa);
    }

    public int actualizarCausa(String codigoConsulta, String nom, String des) {
        return daoCausa.actualizarCausa(codigoConsulta, nom, des);
    }

    public int eliminarCausa(String cod_causa) {
        return daoCausa.eliminarCausa(cod_causa);
    }
}
