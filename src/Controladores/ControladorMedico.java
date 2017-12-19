package Controladores;
import DAO.*;
import Logica.*;
import java.util.ArrayList;

public class ControladorMedico {
    
    DaoMedico daoMedico;


    public ControladorMedico(){
        
        daoMedico = new DaoMedico();
    }
    
    public Medico consultarDatosMedico(String user){
        
        Medico medico;
        medico = daoMedico.consultarDatosMedico(user);
        return medico;
    }

    public int insertarMedico(String id_empleado, String id_jefe, String id_area, String nombre_empleado, 
            String direccion, String telefono, int salInt, String email, String car, String numLi, String espe, 
            String uni, String contrasena) {
        
        Medico medico = new Medico();
        medico.setId_empleado(id_empleado);
        medico.setId_jefe(id_jefe);
        medico.setId_area(id_area);
        medico.setNombre_empleado(nombre_empleado);
        medico.setDireccion(direccion);
        medico.setTelefono(telefono);
        medico.setSalario(salInt);
        medico.setEmail(email);
        medico.setCargo(car);
        medico.setNumero_licencia(numLi);
        medico.setEspecialidad(espe);
        medico.setUniversidad(uni);
        medico.setContrasena(contrasena);
                        
        int result = daoMedico.guardarMedico(medico);
        return result;
    }

    public int actualizarMedico(String id_empleado, String id_jefe, String id_area, String nombre_empleado, 
            String direccion, String telefono, String sal, String email, String car, 
            String numLi, String espe, String uni, String contrasena) {
        
        return daoMedico.actualizarMedico(id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono,
        sal, email, car, numLi, espe, uni, contrasena);
    }

    public ArrayList<String> llenarCombo() {
        return daoMedico.llenarCombo();
    }        
}
