/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexiones;
import Logica.Main;
import Logica.Cama;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Iván
 */
public class DaoCama {
    
    Conexiones conexion;
    
    public DaoCama(){
        
        conexion = Main.conexion;
    }
    
    public int guardarCama(Cama cama){
        
        String sql_guardar, validar;
        int numFilas;
        
        validar = "SELECT numero_cama FROM Camas WHERE numero_cama = '" + cama.getNumero_cama() + "';";
        sql_guardar = "INSERT INTO Camas (numero_cama, descripcion, estado, id_area) VALUES ('" 
                + cama.getNumero_cama() + "', '" +
                cama.getDescripcion() +  "', '" + cama.getEstado() +  "', '" +
                cama.getId_area()  +  "')" ;
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(cama.getNumero_cama())){
                
                return 2;
            }            
            else {                
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }  

    
}
