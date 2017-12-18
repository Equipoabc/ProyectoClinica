package DAO;
import Conexion.Conexiones;
import Logica.*;
import java.sql.*;
import java.util.ArrayList;

public class DaoCita {
    
    private Conexiones conexion;

    public DaoCita() {
        conexion = Main.conexion;
    }
    
    public int insertarCita(Cita cita) {
        String sql_guardar, sql_validar, validar, validarPaciente, validarMedico, fechaValida;
        fechaValida = cita.getFecha().replace("/", "-");
        validar = "";
        sql_validar = "SELECT id_empleado FROM citas WHERE hora = '" + cita.getHora() + "' and fecha = '" + fechaValida + "';";
        int numFilas;
        validarMedico = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + cita.getId_empleado() + "';";
        validarPaciente = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cita.getId_paciente() + "';";
        sql_guardar = "INSERT INTO citas (id_paciente, id_empleado, fecha, hora, precio) VALUES ('" 
                + cita.getId_paciente() + "', '" + cita.getId_empleado() +  "', '" + cita.getFecha() +  "', '" +
               cita.getHora() +  "', '" + cita.getPrecio()+ "');" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql_validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            ResultSet consulta2 = sentencia.executeQuery(validarMedico);
            
            while(consulta2.next()){
                
                validarMedico = consulta2.getString(1);
            }
            
            ResultSet consulta3 = sentencia.executeQuery(validarPaciente);
            
            while(consulta3.next()){
                
                validarPaciente = consulta3.getString(1);
            }
            
            if(validar.equals(cita.getId_empleado())){
                
                return 2;
            }
            else if(!validarMedico.equals(cita.getId_empleado())){
                
                return 3;
            }
            else if(!validarPaciente.equals(cita.getId_paciente())){
                
                return 4;
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

    public ArrayList<String> llenarCombo(String id) {
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT to_char (fecha, 'YYYY/MM/DD'), to_char (hora, 'HH24:MI') FROM citas WHERE id_paciente = '" + id + "';";
        
        try {
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                lista.add(consulta.getString(1)+" "+consulta.getString(2));
            }
            
            } catch(SQLException e){
        
        
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return lista;
    }

    public Cita consultarDatosCita(String id_paciente, String fechaN, String horaN) {
        String sql = "";
        sql = "SELECT id_paciente, id_empleado, to_char (fecha, 'YYYY/MM/DD'), to_char (hora, 'HH24:MI'), precio FROM citas WHERE id_paciente = '" + id_paciente +
                "' and fecha = '" + fechaN + "' and hora = '" + horaN + "';";
        Cita cita = new Cita();
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            while (consulta.next()) {
                
                cita.setId_paciente(consulta.getString(1));
                cita.setId_empleado(consulta.getString(2));
                cita.setFecha(consulta.getString(3));
                cita.setHora(consulta.getString(4));
                cita.setPrecio(consulta.getString(5));
            }
            return cita;
            
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return null;
        }

    public int actualizarCita(String id_paciente, String id_empleadoS, String precioS, String fechaS, String horario, String fechaVieja, String horaVieja) {
        String sql_guardar, sql_validar, validar, validarMedico, aux1, aux2, aux3;
        validar = "";
        aux1 = "";
        aux2 = "";
        aux3 = "";
        sql_validar = "SELECT id_empleado, id_paciente, hora, fecha FROM citas WHERE id_paciente = '" + id_paciente + "' and hora = '" + horario + "' and fecha = '" + fechaS + "';";
        int numFilas;
        validarMedico = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + id_empleadoS + "';";
        sql_guardar = "UPDATE citas SET id_empleado = '" + id_empleadoS + "', precio = '" + precioS + "', fecha = '"
            + fechaS + "', hora = '" + horario + "' WHERE id_paciente = '" + id_paciente + "' and fecha = '"+ fechaVieja + "' and hora = '" 
                + horaVieja + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql_validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
                aux1 = consulta.getString(2);
                aux2 = consulta.getString(3);
                aux3 = consulta.getString(4);
            }
            ResultSet consulta2 = sentencia.executeQuery(validarMedico);
            
            while(consulta2.next()){
                
                validarMedico = consulta2.getString(1);
            }
            if(validar.equals(id_empleadoS) && ! aux1.equals(id_paciente) && ! aux2.equals(horario) && ! aux3.equals(fechaS)){
                
                return 2;
            }
            else if(!validarMedico.equals(id_empleadoS)){
                
                return 3;
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

    public int validarPacienteCitas(String id_paciente) {
        String validar;
        validar = "SELECT DISTINCT id_paciente FROM citas WHERE id_paciente = '" + id_paciente + "';";
         try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(id_paciente)){
                return 1;
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return 0;
    }

    public int eliminarCita(String id_paciente, String fechaN, String horaN) {
       String sql;
       sql = "DELETE FROM citas WHERE id_paciente = '" + id_paciente + "' and hora = '" + horaN + "' and fecha = '" + fechaN + "';";
        
        try {
            int numFilas;
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql);
            return numFilas;
        }
        catch (SQLException e) {
            System.out.println("SQL error: " + e);
        }
        catch (Exception e) {
            System.out.println("Error" + e);
        }
        return -1;
    }
    
    
}
