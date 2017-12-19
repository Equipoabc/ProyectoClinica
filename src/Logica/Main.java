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
        GUI_FormulaMedica interfaz = new GUI_FormulaMedica();
        interfaz.setIdMedico("1");
        interfaz.setRegistro(1);
        interfaz.setNombrePaciente("Juan");
        interfaz.setVisible(true);
    }
}
