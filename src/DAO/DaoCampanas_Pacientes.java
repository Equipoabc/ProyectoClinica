package DAO;
import Conexion.Conexiones;
import Logica.Main;
import java.sql.*;

public class DaoCampanas_Pacientes {
    
    Conexiones conexion;
    
    public DaoCampanas_Pacientes() {
        conexion = Main.conexion;
    }

    public int asignarPaciente(String cedula, String codigoCampana) {
        String sql_guardar, validar;
        validar = "SELECT id_paciente FROM pacientes_campanas WHERE id_paciente = '" + cedula + "' and codigo_campana = '" + codigoCampana + "';";
        sql_guardar = "INSERT INTO pacientes_campanas (id_paciente, codigo_campana) VALUES ('" + cedula + "', '" 
                + codigoCampana+ "');" ;
        int numFilas;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(cedula)){
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
    
}
