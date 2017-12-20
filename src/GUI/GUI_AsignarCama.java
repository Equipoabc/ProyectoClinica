package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.*;
import java.util.*;

public class GUI_AsignarCama extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorPaciente controladorPaciente;
    ControladorCama controladorCama;
    ControladorPacientes_Camas controladorPacientes_Camas;
    String id_participante, nombre_participante;
    Pacientes_Camas pacientesCamas;
    Paciente paciente;
    Cama cama;
    int banderaAceptar;
    DateFormat df = DateFormat.getDateInstance();

    public GUI_AsignarCama(){
        
        initComponents();
        this.setLocationRelativeTo(null);  
        cambioLabelEditar.setVisible(false);
        pacientesCamas = new Pacientes_Camas();
        controladorPaciente = new ControladorPaciente();
        controladorCama = new ControladorCama();
        paciente = new Paciente();
        controladorPacientes_Camas = new ControladorPacientes_Camas();
        validaciones = new Validaciones();
        fechaText.setMaxSelectableDate(GetDateNow());
        fechaText.setDate(GetDateNow());
        fechaText.getDateEditor().setEnabled(false);

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
    
    private static Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        fechaLabel = new javax.swing.JLabel();
        cedulaText = new javax.swing.JTextField();
        cedulaLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        numeroCamaText = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        fechaText = new com.toedter.calendar.JDateChooser();
        precioLabelEditar = new javax.swing.JLabel();
        nombreEventoEditar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cambioLabelEditar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 450));
        setPreferredSize(new java.awt.Dimension(750, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        botonCancelar.setBounds(360, 290, 140, 90);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha de Asignación:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(210, 220, 130, 40);

        cedulaText.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedulaText.setSelectionColor(new java.awt.Color(102, 102, 255));
        cedulaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaTextKeyPressed(evt);
            }
        });
        jPanel1.add(cedulaText);
        cedulaText.setBounds(360, 140, 150, 25);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel.setText("Cédula del Paciente:");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(210, 140, 130, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("No. de Cama:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(210, 180, 110, 30);

        numeroCamaText.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        numeroCamaText.setSelectionColor(new java.awt.Color(102, 102, 255));
        numeroCamaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCamaTextActionPerformed(evt);
            }
        });
        numeroCamaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroCamaTextKeyPressed(evt);
            }
        });
        jPanel1.add(numeroCamaText);
        numeroCamaText.setBounds(360, 180, 150, 25);

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
        botonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonAceptarKeyPressed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(220, 290, 140, 90);

        fechaText.setBackground(new java.awt.Color(255, 255, 255));
        fechaText.setForeground(new java.awt.Color(102, 102, 255));
        fechaText.setFocusable(false);
        fechaText.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fechaText.setMaxSelectableDate(new java.util.Date(1514786508000L));
        fechaText.setMinSelectableDate(new java.util.Date(-1577901492000L));
        fechaText.setRequestFocusEnabled(false);
        fechaText.setVerifyInputWhenFocusTarget(false);
        fechaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaTextKeyPressed(evt);
            }
        });
        jPanel1.add(fechaText);
        fechaText.setBounds(360, 230, 150, 25);

        precioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(precioLabelEditar);
        precioLabelEditar.setBounds(460, 330, 110, 20);

        nombreEventoEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreEventoEditar);
        nombreEventoEditar.setBounds(460, 300, 110, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asignación de Cama");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 300, 50);

        cambioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(cambioLabelEditar);
        cambioLabelEditar.setBounds(460, 390, 150, 20);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, -10, 750, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
         GUI_InterfazCamas operador = new GUI_InterfazCamas();
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void asignarCama(){
       /*
        String cedula,numeroCama,fecha = "", validar = "";         
        cedula = cedulaText.getText();
        numeroCama = numeroCamaText.getText();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            
            fecha = new SimpleDateFormat("dd/MM/YYYY").format(fechaText.getDate());
           
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        // pacientesCamas = controladorPacientes_Camas.consultarDatosEvento(codigoEvento);
        cama = controladorCama.consultarDatosCama(numeroCama);
        paciente = controladorPaciente.consultarDatosPaciente(cedula);
        if (cedula.equals("") || numeroCama.equals("") || fecha.equals("") ) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarNumero(cedula) || !validaciones.validarNumero(numeroCama)) {
            JOptionPane.showMessageDialog(null, "Los campos de cédula y No. cama deben ser numéricos.");
        }
        else if(cama == null){
            JOptionPane.showMessageDialog(null, "La cama con número: "+numeroCama+" no se encuentra registrada.");
        }
        else if(paciente == null){
            JOptionPane.showMessageDialog(null, "El paciente con cédula: "+cedula+" no se encuentra registrado.");
        }
        else if((cama.getEstado()).equals("Ocupada")){
                 JOptionPane.showMessageDialog(null, "La cama número "+ numeroCama+ " se encuentra ocupada.");
        }        
        else {
            pacientesCamas = controladorPacientes_Camas.consultarAsignacion(cedula);
            if(pacientesCamas == null){
                 JOptionPane.showMessageDialog(null, "El paciente se encuentra registrado en la cama número "+ pacientesCamas.getNumero_cama() + ".");
            }
            else {
                int numFilas = controladorPacientes_Camas.asignarCama(cedula, numeroCama);
            
            switch (numFilas) {
                case 3:
                    JOptionPane.showMessageDialog(null, "El evento que ingresó no existe.");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra pre-inscrito en este evento" + "\n" +
                            "Debe proceder a pagar para quedar inscrito.");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra inscrito en este evento");
                    break;
                case 2:
                case 5:
                    int cuposActuales = Integer.parseInt(evento.getCupos()) - 1;         
                    controladorEvento.actualizarCupos(codigoEvento, Integer.toString(cuposActuales));
                    JOptionPane.showMessageDialog(null, "La inscripción se ha realizado exitosamente.");
                    evento = controladorEvento.consultarDatosEvento(codigoEvento);
                    nombreEventoEditar.setText(evento.getNombre_evento());
                    precioLabelEditar.setText(evento.getPrecio());
                    
                    int opcion = 5;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea imprimir un recibo?",
                            "Imprimir recibo", JOptionPane.OK_CANCEL_OPTION);
                    if(opcion == 0){
                        id_participante = ced;
                        dinero.setVisible(true);
                        dinero.grabFocus();
                        dinero.requestFocus();
                        dineroLabel.setVisible(true);
                        cambioLabel.setVisible(true);
                        cambioLabelEditar.setVisible(true);
                        continuarBoton.setVisible(true);
                        botonAceptar.setEnabled(false);
                        
                    }
                    else{
                        numeroCamaText.setText(null);
                        segundoNombre.setText(null);
                        primerApellido.setText(null);
                        segundoApellido.setText(null);
                        cedula.setText(null);
                        telefono.setText(null);
                        correo.setText(null);
                        banderaAceptar = 0;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al realizar la inscripción.");
                    break;
            }
            
        }
            
        }*/
    }
    

    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
      asignarCama();
     
    }//GEN-LAST:event_botonAceptarActionPerformed
    
 
        

    private void cedulaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTextKeyPressed
    
    }//GEN-LAST:event_cedulaTextKeyPressed

    private void fechaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaTextKeyPressed
      
    }//GEN-LAST:event_fechaTextKeyPressed

    private void botonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAceptarKeyPressed
      
    }//GEN-LAST:event_botonAceptarKeyPressed

    private void numeroCamaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroCamaTextKeyPressed
    
    }//GEN-LAST:event_numeroCamaTextKeyPressed

    private void numeroCamaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCamaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCamaTextActionPerformed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_AsignarCama().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel cambioLabelEditar;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JLabel fechaLabel;
    private com.toedter.calendar.JDateChooser fechaText;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreEventoEditar;
    private javax.swing.JTextField numeroCamaText;
    private javax.swing.JLabel precioLabelEditar;
    private javax.swing.JLabel primerNombreLabel;
    // End of variables declaration//GEN-END:variables

    
    
}