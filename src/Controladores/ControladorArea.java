package Controladores;

import DAO.DaoArea;
import DAO.DaoCama;
import java.util.ArrayList;


public class ControladorArea {

    DaoArea daoArea;
    
    public ControladorArea(){
       daoArea = new DaoArea();
      
    }    
    public ArrayList<String> llenarCombo() {
        return daoArea.llenarCombo();
    }         
}
