/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexiones;
import Logica.Cama;
import Logica.Main;
import Logica.Pacientes_Camas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Iván
 */
public class DaoPacientes_Camas {
    
    Conexiones conexion;
    
    public DaoPacientes_Camas(){
        
        conexion = Main.conexion;
    }
    
    
    public Pacientes_Camas consultarAsignacion(String id_paciente) {
        String sql, validar;
        Pacientes_Camas pc = new Pacientes_Camas();
        
        validar = "SELECT numero_cama FROM Pacientes_Camas WHERE id_paciente = '" + id_paciente + "';";
        sql = "SELECT numero_cama "
                + "FROM Pacientes_Camas WHERE id_paciente = '" + id_paciente + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(id_paciente)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {                    
                    pc.setId_paciente(id_paciente);
                    pc.setNumero_cama(consulta2.getString(1));
                }
                
                return pc;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }

    public int asignarCama(String cedula, String numeroCama){
       /* 
        String sql_guardar, validar;
        int numFilas;
        
        validar = "SELECT numero_cama FROM Camas WHERE numero_cama = '" + cama.getNumero_cama() + "';";
        sql_guardar = "INSERT INTO Pacientes_Camas (id_paciente, numero_cama, fecha_asignacion) VALUES ('" 
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
        */
        return -1;
    }    
}
