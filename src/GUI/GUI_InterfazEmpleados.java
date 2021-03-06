package GUI;

public class GUI_InterfazEmpleados extends javax.swing.JFrame {
    
    public GUI_InterfazEmpleados(){
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        modificarEmpleadoLabel = new javax.swing.JLabel();
        administradorLabel = new javax.swing.JLabel();
        crearEnfermeraLabel = new javax.swing.JLabel();
        modificarEmpleado = new javax.swing.JButton();
        registrarEnfermera = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JLabel();
        administradorLabel2 = new javax.swing.JLabel();
        bienvenidoLabel = new javax.swing.JLabel();
        crearMedicoLabel = new javax.swing.JLabel();
        registrarMedico = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        modificarEmpleadoLabel.setBackground(new java.awt.Color(255, 255, 255));
        modificarEmpleadoLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        modificarEmpleadoLabel.setForeground(new java.awt.Color(108, 101, 247));
        modificarEmpleadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarEmpleadoLabel.setText("<html><body> <center>  Modificar<br>Empleado </center></body></html>");
        jPanel1.add(modificarEmpleadoLabel);
        modificarEmpleadoLabel.setBounds(410, 250, 140, 90);

        administradorLabel.setBackground(new java.awt.Color(255, 255, 255));
        administradorLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        administradorLabel.setForeground(new java.awt.Color(255, 255, 255));
        administradorLabel.setText("Empleados");
        jPanel1.add(administradorLabel);
        administradorLabel.setBounds(140, 50, 200, 50);

        crearEnfermeraLabel.setBackground(new java.awt.Color(255, 255, 255));
        crearEnfermeraLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        crearEnfermeraLabel.setForeground(new java.awt.Color(108, 101, 247));
        crearEnfermeraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearEnfermeraLabel.setText("<html><body> <center>  Registrar<br>Enfermera </center></body></html>");
        jPanel1.add(crearEnfermeraLabel);
        crearEnfermeraLabel.setBounds(238, 250, 150, 90);

        modificarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        modificarEmpleado.setBorder(null);
        modificarEmpleado.setBorderPainted(false);
        modificarEmpleado.setContentAreaFilled(false);
        modificarEmpleado.setFocusPainted(false);
        modificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(modificarEmpleado);
        modificarEmpleado.setBounds(400, 240, 160, 110);

        registrarEnfermera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        registrarEnfermera.setBorder(null);
        registrarEnfermera.setBorderPainted(false);
        registrarEnfermera.setContentAreaFilled(false);
        registrarEnfermera.setFocusPainted(false);
        registrarEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEnfermeraActionPerformed(evt);
            }
        });
        jPanel1.add(registrarEnfermera);
        registrarEnfermera.setBounds(230, 240, 160, 110);

        CerrarSesion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(CerrarSesion);
        CerrarSesion.setBounds(610, 60, 120, 30);

        administradorLabel2.setBackground(new java.awt.Color(255, 255, 255));
        administradorLabel2.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        administradorLabel2.setForeground(new java.awt.Color(255, 255, 255));
        administradorLabel2.setText("Administrador");
        jPanel1.add(administradorLabel2);
        administradorLabel2.setBounds(40, 280, 200, 50);

        bienvenidoLabel.setBackground(new java.awt.Color(255, 255, 255));
        bienvenidoLabel.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        bienvenidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        bienvenidoLabel.setText("  Bienvenido ");
        jPanel1.add(bienvenidoLabel);
        bienvenidoLabel.setBounds(40, 240, 200, 50);

        crearMedicoLabel.setBackground(new java.awt.Color(255, 255, 255));
        crearMedicoLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        crearMedicoLabel.setForeground(new java.awt.Color(108, 101, 247));
        crearMedicoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearMedicoLabel.setText("<html><body> <center>  Registrar<br>Medico </center></body></html>");
        jPanel1.add(crearMedicoLabel);
        crearMedicoLabel.setBounds(580, 250, 140, 90);

        registrarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        registrarMedico.setBorder(null);
        registrarMedico.setBorderPainted(false);
        registrarMedico.setContentAreaFilled(false);
        registrarMedico.setFocusPainted(false);
        registrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(registrarMedico);
        registrarMedico.setBounds(570, 240, 160, 110);

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
        botonCancelar.setBounds(610, 400, 130, 70);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAdministrador1.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 760, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void registrarEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEnfermeraActionPerformed
        
        GUI_CrearEnfermera interfazCrearEnfermera = new GUI_CrearEnfermera();
        interfazCrearEnfermera.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarEnfermeraActionPerformed
  
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Login interfazLogin = new GUI_Login();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
    
    private void modificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEmpleadoActionPerformed
        
        GUI_ModificarEmpleado interfazModificarEmpleado = new GUI_ModificarEmpleado();
        interfazModificarEmpleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarEmpleadoActionPerformed

    private void registrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMedicoActionPerformed
        // TODO add your handling code here:
        GUI_CrearMedico interfazCrearMedico = new GUI_CrearMedico();
        interfazCrearMedico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarMedicoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        GUI_Administrador adminLogin = new GUI_Administrador();
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    public static void main(String args[]){
       
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_InterfazEmpleados().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel administradorLabel;
    private javax.swing.JLabel administradorLabel2;
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel crearEnfermeraLabel;
    private javax.swing.JLabel crearMedicoLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarEmpleado;
    private javax.swing.JLabel modificarEmpleadoLabel;
    private javax.swing.JButton registrarEnfermera;
    private javax.swing.JButton registrarMedico;
    // End of variables declaration//GEN-END:variables
}