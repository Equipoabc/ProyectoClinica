package Controladores;

import DAO.DaoArea;
import Logica.Area;


public class ControladorArea {
    
    DaoArea daoArea;
    
    public ControladorArea(){
        daoArea = new DaoArea();
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

    public int actualizarArea(String codigoConsulta, String nom, String cod, String des) {
        return daoArea.actualizarArea(codigoConsulta, nom, cod, des);
    }

    public Area consultarDatosArea(String cod_area) {
        return daoArea.consultarDatosArea(cod_area);
    }
    
    
    
    
    
    
}
