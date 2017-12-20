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
        //GUI_Login interfaz = new GUI_Login();
        GUI_HistoriaClinica interfaz = new GUI_HistoriaClinica();
        interfaz.setVisible(true);
    }
}
