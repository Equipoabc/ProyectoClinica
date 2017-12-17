package Controladores;
import DAO.DaoArea;
import java.util.ArrayList;


public class ControladorArea {
    DaoArea daoArea = new DaoArea();

    public ArrayList<String> llenarCombo() {
        return daoArea.llenarCombo();
    }

    public String seleccionArea(String id_area) {
        return daoArea.seleccionArea(id_area);
    }
    
}
