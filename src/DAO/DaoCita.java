package DAO;
import Conexion.Conexiones;
import Logica.*;
import java.sql.*;

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
    
}
