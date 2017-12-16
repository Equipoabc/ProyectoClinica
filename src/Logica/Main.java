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
        GUI_ModificarPaciente interfaz = new GUI_ModificarPaciente();
        interfaz.setVisible(true);
    }
}
