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
        
        validar = "SELECT id_paciente FROM Pacientes_Camas WHERE id_paciente = '" + id_paciente + "';";
        sql = "SELECT numero_cama FROM Pacientes_Camas WHERE id_paciente = '" + id_paciente + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (validar.equals(id_paciente)) {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {                    
                    pc.setId_paciente(id_paciente);
                    pc.setNumero_cama(consulta2.getString(1));
                }
                
                return pc;
            }
            else {
                return null;
                
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }

    public int asignarCama(String cedula, String numeroCama, String fecha, int n){
       
        String sql_guardar, validar, eliminar, sql_ocupar;
        int numFilas;
        
        validar = "SELECT estado FROM camas WHERE numero_cama = '" + numeroCama + "';";
        String buscarCama = "SELECT numero_cama FROM Pacientes_Camas WHERE id_paciente = '" + cedula + "';";
        String validarCamaIgual = "SELECT id_paciente FROM Pacientes_Camas WHERE numero_cama = '" + numeroCama + "';";
        sql_guardar = "INSERT INTO Pacientes_Camas (id_paciente, numero_cama, fecha_asignacion) VALUES ('" 
                + cedula + "', '" + numeroCama +  "', '" + fecha +  "');" ;
        sql_ocupar = "UPDATE camas SET estado = 'Ocupada' WHERE numero_cama = '" +numeroCama+ "';";
        eliminar = "DELETE FROM Pacientes_Camas WHERE id_paciente = '" + cedula + "';";
        
        
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            ResultSet consulta2 = sentencia.executeQuery(validarCamaIgual);
            while(consulta2.next()){
                
                validarCamaIgual = consulta2.getString(1);
            }
            
            ResultSet consulta3 = sentencia.executeQuery(buscarCama);
            while(consulta3.next()){
                
                buscarCama = consulta3.getString(1);
            }
            
            if(validar.equals("Ocupada") && !validarCamaIgual.equals(cedula)){
                
                return 2;
            }
            else if(validar.equals("Ocupada") && validarCamaIgual.equals(cedula)){
                
                return 3;
            }            
            else { 
                if(n == 0){
                numFilas = sentencia.executeUpdate(sql_guardar);
                sentencia.executeUpdate(sql_ocupar);
                return numFilas;
                }
                else if (n == 1){
                    
                    String sql_desocupar = "UPDATE camas SET estado = 'Libre' WHERE numero_cama = '" +buscarCama+ "';";
                    sentencia.executeUpdate(eliminar);
                    numFilas = sentencia.executeUpdate(sql_guardar);
                    sentencia.executeUpdate(sql_ocupar);
                    sentencia.executeUpdate(sql_desocupar);
                return numFilas;
                }
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
}
