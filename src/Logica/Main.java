package Logica;
import GUI.*;
import Conexion.*;

public class Main {
    
    public static Conexiones conexion;
    
    public Main(){
        
    }
    
    public static void main(String[] args) {
        
        conexion = new Conexiones();
        conexion.getConnetion();
        GUI_Medico interfaz = new GUI_Medico();
        interfaz.setId("1");
        interfaz.setVisible(true);
    }
}
