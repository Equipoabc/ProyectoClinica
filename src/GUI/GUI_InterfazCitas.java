package GUI;

public class GUI_InterfazCitas extends javax.swing.JFrame {

    private String tipo;
    
    public GUI_InterfazCitas(){
        
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
        administradorLabel = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        administradorLabel2 = new javax.swing.JLabel();
        bienvenidoLabel = new javax.swing.JLabel();
        modificarCitaLabel = new javax.swing.JLabel();
        modificarCita = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        citaLabel = new javax.swing.JLabel();
        citaBoton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        administradorLabel.setBackground(new java.awt.Color(255, 255, 255));
        administradorLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        administradorLabel.setForeground(new java.awt.Color(255, 255, 255));
        administradorLabel.setText("Citas");
        jPanel1.add(administradorLabel);
        administradorLabel.setBounds(140, 50, 200, 50);

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

        modificarCitaLabel.setBackground(new java.awt.Color(255, 255, 255));
        modificarCitaLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        modificarCitaLabel.setForeground(new java.awt.Color(108, 101, 247));
        modificarCitaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarCitaLabel.setText("<html><body> <center>  Modificar<br>Cita </center></body></html>");
        jPanel1.add(modificarCitaLabel);
        modificarCitaLabel.setBounds(500, 250, 140, 90);

        modificarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        modificarCita.setBorder(null);
        modificarCita.setBorderPainted(false);
        modificarCita.setContentAreaFilled(false);
        modificarCita.setFocusPainted(false);
        modificarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(modificarCita);
        modificarCita.setBounds(490, 240, 160, 110);

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

        citaLabel.setBackground(new java.awt.Color(255, 255, 255));
        citaLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        citaLabel.setForeground(new java.awt.Color(108, 101, 247));
        citaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citaLabel.setText("<html><body> <center>  Programar</br> Cita </center></body></html>");
        jPanel1.add(citaLabel);
        citaLabel.setBounds(280, 250, 140, 90);

        citaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        citaBoton.setBorder(null);
        citaBoton.setBorderPainted(false);
        citaBoton.setContentAreaFilled(false);
        citaBoton.setFocusPainted(false);
        citaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citaBotonActionPerformed(evt);
            }
        });
        jPanel1.add(citaBoton);
        citaBoton.setBounds(270, 240, 160, 110);

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
          
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Login interfazLogin = new GUI_Login();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
    
    private void modificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCitaActionPerformed
        GUI_ModificarCita interfazModificarCita = new GUI_ModificarCita();
        interfazModificarCita.setTipo(this.tipo);
        interfazModificarCita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarCitaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        if (tipo.equals("Operador")){
            GUI_Operador operador = new GUI_Operador();
            operador.setVisible(true);
            this.dispose();
        }
        else if(tipo.equals("Administrador")){
            GUI_Administrador adminLogin = new GUI_Administrador();
            adminLogin.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void citaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citaBotonActionPerformed
        GUI_ProgramarCita interfazModificarCita = new GUI_ProgramarCita();
        interfazModificarCita.setTipo(this.tipo);
        interfazModificarCita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_citaBotonActionPerformed
    
    public static void main(String args[]){
       
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_InterfazCitas().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel administradorLabel;
    private javax.swing.JLabel administradorLabel2;
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton citaBoton;
    private javax.swing.JLabel citaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarCita;
    private javax.swing.JLabel modificarCitaLabel;
    // End of variables declaration//GEN-END:variables

    void setTipo(String administrador) {
        this.tipo = administrador;
    }
}