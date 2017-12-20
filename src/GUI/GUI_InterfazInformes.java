package GUI;

public class GUI_InterfazInformes extends javax.swing.JFrame {

    private String tipo;
    
    public GUI_InterfazInformes(){
        
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
        agendaLabel = new javax.swing.JLabel();
        agendaBoton = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        agendaLabel1 = new javax.swing.JLabel();
        listaEmpleadosBoton = new javax.swing.JButton();
        agendaLabel2 = new javax.swing.JLabel();
        historiaBoton = new javax.swing.JButton();
        agendaLabel3 = new javax.swing.JLabel();
        citasBoton = new javax.swing.JButton();
        agendaLabel4 = new javax.swing.JLabel();
        costosBoton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        administradorLabel.setBackground(new java.awt.Color(255, 255, 255));
        administradorLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        administradorLabel.setForeground(new java.awt.Color(255, 255, 255));
        administradorLabel.setText("Informes");
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

        agendaLabel.setBackground(new java.awt.Color(255, 255, 255));
        agendaLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        agendaLabel.setForeground(new java.awt.Color(108, 101, 247));
        agendaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaLabel.setText("<html><body> <center> Agenda </br> Medicos</center></body></html>");
        jPanel1.add(agendaLabel);
        agendaLabel.setBounds(240, 180, 140, 90);

        agendaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        agendaBoton.setBorder(null);
        agendaBoton.setBorderPainted(false);
        agendaBoton.setContentAreaFilled(false);
        agendaBoton.setFocusPainted(false);
        agendaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaBotonActionPerformed(evt);
            }
        });
        jPanel1.add(agendaBoton);
        agendaBoton.setBounds(230, 170, 160, 110);

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

        agendaLabel1.setBackground(new java.awt.Color(255, 255, 255));
        agendaLabel1.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        agendaLabel1.setForeground(new java.awt.Color(108, 101, 247));
        agendaLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaLabel1.setText("<html><body> <center> Lista de</br> Empleados</center></body></html>");
        jPanel1.add(agendaLabel1);
        agendaLabel1.setBounds(410, 180, 140, 90);

        listaEmpleadosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        listaEmpleadosBoton.setBorder(null);
        listaEmpleadosBoton.setBorderPainted(false);
        listaEmpleadosBoton.setContentAreaFilled(false);
        listaEmpleadosBoton.setFocusPainted(false);
        listaEmpleadosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEmpleadosBotonActionPerformed(evt);
            }
        });
        jPanel1.add(listaEmpleadosBoton);
        listaEmpleadosBoton.setBounds(400, 170, 160, 110);

        agendaLabel2.setBackground(new java.awt.Color(255, 255, 255));
        agendaLabel2.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        agendaLabel2.setForeground(new java.awt.Color(108, 101, 247));
        agendaLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaLabel2.setText("<html><body> <center> Historias</br> Clinicas</center></body></html>");
        jPanel1.add(agendaLabel2);
        agendaLabel2.setBounds(580, 180, 140, 90);

        historiaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        historiaBoton.setBorder(null);
        historiaBoton.setBorderPainted(false);
        historiaBoton.setContentAreaFilled(false);
        historiaBoton.setFocusPainted(false);
        historiaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaBotonActionPerformed(evt);
            }
        });
        jPanel1.add(historiaBoton);
        historiaBoton.setBounds(570, 170, 160, 110);

        agendaLabel3.setBackground(new java.awt.Color(255, 255, 255));
        agendaLabel3.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        agendaLabel3.setForeground(new java.awt.Color(108, 101, 247));
        agendaLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaLabel3.setText("<html><body> <center> Citas</br> Medico</center></body></html>");
        jPanel1.add(agendaLabel3);
        agendaLabel3.setBounds(320, 310, 140, 90);

        citasBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        citasBoton.setBorder(null);
        citasBoton.setBorderPainted(false);
        citasBoton.setContentAreaFilled(false);
        citasBoton.setFocusPainted(false);
        citasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citasBotonActionPerformed(evt);
            }
        });
        jPanel1.add(citasBoton);
        citasBoton.setBounds(310, 300, 160, 110);

        agendaLabel4.setBackground(new java.awt.Color(255, 255, 255));
        agendaLabel4.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        agendaLabel4.setForeground(new java.awt.Color(108, 101, 247));
        agendaLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaLabel4.setText("<html><body> <center> Costos</br> Promedio</center></body></html>");
        jPanel1.add(agendaLabel4);
        agendaLabel4.setBounds(520, 310, 140, 90);

        costosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        costosBoton.setBorder(null);
        costosBoton.setBorderPainted(false);
        costosBoton.setContentAreaFilled(false);
        costosBoton.setFocusPainted(false);
        costosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costosBotonActionPerformed(evt);
            }
        });
        jPanel1.add(costosBoton);
        costosBoton.setBounds(510, 300, 160, 110);

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
    
    private void agendaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaBotonActionPerformed
        GUI_Agenda agenda = new GUI_Agenda(tipo);
        agenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agendaBotonActionPerformed

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

    private void listaEmpleadosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEmpleadosBotonActionPerformed
        GUI_ListaEmpleados lista = new GUI_ListaEmpleados();
        lista.setTipo(this.tipo);
        lista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaEmpleadosBotonActionPerformed

    private void historiaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaBotonActionPerformed
        // TODO add your handling code here:
        GUI_HistoriaClinica citas = new GUI_HistoriaClinica();
        citas.setTipo("Administrador");
        citas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_historiaBotonActionPerformed

    private void citasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citasBotonActionPerformed
        // TODO add your handling code here:
        GUI_CitasMes citas = new GUI_CitasMes();
        citas.setTipo(this.tipo);
        citas.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_citasBotonActionPerformed

    private void costosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costosBotonActionPerformed
         GUI_GastosPaciente citas = new GUI_GastosPaciente();
         citas.setTipo(this.tipo);
        citas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_costosBotonActionPerformed
    
    public static void main(String args[]){
       
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_InterfazInformes().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel administradorLabel;
    private javax.swing.JLabel administradorLabel2;
    private javax.swing.JButton agendaBoton;
    private javax.swing.JLabel agendaLabel;
    private javax.swing.JLabel agendaLabel1;
    private javax.swing.JLabel agendaLabel2;
    private javax.swing.JLabel agendaLabel3;
    private javax.swing.JLabel agendaLabel4;
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton citasBoton;
    private javax.swing.JButton costosBoton;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton historiaBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listaEmpleadosBoton;
    // End of variables declaration//GEN-END:variables

    void setTipo(String administrador) {
        this.tipo = administrador;
    }
}