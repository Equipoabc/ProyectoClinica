package GUI;

import Controladores.*;
import Logica.*;
import Logica.Validaciones;
import java.text.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class GUI_ModificarCita extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorPaciente controladorPaciente;
    ControladorMedico controladorMedico;
    ControladorCita controladorCita;
    Paciente paciente;
    Cita cita;

    public GUI_ModificarCita() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorPaciente = new ControladorPaciente();
        controladorMedico = new ControladorMedico();
        controladorCita = new ControladorCita();
        paciente = new Paciente();
        validaciones = new Validaciones();
        fecha.setMinSelectableDate(GetDateNow());
        fecha.setDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
        botonAceptar.setEnabled(false);
        botonAceptar.setVisible(false);
        medicoLabel.setVisible(false);
        nombreMedicoLabel.setVisible(false);
        botonConsultar.setVisible(false);
        botonEliminar.setVisible(false);
        citaLabel.setVisible(false);
        fecha.setVisible(false);
        fechaLabel.setVisible(false);
        horaLabel.setVisible(false);
        horas.setVisible(false);
        minutos.setVisible(false);
        idMedicoLabel.setVisible(false);
        id_empleado.setVisible(false);
        listaCitas.setVisible(false);
        precio.setVisible(false);
        preciolabel.setVisible(false);
        nombrePacienteLabel.setVisible(false);
        nombreLabel.setVisible(false);

        /**/
        
    }
    
    private Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    public static Date parseFecha(String fecha){ 
        
        fecha = fecha.replace("-","/") ; 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
        Date fechaDate = null; 
        try {
            fechaDate = formato.parse(fecha); 
        } 
        catch (ParseException ex) 
        { 
            System.out.println("Error: " + ex); 
        } 
        return fechaDate; 
    }
    
    public String organizarFecha(String fecha){
        
        String[] arreglo = fecha.split("/");
        return arreglo[2] + "-" + arreglo[1] + "-" + arreglo[0];
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        id_paciente = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        modificarCitaLabel = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        listaCitas = new javax.swing.JComboBox<>();
        botonConsultar = new javax.swing.JButton();
        idMedicoLabel = new javax.swing.JLabel();
        id_empleado = new javax.swing.JTextField();
        minutos = new javax.swing.JComboBox<>();
        horas = new javax.swing.JComboBox<>();
        horaLabel = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        fechaLabel = new javax.swing.JLabel();
        preciolabel = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        desapareceLabel = new javax.swing.JLabel();
        desapareceBoton = new javax.swing.JButton();
        preguntaLabel = new javax.swing.JLabel();
        citaLabel = new javax.swing.JLabel();
        nombrePacienteLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        medicoLabel = new javax.swing.JLabel();
        nombreMedicoLabel = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setFocusPainted(false);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        botonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar);
        botonCancelar.setBounds(390, 370, 190, 80);

        id_paciente.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        id_paciente.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(id_paciente);
        id_paciente.setBounds(290, 220, 150, 25);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        botonAceptar.setBorder(null);
        botonAceptar.setBorderPainted(false);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.setFocusPainted(false);
        botonAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        botonAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(280, 380, 160, 60);

        modificarCitaLabel.setBackground(new java.awt.Color(255, 255, 255));
        modificarCitaLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        modificarCitaLabel.setForeground(new java.awt.Color(255, 255, 255));
        modificarCitaLabel.setText("Modificar Cita");
        jPanel1.add(modificarCitaLabel);
        modificarCitaLabel.setBounds(140, 40, 290, 50);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarMed.png"))); // NOI18N
        botonEliminar.setBorderPainted(false);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPeq.png"))); // NOI18N
        botonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar);
        botonEliminar.setBounds(130, 300, 120, 40);

        listaCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCitasActionPerformed(evt);
            }
        });
        jPanel1.add(listaCitas);
        listaCitas.setBounds(120, 200, 140, 25);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultar.setBorder(null);
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setFocusPainted(false);
        botonConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultar);
        botonConsultar.setBounds(110, 230, 160, 70);

        idMedicoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idMedicoLabel.setText("Id Medico:");
        jPanel1.add(idMedicoLabel);
        idMedicoLabel.setBounds(380, 170, 180, 20);

        id_empleado.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        id_empleado.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(id_empleado);
        id_empleado.setBounds(450, 170, 180, 25);

        minutos.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        minutos.setForeground(new java.awt.Color(102, 102, 255));
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "30", " " }));
        minutos.setFocusable(false);
        jPanel1.add(minutos);
        minutos.setBounds(530, 290, 53, 40);

        horas.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        horas.setForeground(new java.awt.Color(102, 102, 255));
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", " " }));
        horas.setFocusable(false);
        jPanel1.add(horas);
        horas.setBounds(450, 290, 60, 40);

        horaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        horaLabel.setText("Hora:");
        jPanel1.add(horaLabel);
        horaLabel.setBounds(390, 290, 70, 40);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(3471314481000L));
        fecha.setMinSelectableDate(new java.util.Date(-1262282319000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(450, 250, 180, 25);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(390, 250, 170, 20);

        preciolabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        preciolabel.setText("Precio:");
        jPanel1.add(preciolabel);
        preciolabel.setBounds(390, 340, 180, 20);

        precio.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        precio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(precio);
        precio.setBounds(450, 340, 180, 25);

        desapareceLabel.setBackground(new java.awt.Color(255, 255, 255));
        desapareceLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        desapareceLabel.setForeground(new java.awt.Color(108, 101, 247));
        desapareceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desapareceLabel.setText("Continuar");
        jPanel1.add(desapareceLabel);
        desapareceLabel.setBounds(300, 290, 140, 90);

        desapareceBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        desapareceBoton.setBorder(null);
        desapareceBoton.setBorderPainted(false);
        desapareceBoton.setContentAreaFilled(false);
        desapareceBoton.setFocusPainted(false);
        desapareceBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desapareceBotonActionPerformed(evt);
            }
        });
        jPanel1.add(desapareceBoton);
        desapareceBoton.setBounds(290, 280, 160, 110);

        preguntaLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        preguntaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntaLabel.setText("Ingrese el ID del paciente:");
        jPanel1.add(preguntaLabel);
        preguntaLabel.setBounds(0, 160, 750, 30);

        citaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        citaLabel.setText("Seleccione la cita");
        jPanel1.add(citaLabel);
        citaLabel.setBounds(140, 160, 120, 40);

        nombrePacienteLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        nombrePacienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePacienteLabel.setText("Nombre:");
        jPanel1.add(nombrePacienteLabel);
        nombrePacienteLabel.setBounds(70, 130, 100, 30);

        nombreLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(180, 130, 570, 30);

        medicoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        medicoLabel.setText("Medico:");
        jPanel1.add(medicoLabel);
        medicoLabel.setBounds(390, 210, 170, 30);

        nombreMedicoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreMedicoLabel);
        nombreMedicoLabel.setBounds(450, 210, 300, 30);

        fondo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(fondo);
        fondo.setBounds(0, -10, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Operador operador = new GUI_Operador();
        operador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
        
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        String id_empleadoS, fechaS, hora, min, horario, validar, precioS;
        String fechaN, dato, horaN;
        fechaS = "";
        dato = (String) listaCitas.getSelectedItem();
        String[] partes = dato.split(" ");
        fechaN = partes[0];
        horaN = partes[1];
        validar = "";
        
        id_empleadoS = id_empleado.getText();
        try {
            fechaS = new SimpleDateFormat("YYYY/MM/dd").format(fecha.getDate());
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        precioS = precio.getText();
        hora = (String) horas.getSelectedItem();
        min = (String) minutos.getSelectedItem();
        horario = hora + ":" + min;
        
        if (id_empleadoS.equals("") || fechaS.equals("") || precioS.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarNumero(id_empleadoS) || !validaciones.validarNumero(precioS)) {
            JOptionPane.showMessageDialog(null, "Los campos id y precio deben ser números (sin puntos).");
        }
        else {
            if ( id_empleadoS.equals(cita.getId_empleado()) && fechaS.equals(cita.getFecha())
                    && precioS.equals(cita.getPrecio()) && horario.equals(cita.getHora())) {
                JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
            }
            else{
                int numFilas = controladorCita.actualizarCita(cita.getId_paciente(), id_empleadoS, precioS, fechaS,
                        horario, cita.getFecha(), cita.getHora());
                
                switch (numFilas) {
                    case 2:
                        JOptionPane.showMessageDialog(null, "Horario no disponible del medico.");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Cita actualizada exitosamente.");
                        id_empleado.setText(null);
                        precio.setText(null);
                        horas.setSelectedItem("00");
                        minutos.setSelectedItem("00");
                        fecha.setDate(GetDateNow());
                        botonAceptar.setEnabled(false);
                        listaCitas.removeAllItems();
                        nombreMedicoLabel.setText(null);
                        consultarPaciente(cita.getId_paciente());
                        
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El medico no se encuentra registrado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrio un problema al crear la cita.");
                        break;
                }
            }
        }    
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        String fechaN, dato, horaN;
        dato = (String) listaCitas.getSelectedItem();
        String[] partes = dato.split(" ");
        fechaN = partes[0];
        horaN = partes[1];
        cita = controladorCita.consultarDatosCita(paciente.getId_paciente(), fechaN, horaN);
        int opcion = 5;
        opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar esta cita?", "Confirmar eliminación", JOptionPane.OK_CANCEL_OPTION);
        if(opcion == 0){
                    
                    int numFilas = controladorCita.eliminarCita(cita.getId_paciente(), fechaN, horaN);
                    
                    if (numFilas == 1){
                        
                        JOptionPane.showMessageDialog(null, "La cita ha sido cancelada.");
                        id_empleado.setText(null);
                        precio.setText(null);
                        horas.setSelectedItem("00");
                        minutos.setSelectedItem("00");
                        fecha.setDate(GetDateNow());
                        botonAceptar.setEnabled(false);
                        listaCitas.removeAllItems();
                        nombreMedicoLabel.setText(null);
                        consultarPaciente(cita.getId_paciente());
                        int validarInt = 0;
                        validarInt = controladorCita.validarPacienteCitas(paciente.getId_paciente());
                        if(validarInt == 0){
                            JOptionPane.showMessageDialog(null, "El paciente ya no tiene más citas programadas.");
                            GUI_Operador operador = new GUI_Operador();
                            operador.setVisible(true);
                            this.dispose();
                        }
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null, "Ocurrió un error al cancelar la cita.");
                    }
                }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void listaCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCitasActionPerformed
        
    }//GEN-LAST:event_listaCitasActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        String fechaN, dato, horaN;
        dato = (String) listaCitas.getSelectedItem();
        String[] partes = dato.split(" ");
        fechaN = partes[0];
        horaN = partes[1];
        
        cita = controladorCita.consultarDatosCita(paciente.getId_paciente(), fechaN, horaN);
        id_empleado.setText(cita.getId_empleado());
        precio.setText(cita.getPrecio());
        fecha.setDate(parseFecha(cita.getFecha()));
        String[] partes2 = horaN.split(":");
        horas.setSelectedItem(partes2[0]);
        minutos.setSelectedItem(partes2[1]);
        botonAceptar.setEnabled(true);
        Medico medico = new Medico();
        medico = controladorMedico.consultarDatosMedico(cita.getId_empleado());
        nombreMedicoLabel.setText(medico.getNombre_empleado());
        
        
    }//GEN-LAST:event_botonConsultarActionPerformed

    public void consultarPaciente(String id){
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorCita.llenarCombo(id);
        nombreLabel.setText(paciente.getNombre_paciente());
        
        for(int i=0; i < lista.size(); i++){
            listaCitas.addItem(lista.get(i));
        }
        
        
    }
    
    private void desapareceBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desapareceBotonActionPerformed
        
        String cedulaConsulta = id_paciente.getText();
        paciente = controladorPaciente.consultarDatosPaciente(cedulaConsulta);
        
        
        if (cedulaConsulta.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
            
        } else if (!validaciones.validarNumero(cedulaConsulta)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
            
        } else {
            if(paciente != null){
                
                int validar = 0;
                validar = controladorCita.validarPacienteCitas(paciente.getId_paciente());
                
                if(validar == 1){
                consultarPaciente(cedulaConsulta);
                desapareceLabel.setVisible(false);
                desapareceBoton.setVisible(false);
                preguntaLabel.setVisible(false);
                id_paciente.setVisible(false);
                botonAceptar.setVisible(true);
                botonConsultar.setVisible(true);
                botonEliminar.setVisible(true);
                citaLabel.setVisible(true);
                medicoLabel.setVisible(true);
                nombreMedicoLabel.setVisible(true);
                fecha.setVisible(true);
                fechaLabel.setVisible(true);
                nombrePacienteLabel.setVisible(true);
                nombreLabel.setVisible(true);
                horaLabel.setVisible(true);
                horas.setVisible(true);
                minutos.setVisible(true);
                idMedicoLabel.setVisible(true);
                id_empleado.setVisible(true);
                listaCitas.setVisible(true);
                precio.setVisible(true);
                preciolabel.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El paciente no tiene ninguna cita programada.");
                    
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado.");
            }
            
            
        }
        
        
    }//GEN-LAST:event_desapareceBotonActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI_ModificarCita().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel citaLabel;
    private javax.swing.JButton desapareceBoton;
    private javax.swing.JLabel desapareceLabel;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel idMedicoLabel;
    private javax.swing.JTextField id_empleado;
    private javax.swing.JTextField id_paciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaCitas;
    private javax.swing.JLabel medicoLabel;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JLabel modificarCitaLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreMedicoLabel;
    private javax.swing.JLabel nombrePacienteLabel;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel preciolabel;
    private javax.swing.JLabel preguntaLabel;
    // End of variables declaration//GEN-END:variables
}