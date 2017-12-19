package Controladores;
import DAO.*;

public class ControladorRegistros_Causas {

    DaoRegistros_Causas daoRegistros_Causas;
    
    public ControladorRegistros_Causas(){
        
        daoRegistros_Causas = new DaoRegistros_Causas();
    }
    
    public int insertarCausa(int registro, int causa) {
        
        return daoRegistros_Causas.insertarCausa(registro, causa);
    }    
}
