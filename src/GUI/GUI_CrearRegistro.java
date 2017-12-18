package GUI;
import Controladores.*;
import Logica.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;

public class GUI_CrearRegistro extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorRegistro controladorRegistro;
    String historia, cedula_medico;
    
    public GUI_CrearRegistro() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        historia = "";
        cedula_medico = "";
        controladorRegistro = new ControladorRegistro();
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
        SpinnerNumberModel modeloH = new SpinnerNumberModel(0, 0, 23, 1);
        SpinnerNumberModel modeloM = new SpinnerNumberModel(0, 0, 59, 1);
        hora.setModel(modeloH);
        minuto.setModel(modeloM);  
        ((JTextField) fecha.getDateEditor()).setEditable(false);
        fecha.setEnabled(false);
        fecha.setDate(GetDateNow());
    }

    public void setCedula_medico(String cedula_medico){
        
        this.cedula_medico = cedula_medico;
    }
    
    private Date GetDateNow(){
        
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel4 = new javax.swing.JLabel();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        cedulaBuscar = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        primerNombreLabel7 = new javax.swing.JLabel();
        primerNombreLabel9 = new javax.swing.JLabel();
        hora = new javax.swing.JSpinner();
        minuto = new javax.swing.JSpinner();
        formula = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nuevo Registro");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 250, 50);

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
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
        botonCancelar.setBounds(540, 360, 190, 80);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Agregar causas:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(300, 240, 110, 30);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel4.setText("Ingresar Cédula:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(90, 180, 100, 40);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Hora:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(340, 200, 50, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Fecha:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(340, 160, 60, 30);

        cedulaBuscar.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedulaBuscar.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedulaBuscar);
        cedulaBuscar.setBounds(70, 220, 150, 25);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
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
        botonConsultar.setBounds(60, 250, 160, 70);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
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
        botonAceptar.setBounds(240, 380, 160, 60);

        titulo.setText("Historia clinica");
        jPanel1.add(titulo);
        titulo.setBounds(340, 120, 340, 30);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1514786511000L));
        fecha.setMinSelectableDate(new java.util.Date(-1577901489000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel1.add(fecha);
        fecha.setBounds(410, 160, 180, 20);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel7.setText("Hora");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(480, 200, 50, 30);

        primerNombreLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel9.setText("Minuto");
        jPanel1.add(primerNombreLabel9);
        primerNombreLabel9.setBounds(590, 200, 80, 30);

        hora.setAutoscrolls(true);
        jPanel1.add(hora);
        hora.setBounds(420, 200, 50, 30);
        jPanel1.add(minuto);
        minuto.setBounds(520, 200, 60, 30);

        formula.setText("Agregar formula medica");
        jPanel1.add(formula);
        formula.setBounds(400, 390, 150, 23);

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 500);

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

        GUI_Medico medico = new GUI_Medico();
        medico.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_botonCancelarActionPerformed
        
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        String cedula = cedulaBuscar.getText();
        
        if (cedula.equals("")){       
            
            JOptionPane.showMessageDialog(null, "El campo cedula de la consulta esta vacio.");
        } 
        else if (!validaciones.validarNumero(cedula)){
            
            JOptionPane.showMessageDialog(null, "El campo cedula de la consulta debe ser numerico.");
        } 
        else {
            
            ControladorPaciente controladorPaciente = new ControladorPaciente();
            Paciente paciente = controladorPaciente.consultarDatosPaciente(cedula);
            
            if (paciente != null){
                
                botonAceptar.setEnabled(true);
                botonConsultar.setEnabled(false);
                ControladorHistoria_clinica controladorHistoria_clinica = new ControladorHistoria_clinica();
                historia = controladorHistoria_clinica.consultarNumero(cedula);
                titulo.setText("Historia clinica: " + historia + "| Paciente: " + paciente.getNombre_paciente());
            }
            else {
                
                JOptionPane.showMessageDialog(null, "El paciente no existe.");
                titulo.setText("Historia clinica");
                fecha.setDate(null);
                hora.setValue(0);
                minuto.setValue(0);
            }
        }
    }//GEN-LAST:event_botonConsultarActionPerformed
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        botonAceptar.setEnabled(false);
        String cedula, fech, hor;
        
        cedula = cedulaBuscar.getText();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
        fech = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        LocalDate.parse(fech, fmt);
        hor = hora.getValue() + ":" + minuto.getValue();
        
        if (cedula.equals("")){            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else {
            
            int resultado = controladorRegistro.crearRegistro(historia, fech, hor, cedula_medico);
                
            switch(resultado){                    
                case 1:
                    JOptionPane.showMessageDialog(null, "Registro creado exitosamente.");
                    hora.setValue(0);
                    minuto.setValue(0);
                    titulo.setText("Historia clinica");
                    fecha.setDate(null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrió un problema al crear el registro.");
                    break;
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
    }//GEN-LAST:event_fechaKeyPressed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI_CrearRegistro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JTextField cedulaBuscar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton formula;
    private javax.swing.JSpinner hora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner minuto;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel7;
    private javax.swing.JLabel primerNombreLabel9;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}