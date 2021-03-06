package Conexion;

import java.sql.*;

public class Conexiones {
    
    String url, usuario, password;
    Connection conexion = null;
    
    public Conexiones(){
    
        url = "jdbc:postgresql://localhost:5432/ProyectoClinica";
        usuario = "postgres";
        password = "1522589";
    }
    
    public Connection conectar(){
        
        try {
            // Se carga el driver.
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Cargado.");
        } catch(ClassNotFoundException e){
                
            System.out.println("No se pudo cargar el driver.");
        }

        try{
            // Crear el objeto de conexion a la base de datos.
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion Abierta.");
            return conexion;
            // Crear objeto Statement para realizar queries a la base de datos.
        } catch(SQLException e){
        
            System.out.println("No se pudo abrir la bd. Error: " + e);
            return null;
        }
    }

    public Connection getConnetion(){
    
        if (conexion == null) {
        
            return this.conectar();
        }
        
        else{
        
            return conexion;      
        }
    }
        
    public void closeConection(Connection c){
    
        try{

            if (conexion != null){
            
                c.close();
            }
        } catch(SQLException e){
            
                System.out.println("No se pudo cerrar. Error: " + e);
        }
    }
}
