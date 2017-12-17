package Controladores;
import DAO.DaoEnfermera;
import Logica.Enfermera;


public class ControladorEnfermera {
    DaoEnfermera daoEnfermera;
    
    public ControladorEnfermera(){
        daoEnfermera = new DaoEnfermera();
    }

    public int insertarEnfermera(String id_empleado, String id_jefe, String id_area, String nombre_empleado, 
            String direccion, String telefono, int sal, String email, String car, int anos) {
        
        Enfermera enfermera = new Enfermera();
        enfermera.setId_empleado(id_empleado);
        enfermera.setId_jefe(id_jefe);
        enfermera.setId_area(id_area);
        enfermera.setNombre_empleado(nombre_empleado);
        enfermera.setDireccion(direccion);
        enfermera.setTelefono(telefono);
        enfermera.setSalario(sal);
        enfermera.setEmail(email);
        enfermera.setCargo(car);
        enfermera.setAnos_experiencia(anos);
        int result = daoEnfermera.guardarEnfermera(enfermera);
        return result;
    }

    public Enfermera consultarDatosEnfermera(String cedulaConsulta) {
        Enfermera enfermera;
        enfermera = daoEnfermera.consultarDatosEnfermera(cedulaConsulta);
        return enfermera;
        
    }

    public int actualizarEnfermera(String id_empleado, String id_jefe, String id_area, String nombre_empleado,
            String direccion, String telefono, String sal, String email, String car, String an) {
        return daoEnfermera.actualizarEnfermera(id_empleado, id_jefe, id_area, nombre_empleado, direccion, telefono,
        sal, email, car, an);
    }
    
    
    
}
