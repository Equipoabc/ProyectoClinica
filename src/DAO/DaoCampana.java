/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexiones;
import Logica.Campana;
import Logica.Main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Iván
 */
public class DaoCampana {
    
    Conexiones conexion;
    
    public DaoCampana(){
        
        conexion = Main.conexion;
    }
    
    public int guardarCampana(Campana campana) {
        
        String sql_guardar, validar;
        validar = "SELECT codigo_campana FROM Campanas WHERE codigo_campana = '" + campana.getCodigo_campana() + "';";
        int numFilas;
        System.out.println(campana.getFecha_realizacion());
        sql_guardar = "INSERT INTO Campanas (codigo_campana, nombre_campana, objetivo, fecha_realizacion, id_empleado) " 
                + "VALUES ('" + campana.getCodigo_campana() + "', '" +
                campana.getNombre_campana() +  "', '" + campana.getObjetivo() +  "', '" +
                campana.getFecha_realizacion() +  "', '" +campana.getId_empleado() + "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(campana.getCodigo_campana())){
                
                return 2;
            }
            
            else {
                
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return -1;
    }    
}
