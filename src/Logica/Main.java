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
        //Reportes.crearCarpetas();
        GUI_GastosPaciente interfaz = new GUI_GastosPaciente();
        interfaz.setVisible(true);
    }
}
