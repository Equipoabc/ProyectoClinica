package GUI;
import Controladores.*;
import Logica.*;
import javax.swing.JOptionPane;

public class GUI_ModificarPaciente extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorPaciente controladorPaciente;
    Paciente paciente;
    String tipo;
    
    public GUI_ModificarPaciente() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        tipo = "";
        controladorPaciente = new ControladorPaciente();
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
    }
    
    public void setTipo(String tipo){
        
        this.tipo = tipo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        direc = new javax.swing.JTextField();
        primerNombreLabel8 = new javax.swing.JLabel();
        num_seguro = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel4 = new javax.swing.JLabel();
        actividad = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        nom = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        primerNombreLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Paciente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 250, 50);

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
        botonCancelar.setBounds(370, 370, 190, 80);

        direc.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        direc.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(direc);
        direc.setBounds(410, 240, 180, 25);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel8.setText("Dirección:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(330, 240, 70, 20);

        num_seguro.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        num_seguro.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(num_seguro);
        num_seguro.setBounds(410, 320, 180, 25);

        tel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(410, 280, 180, 25);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Teléfono:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(330, 280, 60, 30);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel4.setText("Ingresar Cédula:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(90, 180, 100, 40);

        actividad.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        actividad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(actividad);
        actividad.setBounds(410, 200, 180, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Actividad economica:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(270, 200, 130, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(340, 160, 60, 30);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(70, 220, 150, 25);

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

        nom.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        nom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nom);
        nom.setBounds(410, 160, 180, 25);

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

        primerNombreLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel10.setText("Numero de seguro:");
        jPanel1.add(primerNombreLabel10);
        primerNombreLabel10.setBounds(281, 320, 109, 20);

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 750, 500);

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
        
        GUI_InterfazPacientes operador = new GUI_InterfazPacientes();
            operador.setTipo(tipo);
            operador.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
    }//GEN-LAST:event_telActionPerformed
    
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        
        String cedula = consultarLabel.getText();
        
        if (cedula.equals("")){       
            
            JOptionPane.showMessageDialog(null, "El campo cedula de la consulta esta vacio.");
        } 
        else if (!validaciones.validarNumero(cedula)){
            
            JOptionPane.showMessageDialog(null, "El campo cedula de la consulta debe ser numerico.");
        } 
        else {
            
            paciente = controladorPaciente.consultarDatosPaciente(cedula);
            
            if (paciente != null){
                botonAceptar.setEnabled(true);
                nom.setText(paciente.getNombre_paciente());
                actividad.setText(paciente.getActividad_economica());
                direc.setText(paciente.getDireccion());
                tel.setText(paciente.getTelefono());
                num_seguro.setText(paciente.getNumero_seguro());
            }
            else {
                
                JOptionPane.showMessageDialog(null, "El paciente no existe.");                
                nom.setText(null);
                actividad.setText(null);
                tel.setText(null);
                num_seguro.setText(null);
                direc.setText(null);
            }
        }
    }//GEN-LAST:event_botonConsultarActionPerformed
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        botonAceptar.setEnabled(false);
        String cedulaBusqueda, nombre, direccion, telefono, act, numero;  
        
        nombre = nom.getText();
        telefono = tel.getText();
        numero = num_seguro.getText();
        direccion = direc.getText();
        act = actividad.getText();        
        cedulaBusqueda = consultarLabel.getText();
        
        if (nombre.equals("") || telefono.equals("") ||  numero.equals("")){            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarLetrasEspacios(nombre) || !validaciones.validarLetrasEspacios(act)) {
            JOptionPane.showMessageDialog(null, "Los campos nombre y actividad economica deben ser de solo letras y espacios.");
        } else if ( !validaciones.validarNumero(telefono) || !validaciones.validarNumero(cedulaBusqueda) || !validaciones.validarNumero(numero)) {
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y numero de seguro deben ser de solo numeros.");
        } else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(direccion)){
            JOptionPane.showMessageDialog(null, "El campo de direccion solo puede ser de letras, numeros, espacios y los caracteres '.' y '-'.");
        }
        else {
            
            if (controladorPaciente.comprobar(cedulaBusqueda) == 1){
                
                if (nombre.equals(paciente.getNombre_paciente()) && telefono.equals(paciente.getTelefono())
                        && act.equals(paciente.getActividad_economica()) && direccion.equals(paciente.getDireccion())
                        && numero.equals(paciente.getNumero_seguro())) {
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
                } 
                else {
                    
                    int resultado = controladorPaciente.actualizarPaciente(cedulaBusqueda, nombre, telefono, act, direccion, numero);
                                        
                    switch(resultado){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
                            consultarLabel.setText(null);
                            nom.setText(null);
                            actividad.setText(null);
                            tel.setText(null);
                            num_seguro.setText(null);
                            direc.setText(null);
                            botonAceptar.setEnabled(false);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el paciente.");
                            break;
                    }
                }
            }
            else {
                
                JOptionPane.showMessageDialog(null, "El paciente que quiere actualizar no existe.");
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUI_ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ModificarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI_ModificarPaciente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actividad;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JTextField direc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField num_seguro;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel10;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}