package DAO;
import Conexion.Conexiones;
import Logica.Main;
import Logica.Paciente;
import java.sql.*;

public class DaoPaciente {

    Conexiones conexion;
    
    public DaoPaciente(){
        
        conexion = Main.conexion;
    }    
    
    public int crearPaciente(String nombre, String cedula, String fechaNacimiento, String telefono, String direc, String numero_seguro, String act_economica) {
        
        String sql_guardar, validar;
        int resultado;
        
        validar = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        sql_guardar = "INSERT INTO Pacientes (nombre_paciente, id_paciente, direccion, telefono, numero_seguro, actividad_economica, fecha_nacimiento) "
                + "VALUES ('" + nombre + "', '" + cedula + "', '" +
                direc + "', '" + telefono +  "', '" +
                numero_seguro +  "', '" + act_economica + "', '" + fechaNacimiento +  "')";
        
        try {            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(cedula)){
                
                return 2;
            }            
            else {
                
                resultado = sentencia.executeUpdate(sql_guardar);
                return resultado;
            }            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }   

    public Paciente consultarDatosPaciente(String cedula) {
       
        String sql, validar;
        Paciente paciente = new Paciente();
        
        validar = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        sql = "SELECT nombre_paciente, actividad_economica, direccion, telefono,"
                + " numero_seguro FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(cedula)){
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    paciente.setNombre_paciente(consulta2.getString(1));
                    paciente.setActividad_economica(consulta2.getString(2));
                    paciente.setDireccion(consulta2.getString(3));
                    paciente.setTelefono(consulta2.getString(4));
                    paciente.setNumero_seguro(consulta2.getString(5));                    
                }
               
                paciente.setId_paciente(validar);
                
                return paciente;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {            
            System.out.println("Error" + e);
        }
        
        return null;
    }

    public int comprobar(String cedula) {
        
        String sql;
        sql = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {

                sql = consulta.getString(1);
            }

            if (sql.equals(cedula)) {

                return 1;
            }
            
            return 0;

        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return 0;
    }

    public int actualizarPaciente(String cedula, String nombre, String telefono, String act, String direccion, 
            String numero) {
        
        String sql_guardar, validar;
        validar = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        sql_guardar = "UPDATE Pacientes SET nombre_paciente = '"
            + nombre + "', direccion = '" + direccion + "', telefono = '"
            + telefono + "', numero_seguro = '" + numero + "', actividad_economica = '"
            + act + "' WHERE id_paciente = '" + cedula + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }
                
            if(!validar.equals(cedula)){
                    
                return 2;
            }
            else {
                    
                int resultado = sentencia.executeUpdate(sql_guardar);
                return resultado;
            }               
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return -1;
    }
}
