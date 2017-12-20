package Controladores;
import DAO.*;
import java.util.ArrayList;
import Logica.*;

public class ControladorArea {
    DaoArea daoArea;

    public ControladorArea(){
        daoArea = new DaoArea();
    }
    
     public ArrayList<String> llenarCombo() {
        return daoArea.llenarCombo();
    }

    public String seleccionArea(String id_area) {
        return daoArea.seleccionArea(id_area);
    }

    public int insertarArea(String cod, String nom, String des, String id) {
        
        Area area = new Area();
        
        area.setId_area(cod);
        area.setNombre_area(nom);
        area.setDescripcion(des);
        int result = daoArea.guardarArea(area);
        return result;
        
    }

    public int comprobar(String codigoConsulta) {
        return daoArea.comprobar(codigoConsulta);
    }

    public int actualizarArea(String codigoConsulta, String nom, String des) {
        return daoArea.actualizarArea(codigoConsulta, nom, des);
    }

    public Area consultarDatosArea(String cod_area) {
        return daoArea.consultarDatosArea(cod_area);
    }

    public int eliminarArea(String cod_area) {
        return daoArea.eliminarArea(cod_area);
    }

    public ArrayList<String> consultarAreas() {
        
        return daoArea.consultarAreas();
    }

}
