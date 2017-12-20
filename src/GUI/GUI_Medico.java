package GUI;
import Controladores.ControladorMedico;
import Logica.Medico;

public class GUI_Medico extends javax.swing.JFrame {
    
    String id;
    
    public GUI_Medico(){
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bienvenidoLabel = new javax.swing.JLabel();
        nombreMedico = new javax.swing.JLabel();
        agendaLabel = new javax.swing.JLabel();
        MedicoLabel = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JLabel();
        Agenda = new javax.swing.JButton();
        historiaLabel = new javax.swing.JLabel();
        historiaBoton = new javax.swing.JButton();
        registroLabel = new javax.swing.JLabel();
        registroBoton = new javax.swing.JButton();
        inscribirLabel = new javax.swing.JLabel();
        inscribirBoton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        bienvenidoLabel.setBackground(new java.awt.Color(255, 255, 255));
        bienvenidoLabel.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        bienvenidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        bienvenidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenidoLabel.setText("  Bienvenido(a) ");
        jPanel1.add(bienvenidoLabel);
        bienvenidoLabel.setBounds(10, 240, 200, 50);

        nombreMedico.setBackground(new java.awt.Color(255, 255, 255));
        nombreMedico.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        nombreMedico.setForeground(new java.awt.Color(255, 255, 255));
        nombreMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nombreMedico);
        nombreMedico.setBounds(20, 280, 190, 50);

        agendaLabel.setBackground(new java.awt.Color(255, 255, 255));
        agendaLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        agendaLabel.setForeground(new java.awt.Color(108, 101, 247));
        agendaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendaLabel.setText("<html><body> <center>  Agenda</center></body></html>");
        jPanel1.add(agendaLabel);
        agendaLabel.setBounds(240, 180, 140, 90);

        MedicoLabel.setBackground(new java.awt.Color(255, 255, 255));
        MedicoLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        MedicoLabel.setForeground(new java.awt.Color(255, 255, 255));
        MedicoLabel.setText("Medico");
        jPanel1.add(MedicoLabel);
        MedicoLabel.setBounds(140, 40, 200, 50);

        CerrarSesion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(CerrarSesion);
        CerrarSesion.setBounds(610, 40, 120, 50);

        Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        Agenda.setBorder(null);
        Agenda.setBorderPainted(false);
        Agenda.setContentAreaFilled(false);
        Agenda.setFocusPainted(false);
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        jPanel1.add(Agenda);
        Agenda.setBounds(220, 170, 180, 110);

        historiaLabel.setBackground(new java.awt.Color(255, 255, 255));
        historiaLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        historiaLabel.setForeground(new java.awt.Color(108, 101, 247));
        historiaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historiaLabel.setText("<html><body> <center> Historias</br> Clinicas</center></body></html>");
        jPanel1.add(historiaLabel);
        historiaLabel.setBounds(410, 180, 140, 90);

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
        historiaBoton.setBounds(400, 170, 160, 110);

        registroLabel.setBackground(new java.awt.Color(255, 255, 255));
        registroLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        registroLabel.setForeground(new java.awt.Color(108, 101, 247));
        registroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registroLabel.setText("<html><body> <center> Crear</br> Registro</center></body></html>");
        jPanel1.add(registroLabel);
        registroLabel.setBounds(240, 310, 140, 90);

        registroBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        registroBoton.setBorder(null);
        registroBoton.setBorderPainted(false);
        registroBoton.setContentAreaFilled(false);
        registroBoton.setFocusPainted(false);
        registroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroBotonActionPerformed(evt);
            }
        });
        jPanel1.add(registroBoton);
        registroBoton.setBounds(230, 300, 160, 110);

        inscribirLabel.setBackground(new java.awt.Color(255, 255, 255));
        inscribirLabel.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        inscribirLabel.setForeground(new java.awt.Color(108, 101, 247));
        inscribirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inscribirLabel.setText("<html><body> <center> Inscribir</br> Participante</center></body></html>");
        jPanel1.add(inscribirLabel);
        inscribirLabel.setBounds(410, 310, 140, 90);

        inscribirBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        inscribirBoton.setBorder(null);
        inscribirBoton.setBorderPainted(false);
        inscribirBoton.setContentAreaFilled(false);
        inscribirBoton.setFocusPainted(false);
        inscribirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirBotonActionPerformed(evt);
            }
        });
        jPanel1.add(inscribirBoton);
        inscribirBoton.setBounds(400, 300, 160, 110);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAdministrador1.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setId(String id) {
        this.id = id;
    }
            
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Login interfazLogin = new GUI_Login();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
        
    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        
        GUI_Agenda agenda = new GUI_Agenda(this.id);
        agenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgendaActionPerformed

    private void historiaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historiaBotonActionPerformed

    private void registroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroBotonActionPerformed

        GUI_CrearRegistro interfaz = new GUI_CrearRegistro();
        interfaz.setCedula_medico(id);
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registroBotonActionPerformed

    private void inscribirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirBotonActionPerformed
        GUI_InscribirCampana i = new GUI_InscribirCampana();
        i.setTipo(id);
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inscribirBotonActionPerformed

    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Medico().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agenda;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel MedicoLabel;
    private javax.swing.JLabel agendaLabel;
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton historiaBoton;
    private javax.swing.JLabel historiaLabel;
    private javax.swing.JButton inscribirBoton;
    private javax.swing.JLabel inscribirLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreMedico;
    private javax.swing.JButton registroBoton;
    private javax.swing.JLabel registroLabel;
    // End of variables declaration//GEN-END:variables
}